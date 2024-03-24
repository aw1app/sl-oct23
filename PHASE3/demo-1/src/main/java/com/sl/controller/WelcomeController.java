package com.sl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcome() {
		
		return "welcome" ; // display WEB-INF/views/welcome.jsp
	}

}
