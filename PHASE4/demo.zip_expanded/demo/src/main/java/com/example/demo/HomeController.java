package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("home")
	public String home() {
		return "Welcome to Home";
	}
	
	
	@GetMapping("products")
	public List<Product> products() {
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("Bike", 10000.99f));
		products.add(new Product("Truck", 90000.99f));
		
		return products;
	}

}
