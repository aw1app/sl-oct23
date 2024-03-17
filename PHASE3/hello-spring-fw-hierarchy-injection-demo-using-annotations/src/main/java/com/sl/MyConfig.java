package com.sl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	@Bean(name = "product1")
	public Product createProduct() {
		
		Product p = new Product();
		p.setName("Dell Laptop");
		p.setPrice(50000.0f);
		
		return p;
		
	}
	
	
	@Bean(name = "product2")
	public Product createHPProduct() {
		
		Product p = new Product();
		p.setName("HP Laptop");
		p.setPrice(55000.0f);
		
		return p;
		
	}
	

}


//if we are using annotation based approach. should we create a config file ?
//		XML config - NO
//		Java based config - YES