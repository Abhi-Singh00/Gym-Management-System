package com.gym.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

	@RequestMapping("/login")
	public String getLoginForm() {
		return "views/login.jsp" ;
	}
	
	@RequestMapping(value="/login_action", method = RequestMethod.POST)
	public void check(
			
			@RequestParam("username") String unm,
			@RequestParam("password") String pwd,
			
			HttpServletRequest req, 
			HttpServletResponse res) throws IOException{
		
		

		if(unm.equals("admin")&&pwd.contentEquals("abhi123456")) {
			req.getSession().setAttribute("username", unm);
			
			res.sendRedirect("dashboard");}
		else {
			res.sendRedirect("login");
	}
	}
		@RequestMapping("/logout")
		public void getLogout(HttpServletRequest req,HttpServletResponse res) throws IOException {
			req.getSession().invalidate();
			res.sendRedirect("login");
		}

}