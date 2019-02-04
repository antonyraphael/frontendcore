package com.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PageController {
	
	
	@RequestMapping("/login")
	public String showLogin(Model m)
	{
		m.addAttribute("pageinfo","Login");
		return "Login";
	}
	@RequestMapping("/aboutus")
	public String showAboutUs(Model m)
	{
		m.addAttribute("pageinfo","AboutUs");
		return "AboutUs";
	}
  
	@RequestMapping("/register")
	public String showRegister(Model m)
	{
		m.addAttribute("pageinfo","Register");
		return "Register";
	}
	@RequestMapping("/index")
	public String showindex(Model m)
	{
		m.addAttribute("pageinfo","Index");
		return "Index";
	}
}
