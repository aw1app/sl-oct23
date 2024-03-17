package com.sl;

import org.springframework.stereotype.Component;

@Component
public class BankAccount {

	private double balance = 0;

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: $" + amount);
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: $" + amount);
		} else {
			System.out.println("Insufficient funds");
		}
	}

	public double getBalance() {
		return balance;
	}

}
