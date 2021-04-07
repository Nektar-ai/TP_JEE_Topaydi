package fr.epsi.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Login.jsp ").forward(req, resp);
    }

//	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
//	        throws ServletException, IOException
//	{
//		String login = req.getParameter("loginuser");
//		String pass = req.getParameter("passuser");
//		System.out.println("DATA RECEIVED IN LOGIN SERVLET ! : login : "+login+" pass : "+pass);
//	}
	
//	RequestDispatcher dispatcher;
	
}
