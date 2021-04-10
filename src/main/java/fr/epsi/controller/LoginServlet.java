package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.epsi.entity.User;
import fr.epsi.service.UserService;

@WebServlet("/")
public class LoginServlet extends HttpServlet {

	@EJB
	private UserService service;
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Login.jsp").forward(req, resp);
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
    	User uDB = service.getUserByName(req.getParameter("nickname"));
    	
    	if (uDB.getNickname() == null)
    	{
    		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/pages/Register.jsp");
        	dispatcher.forward(req, resp);
    	} else if (req.getParameter("password").equals(uDB.getPassword()) & uDB.isActive() == true ) {
    		HttpSession userSession = req.getSession();
        	userSession.setAttribute("user", uDB);
    		if (uDB.isAdmin() == true)
    		{
    			resp.sendRedirect(req.getContextPath() + "/admin");
    		}
    		resp.sendRedirect(req.getContextPath() + "/home");
    	} else {
    		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/pages/ErrorLogin.jsp");
        	dispatcher.forward(req, resp);
    	}
	}
}
