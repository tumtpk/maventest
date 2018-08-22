package com.circleci.junit.integration;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class FakeAccount {
	
	private double balance;
	
	public FakeAccount(double balance){
		this.balance = balance;
	}
	
	public void deposit(double amount){
		this.balance += amount;
	}
	
	public double withdraw(double amount){
		if(balance < amount){
			throw new IllegalArgumentException("You are asking more than what you deposited!");
		}
		this.balance -= amount;
		return amount;
	}
	
	public double balance(){
		return balance;
	}
}
