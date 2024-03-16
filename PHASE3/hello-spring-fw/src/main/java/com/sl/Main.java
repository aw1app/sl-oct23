package com.sl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Product p1 = (Product) context.getBean("product1");
		
		System.out.println("Product p1's name is "+p1.getName());
		System.out.println("Product p1's price is "+p1.getPrice());

	}

}
