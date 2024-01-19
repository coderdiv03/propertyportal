package com.example.propertyportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MainController {

	@GetMapping("/hello")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/admin/login")
	public String viewAdminLoginPage() {
		return "admin/admin_login";
	}
	
	@GetMapping("/user/login")
	public String viewUserLoginPage() {
		return "user/user_login";
	}
	
	@GetMapping("/admin/home")
	public String viewAdminHomePage(Model model,HttpServletRequest request) {
	//	model.addAttribute("username",request.getUserPrincipal().getName());
		return "admin/admin_home";
	}
	
	@GetMapping("/user/home")
	public String viewUserHomePage(Model model,HttpServletRequest request) {
	//	model.addAttribute("username",request.getUserPrincipal().getName());
		return "user/user_home";
	}
	
}
