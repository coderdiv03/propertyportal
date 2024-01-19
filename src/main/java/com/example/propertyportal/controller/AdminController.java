package com.example.propertyportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.propertyportal.model.Aboutus;
import com.example.propertyportal.model.PropertyType;
import com.example.propertyportal.service.AboutusService;
import com.example.propertyportal.service.PropertyTypeService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AboutusService aboutusService;
	
	@Autowired
	PropertyTypeService propertyTypeService;
	
	@GetMapping("/")
	public String adminhome(Model model){
		Aboutus aboutus=aboutusService.getAboutus();
		model.addAttribute("about", aboutus);
		return "admin/aboutus";
	}
	
	@GetMapping("/aboutus")
	public String aboutus(Model model) {
		Aboutus aboutus=aboutusService.getAboutus();
		model.addAttribute("about", aboutus);
		return "admin/aboutus";
	}
	
	@PostMapping("/aboutus/add")
	public String postaboutus(@ModelAttribute("about") Aboutus about) {
		aboutusService.addAboutus(about);
		return "redirect:/admin/aboutus";
	}
	
	@GetMapping("/addpropertytype")
	public String addPropertyType(Model model) {
		model.addAttribute("propertytype", new PropertyType());
		return "admin/addpropertytype";
	}
	
	@PostMapping("/propertytype/add")
	public String postpropertytype(@ModelAttribute("propertytype") PropertyType propertytype) {
		propertyTypeService.addPropertyType(propertytype);
		return "redirect:/admin/viewpropertytype";
	}
	
	@GetMapping("/viewpropertytype")
	public String viewPropertyType() {
		return "admin/viewpropertytype";
	}
	
	@GetMapping("/addcategory")
	public String addCategory() {
		return "admin/addcategory";
	}
	
	@GetMapping("/viewcategory")
	public String viewCategory() {
		return "admin/viewcategory";
	}
	
	@GetMapping("/addcity")
	public String addCity() {
		return "admin/addcity";
	}
	
	@GetMapping("/viewcity")
	public String viewCity() {
		return "admin/viewcity";
	}
	
	
	@GetMapping("/addlocality")
	public String addLocality() {
		return "admin/addlocality";
	}
	
	@GetMapping("/viewlocality")
	public String viewLocality() {
		return "admin/viewlocality";
	}
	
	@GetMapping("/viewowner")
	public String viewOwner() {
		return "admin/viewowner";
	}
	
	@GetMapping("/viewagent")
	public String viewAgent() {
		return "admin/viewagent";
	}
	
	@GetMapping("/viewbuyer")
	public String viewBuyer() {
		return "admin/viewbuyer";
	}
	
	@GetMapping("/viewproperty")
	public String viewProperty() {
		return "admin/viewproperty";
	}
	
	@GetMapping("/viewfeedback")
	public String viewFeedback() {
		return "admin/viewfeedback";
	}
	
	@GetMapping("/viewrequirement")
	public String viewRequirement() {
		return "admin/viewrequirement";
	}
	
	@GetMapping("/contactus")
	public String contactUs() {
		return "admin/contactus";
	}
	
	@GetMapping("/changepassword")
	public String changePassword() {
		return "admin/changepassword";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "admin/logout";
	}
	
	
}
