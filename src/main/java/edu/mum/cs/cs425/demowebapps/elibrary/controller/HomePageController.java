package edu.mum.cs.cs425.demowebapps.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomePageController {
	@GetMapping(value= {"/","/mylibrary","/mylibrary/home"})
	public String showHomePage() {
		return "home/index";
	}		
}


