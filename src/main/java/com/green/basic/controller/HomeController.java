package com.green.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public  String  home() {
		return "home";
	}
	
	@RequestMapping("/List")
	public  String  list() {
		return "list";
	}
	
}








