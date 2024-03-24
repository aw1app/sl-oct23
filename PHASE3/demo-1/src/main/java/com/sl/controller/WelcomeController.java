package com.sl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcome(Model model, String name) {
		
		model.addAttribute("name", name);
		
		return "welcome" ; // display WEB-INF/views/welcome.jsp
	}

}
