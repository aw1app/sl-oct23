package com.sl2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
	
	@PostMapping("/add-product")
	public String addProduct(Model model, String name, float price) {
		
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		
		return "add-product-success";  // display WEB-INF/views/add-product-success.jsp
	}
	

}
