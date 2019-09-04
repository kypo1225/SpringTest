package com.example.demo.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@Autowired
	
	@RequestMapping(value = "/home")
	public String getHome(Model model) {
		
		model.addAttribute("contents", "login/home :: home_contents");
		
		return "login/homeLayout";
	}
	
	@RequestMapping("/logout")
	public String getLogout() {
		
		return "redirect:/login";
		
	}

}
