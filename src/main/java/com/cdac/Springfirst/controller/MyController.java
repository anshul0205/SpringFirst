package com.cdac.Springfirst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	// get home request
	@RequestMapping("/")
	public String getHome() {
		return "home";
	}
	

}
