package com.cgi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {

	public FirstController() {
		System.out.println("fs object is created...");
	}
	
	@RequestMapping(value="/home",method = RequestMethod.GET)
	public String hello() {
		return "home";
	}
}
