package com.sl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// SCOPE DEMO
		System.out.println("SCOPE DEMO\n");
		
		Product p1 = (Product) context.getBean("product1");

		System.out.println("Product p1's name is " + p1.getName());
		System.out.println("Product p1's price is " + p1.getPrice());
		System.out.println("Product p1's hashcode is " + p1.hashCode());
		
		Product p1_another = (Product) context.getBean("product1");

		System.out.println("Product p1_another's name is " + p1_another.getName());
		System.out.println("Product p1_another's price is " + p1_another.getPrice());
		System.out.println("Product p1_another's hashcode is " + p1_another.hashCode());
		
	
		Product p2 = (Product) context.getBean("product2");

		System.out.println();
		System.out.println("Product p2's name is " + p2.getName());
		System.out.println("Product p2's price is " + p2.getPrice());
		System.out.println("Product p2's hashcode is " + p2.hashCode());
		
		Product p2_another = (Product) context.getBean("product2");

		System.out.println();
		System.out.println("Product p2_another's name is " + p2_another.getName());
		System.out.println("Product p2_another's price is " + p2_another.getPrice());
		System.out.println("Product p2_another'shashcode is " + p2_another.hashCode());

	}

	

}
