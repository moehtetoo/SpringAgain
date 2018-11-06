package com.moehtet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Hello World!");
		model.addAttribute("tagline", "My first Page");
		return "welcome";
	}
	@RequestMapping("/ajax")
	public String ajax() {
		return "ajax";
	}
}
