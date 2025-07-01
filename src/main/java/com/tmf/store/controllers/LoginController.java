package com.tmf.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tmf.store.entites.User;
import com.tmf.store.repository.UserRepository;
import com.tmf.store.service.DashboardService;
import com.tmf.store.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	public LoginService loginService;
	
	@Autowired
	public DashboardService dashboardService;

//	@GetMapping("/auth")
//	public String authenticateUser(@RequestParam("email") String email, @RequestParam("password") String password) {
//		try {
//			Connection conn = DbConnection.getConnection();
//			String selectQuery = "select * from user_details";
//			PreparedStatement ps = conn.prepareStatement(selectQuery);
//			ResultSet rs = ps.executeQuery();
//			while (rs.next()) {
//				System.out.println("Id: " + rs.getInt(1) + " firstname: " + rs.getString("first_name"));
//			}
//			ps.close();
//			conn.close();
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return "login";
//	}
	
	@GetMapping("/userLogin")
	public String showLogin() {
		return "login";
	}
	
	@PostMapping("/authWithSpringData")
	public String authUserBySpringData(Model m,@RequestParam("userName") String userName, @RequestParam("password") String password) {
		
		//List<User> userList = userRepo.findAll();
		//List<User> userList = userRepo.findByUserNameAndPassword(userName, password);
		User loggedinUser = loginService.authUserBySpringData(userName, password);
		if(loggedinUser != null) {
			m.addAttribute("loggedinUser", loggedinUser );
			m.addAttribute("productList", dashboardService.getAllProductsList());
			return "dashboard";
		}else {
			return "login";
		}
		
	}
	
	
}
