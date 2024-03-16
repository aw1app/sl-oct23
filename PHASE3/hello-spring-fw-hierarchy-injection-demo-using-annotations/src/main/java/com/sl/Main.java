package com.sl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Constructor Injection Demo
		Product p1 = (Product) context.getBean(Product.class);

		System.out.println("Product p1's name is " + p1.getName());
		System.out.println("Product p1's price is " + p1.getPrice());
		
		Brand p1Brand = p1.getBrand();
		System.out.println("Product p1's brand is " + p1Brand.getName());
		
		

	}

	

}
