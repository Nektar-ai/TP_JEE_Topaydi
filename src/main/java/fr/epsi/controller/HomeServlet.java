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
		List<User> brains = serviceU.getBrainsIdeas();
		List<User> brains3 = new ArrayList<User>();		
		List<Idea> buzz = service.getBuzzIdeas();
		List<Idea> buzz3 = new ArrayList<Idea>();
		List<Long> nbIdUsr = new ArrayList<Long>();
		
    	for (int i = 0; i < 3 ; i++)
    	{
    		top3.add(tops.get(i));
    		buzz3.add(buzz.get(i));
    		brains3.add(brains.get(i));
    	}    	
    	for (User u : brains3)
		{
			nbIdUsr.add(serviceU.getNbrIdeaCreated(u)); 
		}
    	
    	req.setAttribute("nb", nbIdUsr);
    	req.setAttribute("listBrains", brains3);
    	req.setAttribute("listTops", top3);
		req.setAttribute("listBuzz", buzz3);		
				
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Home.jsp").forward(req, resp);
    }
}
