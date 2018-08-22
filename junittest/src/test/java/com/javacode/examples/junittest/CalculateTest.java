package com.javacode.examples.junittest;


import org.junit.Before;
import org.junit.Test;

import com.javacode.examples.junittest.Calculate;

import junit.framework.Assert;

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
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	
}
