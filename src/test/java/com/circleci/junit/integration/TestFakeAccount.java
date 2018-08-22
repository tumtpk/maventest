package com.circleci.junit.integration;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class TestFakeAccount{
	
	private FakeAccount account;
	
	@Before
	public void setup(){
		account = new FakeAccount(100);
	}
	
	@Test
	public void shouldDepositMoney(){
		assertEquals(100.00, account.balance(), 0);
		account.deposit(100.05);
		assertEquals(200.05, account.balance(), 0);
	}
	
	@Test
	public void shouldWithDraw(){
		account.deposit(100.0);
		assertEquals(200.00, account.balance(), 0);
		assertEquals(200, account.withdraw(200), 0);
		assertEquals(0, account.balance(), 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldNotLetToWithDraw(){
		assertEquals(100.00, account.balance(), 0);
		assertEquals(200, account.withdraw(102), 0);
	}
}
