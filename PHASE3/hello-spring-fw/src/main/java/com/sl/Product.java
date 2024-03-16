package com.sl;

public class Product {
	
	String name;
	float price;
	
	public Product() {
		
	}
		
	public Product(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	// Init-method demo (refer to applicationContext.xml)
	public void hi() {
		System.out.println("Hi");
	}
	
	// destruct-method demo
	public void bye() {
		System.out.println("Bye");
	}
	

}
