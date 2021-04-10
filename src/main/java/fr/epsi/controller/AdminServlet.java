package fr.epsi.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entity.User;
import fr.epsi.service.UserService;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet{

	@EJB
	private UserService service;
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
    	List<User> users = service.getNotValidatedUsers();
//    	for (User u : users)
//    	{
//    		System.out.println("USER : "+u.getNickname());
//    	}
    	List<User> usersVal = service.getValidatedUsers();
    	req.setAttribute("listUsers", users);
    	req.setAttribute("listValUsers", usersVal);
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/AdminUserValidation.jsp").forward(req, resp);	
    }
    
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
    	User u = new User(req.getParameter("nickname"), req.getParameter("mail"), req.getParameter("password"));
    	service.createUser(u);
    	this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Login.jsp").forward(req, resp);
	}
	
}
