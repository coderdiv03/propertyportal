package com.example.propertyportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

	@GetMapping("/home")
	public String home() {
		return "user/home";
	}
	
	@GetMapping("/aboutus")
	public String aboutus() {
		return "user/aboutus";
	}
	
	@GetMapping("/favourite")
	public String favourite() {
		return "user/favourite";
	}
	
	@GetMapping("/login")
	public String login() {
		return "user/login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "user/register";
	}
}
