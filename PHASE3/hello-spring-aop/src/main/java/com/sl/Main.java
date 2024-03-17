package com.sl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.sl")
@Configuration
public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		
		BankAccount bankAcct = (BankAccount) context.getBean(BankAccount.class);
		
		//Deposit 
		bankAcct.deposit(10000.0d);
		
		bankAcct.withdraw(5000.0d);	
		

	}

}
