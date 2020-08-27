package com.lingzg.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public String hello(Model model){
		model.addAttribute("name", "Tomams");
		return "hello";
	}
	
	@RequestMapping("/reload")
	public String reload(String name, Model model){
		model.addAttribute("name", name);
		return "hello::p";
	}
}
