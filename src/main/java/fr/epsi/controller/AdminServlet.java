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
    	List<User> usersVal = service.getValidatedUsers();
    	List<User> usersDeac = service.getDeactivatedUsers();
    	req.setAttribute("listUsers", users);
    	req.setAttribute("listValUsers", usersVal);
    	req.setAttribute("listDeacUsers", usersDeac);
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/AdminUserValidation.jsp").forward(req, resp);	
    }
    
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
        if (req.getParameter("validate") != null) {
        	User u = service.getUserByName((String)req.getParameter("nickname"));
        	u.setValidated(true);
        	service.updateUser(u);        	
        } else if (req.getParameter("deactivate") != null) {
        	User u = service.getUserByName((String)req.getParameter("nickname"));
        	u.setActive(false);
        	service.updateUser(u);        	
        } else if (req.getParameter("delete") != null) {
        	User u = service.getUserByName((String)req.getParameter("nickname"));
        	service.deleteUser(u);                
        } else if (req.getParameter("activate") != null) {
        	User u = service.getUserByName((String)req.getParameter("nickname"));
        	u.setActive(true);
        	service.updateUser(u);             
        } else {        	
            System.out.println("Error..");
            this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Login.jsp").forward(req, resp);
        }
        doGet(req, resp);    	
	}
}
