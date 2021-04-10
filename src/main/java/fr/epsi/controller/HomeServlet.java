package fr.epsi.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entity.Idea;
import fr.epsi.entity.User;
import fr.epsi.service.IdeaService;
import fr.epsi.service.UserService;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	
	@EJB
	private IdeaService service;
	
	@EJB
	private UserService serviceU;
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
    	List<Idea> tops = service.getAllIdeas();
    	List<Idea> top3 = new ArrayList<Idea>();
    	List<Idea> buzz3 = new ArrayList<Idea>();
		req.setAttribute("listTops", top3);
		
		List<User> brains = serviceU.getBrainsIdeas();
		for (User u : brains)
		{
			System.out.println("USER BRAIN ! :"+u.getNickname());
		}
		req.setAttribute("listBrains", brains);
		
		List<Idea> buzz = service.getBuzzIdeas();
    	for (int i = 0; i < 3 ; i++)
    	{
    		top3.add(tops.get(i));
    		buzz3.add(buzz.get(i));
    	}	
		req.setAttribute("listBuzz", buzz3);		
				
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Home.jsp").forward(req, resp);
    }
}
