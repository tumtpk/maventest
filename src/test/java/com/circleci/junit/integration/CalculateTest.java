package com.circleci.junit.integration;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.circleci.junit.integration.Calculate;

public class CalculateTest {
	
	Calculate cal;
	
	@Before
	public void beforeCalculate() {
		cal = new Calculate();
	}

	@Test
	public void maximumInput() {
		int input = 100;
		boolean expectedResult = true;
		
		boolean actualResult;
		actualResult = cal.Input(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void overInput() {
		int input = 101;
		boolean expectedResult = false;
		
		boolean actualResult;
		actualResult = cal.Input(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void lowerInput() {
		int input = -2;
		boolean expectedResult = false;
		
		boolean actualResult;
		actualResult = cal.Input(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void lower2Input() {
		int input = -1;
		boolean expectedResult = false;
		
		boolean actualResult;
		actualResult = cal.Input(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void lowerBoundInput() {
		int input = 0;
		boolean expectedResult = true;
		
		boolean actualResult;
		actualResult = cal.Input(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void middleBoundInput() {
		int input = 50;
		boolean expectedResult = true;
		
		boolean actualResult;
		actualResult = cal.Input(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void gradeAInput100() {
		int input = 100;
		String expectedResult = "A";
		
		String actualResult;
		actualResult = cal.grade(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void gradeAInput80() {
		int input = 80;
		String expectedResult = "A";
		
		String actualResult;
		actualResult = cal.grade(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void gradeAInput90() {
		int input = 90;
		String expectedResult = "A";
		
		String actualResult;
		actualResult = cal.grade(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void gradeBInput70() {
		int input = 70;
		String expectedResult = "B";
		
		String actualResult;
		actualResult = cal.grade(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void gradeBInput79() {
		int input = 79;
		String expectedResult = "B";
		
		String actualResult;
		actualResult = cal.grade(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void gradeBInput75() {
		int input = 75;
		String expectedResult = "B";
		
		String actualResult;
		actualResult = cal.grade(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void gradeCInput60() {
		int input = 60;
		String expectedResult = "C";
		
		String actualResult;
		actualResult = cal.grade(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void gradeCInput69() {
		int input = 69;
		String expectedResult = "C";
		
		String actualResult;
		actualResult = cal.grade(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void gradeCInput65() {
		int input = 65;
		String expectedResult = "C";
		
		String actualResult;
		actualResult = cal.grade(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void gradeDInput50() {
		int input = 50;
		String expectedResult = "D";
		
		String actualResult;
		actualResult = cal.grade(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void gradeDInput59() {
		int input = 59;
		String expectedResult = "D";
		
		String actualResult;
		actualResult = cal.grade(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void gradeDInput55() {
		int input = 55;
		String expectedResult = "D";
		
		String actualResult;
		actualResult = cal.grade(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void gradeFInput30() {
		int input = 30;
		String expectedResult = "F";
		
		String actualResult;
		actualResult = cal.grade(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void gradeFInput49() {
		int input = 49;
		String expectedResult = "F";
		
		String actualResult;
		actualResult = cal.grade(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void gradeXInput101() {
		int input = 101;
		String expectedResult = "X";
		
		String actualResult;
		actualResult = cal.grade(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void gradeXInputlower1() {
		int input = -1;
		String expectedResult = "F";
		
		String actualResult;
		actualResult = cal.grade(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
}
