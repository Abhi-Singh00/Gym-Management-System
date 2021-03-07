package com.gym.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.gym;
import com.db.HibernateDatabaseConnection;

@Controller
public class DashboardControllers {

	@RequestMapping("/dashboard")
	public String loadDashboard(Model m,HttpServletRequest req,HttpServletResponse res) throws IOException  {
		String user = (String)req.getSession().getAttribute("username");
		
		
		if(user == null) {
			res.sendRedirect("login");
			
		}
		
		
		Session session = null;
		session = HibernateDatabaseConnection.getSessionFactory().openSession();
		Query query2 = session.createQuery("FROM gym");
		List gyms = query2.list();
		m.addAttribute("gyms_list", gyms);
		

		
		System.out.println("hi"); 
		return "views/dashboard.jsp";
	}
	
}