package com.sat.tmf.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sat.tmf.store.entities.User;

@Controller
@RequestMapping("/signup")
public class SignUpController {
	
	@RequestMapping("/register")
	public String signUpForm(Model m) {
		m.addAttribute("user", new User());
		System.out.println("this is a test servie");
		return "register";
	}
	
	@RequestMapping("/testService")
	public String testService() {
		System.out.println("this is a test servie");
		return "test";
	}

	@PostMapping("/registerUser")
    public String processRegistrationForm(@ModelAttribute("user") User user) {
        
        System.out.println("User submitted: " + user.getFirstName() + " " + user.getLastName());
        return "login";
    }
}
