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

@WebServlet("/login")
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
    	User u = new User(req.getParameter("nickname"), req.getParameter("password"));

    	User uDB = service.getUserByName(req.getParameter("nickname"));
    	
    	System.out.println("User JSP Password : "+u.getPassword());
    	System.out.println("User Database Password : "+uDB.getPassword());
    	
    	if (uDB.getNickname() == null)
    	{
    		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/pages/Register.jsp");
        	dispatcher.forward(req, resp);
    	} else if (u.getPassword().equals(uDB.getPassword())) {
    		HttpSession userSession = req.getSession();
        	userSession.setAttribute("user", u);
    		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/pages/LoginSuccess.jsp");
        	dispatcher.forward(req, resp);
    	} else {
    		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/pages/ErrorLogin.jsp");
        	dispatcher.forward(req, resp);
    	}
    	
//    	service.createDummyUser(u);

	}
}
