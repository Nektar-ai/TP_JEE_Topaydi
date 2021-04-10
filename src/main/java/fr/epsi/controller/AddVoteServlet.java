package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.epsi.entity.User;
import fr.epsi.service.IdeaService;

@WebServlet("/addvote")
public class AddVoteServlet extends HttpServlet {
	
	@EJB
	private IdeaService service;
	
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
    	Long id = Long.parseLong(req.getParameter("id"));
    	HttpSession userSession = req.getSession();
    	User u = (User)userSession.getAttribute("user") != null ? (User)userSession.getAttribute("user") : new User();    	
    	if("top".equals(req.getParameter("top")) & u.getNickname() != null) {
            service.topVote(id);
        }
        else if("flop".equals(req.getParameter("flop")) & u.getNickname() != null) {
            service.flopVote(id);
        }        
        resp.sendRedirect(req.getContextPath() + "/ideas");
    }
}
