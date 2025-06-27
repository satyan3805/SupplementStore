package com.sat.tmf.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sat.tmf.store.entities.User;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/testService")
	public String testService() {
		System.out.println("this is a test servie");
		return "test";
	}
	
	@RequestMapping("/login")
	public String showLogin(Model m) {
		m.addAttribute("user", new User());
		System.out.println("this is a show login servie");
		return "login";
	}

	//@RequestMapping(path = "/authUser",method = RequestMethod.GET)
	@RequestMapping("/authUser")
	public String authenticateUser(@RequestParam("userName") String userName, @RequestParam("password") String password, Model m){
		User authUser = null;
		if(userName.equals("admin") && password.equals("admin")) {
			User loggedinUser = new User();
			loggedinUser.setFirstName("Admin");
			loggedinUser.setLastName("Admin");
			loggedinUser.setRole("ADMIN");
						
			m.addAttribute("userObj", loggedinUser);
			// getAlProductList(); //TO-DO
			//m.addAttribute("productList",)
			return "dashboard";
		}
		
		return "login";
		
	}
}
