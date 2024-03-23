package com.sl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		return "hello :Hi there";
	}
	
	
	@GetMapping("/hello2")
	@ResponseBody
	public String hello2() {
		
		return "hello2 : Hi there";
	}
	
	@RequestMapping(path ="/hello3", method=RequestMethod.GET)
	@ResponseBody
	public String hello3() {
		
		return "hello3 : Hi there";
	}
	
	
	@RequestMapping(path="/hello4", method=RequestMethod.POST)
	@ResponseBody
	public String hello4() {
		
		return "hello4: Hi there";
	}
	
	@GetMapping("/hi")
	public String hi() {
		
		return "hello-Hi-there"; // display WEB-INF/views/hello-Hi-there.jsp
	}

}
