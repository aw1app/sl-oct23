package com.sl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping(path = "/hello3", method = RequestMethod.GET)
	@ResponseBody
	public String hello3() {

		return "hello3 : Hi there";
	}

	@RequestMapping(path = "/hello4", method = RequestMethod.POST)
	@ResponseBody
	public String hello4() {

		return "hello4: Hi there";
	}

	// DEMO VIEW (jsp) resolution
	// NOTE that we are NOT using @ResponseBody here. When we don't, Spring will
	// look for a
	// JSP file in the WEB-INF/views folder as per the View Resolver mentioned in
	// the main-servlet.xml
	@GetMapping("/hi")
	public String hi() {

		return "hello-Hi-there"; // display WEB-INF/views/hello-Hi-there.jsp
	}

//	CHALLENGE: Code all that is needed so that when a user hits /user-profile from the browser,
//	he/she gets a message Welcome User!! in 24 font size
//	The message should be comming from a JSP page
// Demo Model and View
	// model is the place where we can add some data (in the form of name value
	// pairs) and this data can be used in the JSP
	@GetMapping("/user-profile")
	public String userProfile(Model model) {

		model.addAttribute("msg", "Welcome User");

		return "user-profile"; // display WEB-INF/views/user-profile.jsp
	}

	// DEMO Extracting query/request parameters
	@GetMapping("/welcome")
	public String welcome(Model model, String name, int age) {

		model.addAttribute("msg", "Welcome " + name);

		if (age > 16)
			model.addAttribute("young", false);
		else
			model.addAttribute("young", true);

		return "user-profile"; // display WEB-INF/views/user-profile.jsp
	}

	// DEMO Extracting query/request parameters when the query parameters and method argument names are different
	@GetMapping("/welcome2")
	public String welcome2(Model model, @RequestParam("name") String n, @RequestParam("age") int a) {

		model.addAttribute("msg", "Welcome " + n);

		if (a > 16)
			model.addAttribute("young", false);
		else
			model.addAttribute("young", true);

		return "user-profile"; // display WEB-INF/views/user-profile.jsp
	}

}
