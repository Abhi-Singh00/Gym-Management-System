package com.gym.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.hibernate.query.Query;
import com.dao.gym;
import com.db.HibernateDatabaseConnection;

@Controller
public class GymController {
	
	@RequestMapping("/add_gym")
	public String getAddGymForm() {
		return "views/gym_add_form.jsp";
	}
	
	@RequestMapping("/add_gym_action")
	public void addGym(HttpServletResponse res , @ModelAttribute("gym") gym gm) throws IOException {
		
		Session session = null;
		session = HibernateDatabaseConnection.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
        session.save(gm);
	    t.commit();
	
		res.sendRedirect("dashboard");
		
	}
	
	@RequestMapping("/delete")
	public void deleteUser(HttpServletResponse res, @RequestParam("id") int id) throws IOException {
		
		Session session = null;
		session =HibernateDatabaseConnection.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
	
		gym gm = new gym();
		gm.setId(id);
		session.delete(gm);
		
		t.commit();
		res.sendRedirect("dashboard");
	
	}
	
	
	
	
	
	
	
}