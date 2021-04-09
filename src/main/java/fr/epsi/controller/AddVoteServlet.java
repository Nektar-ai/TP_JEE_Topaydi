package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.service.IdeaService;

@WebServlet("/addvote")
public class AddVoteServlet extends HttpServlet {
	
	@EJB
	private IdeaService service;
	
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
    	Long id = Long.parseLong(req.getParameter("id"));
    	
        if("Top".equals(req.getParameter("top"))){
            service.topVote(id);
        }
        else if("Flop".equals(req.getParameter("flop"))){
            service.flopVote(id);
        }
        
        resp.sendRedirect(req.getContextPath() + "/ideas");
    }
}
