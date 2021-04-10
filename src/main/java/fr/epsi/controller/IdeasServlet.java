package fr.epsi.controller;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entity.Idea;
import fr.epsi.service.IdeaService;

@WebServlet("/ideas")
public class IdeasServlet extends HttpServlet {
	
	@EJB
	private IdeaService service;
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
    	List<Idea> ideaz = service.getAllIdeas();
    	req.setAttribute("listeIdeas", ideaz);
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Ideas.jsp").forward(req, resp);	
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
        if (req.getParameter("newidea") != null) {
        	RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/pages/NewIdea.jsp");
        	dispatcher.forward(req, resp);
        }
        else if (req.getParameter("ideas") != null) {
        	service.createDummyIdea();
        	doGet(req, resp);
        } else {
            System.out.println("Error..");
        }
	}
}
