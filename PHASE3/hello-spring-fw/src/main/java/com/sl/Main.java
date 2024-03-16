package com.sl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Product p1 = (Product) context.getBean("product1");

		System.out.println("Product p1's name is " + p1.getName());
		System.out.println("Product p1's price is " + p1.getPrice());
		
		Product p2 = (Product) context.getBean("product2");

		System.out.println();
		System.out.println("Product p2's name is " + p2.getName());
		System.out.println("Product p2's price is " + p2.getPrice());

	}

	/*
	 * public static void main0(String[] args) {
	 * 
	 * Resource resource = new ClassPathResource("applicationContext.xml"));
	 * 
	 * BeanFactory factory = new BeanFactory();
	 * 
	 * Product p1 = (Product) factory.getBean("product1");
	 * 
	 * System.out.println("Product p1's name is " + p1.getName());
	 * System.out.println("Product p1's price is " + p1.getPrice());
	 * 
	 * }
	 */

}
