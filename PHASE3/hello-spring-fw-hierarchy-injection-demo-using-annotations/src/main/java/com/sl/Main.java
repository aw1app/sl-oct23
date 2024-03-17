package com.sl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.sl")
public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

		// Constructor Injection Demo
//		Product p1 = (Product) context.getBean(Product.class);		
//		
//
//		System.out.println("Product p1's name is " + p1.getName());
//		System.out.println("Product p1's price is " + p1.getPrice());
//
//		Brand p1Brand = p1.getBrand();
//		System.out.println("Product p1's brand is " + p1Brand.getName());
		
		
		// Customized product bean "product1'
		
		Product prod1 = (Product) context.getBean("product1");
		System.out.println("Product prod1's name is " + prod1.getName());
		System.out.println("Product prod1's price is " + prod1.getPrice());


	}

}
