package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setUp(){
		calculator = new Calculator();
	}
	
	@Test
	public void addTest(){
		assertTrue(calculator.add(2, 2) == 4);
		assertFalse(calculator.add(2, 2) == 5);
		assertEquals(4, calculator.add(2, 2));
	}

	@Test
	public void subtractTest(){
		assertTrue(calculator.subtract(2, 2) == 0);
		assertFalse(calculator.subtract(2, 2) == 5);
		assertEquals(0, calculator.subtract(2, 2));
	}
	
	@Test
	public void multiplyTest(){
		assertTrue(calculator.multiply(2, 2) == 4);
		assertFalse(calculator.multiply(2, 2) == 5);
		assertEquals(4, calculator.multiply(2, 2));
	}
	
	@Test
	public void divideTest(){		
		assertTrue(calculator.divide(2, 2) == 1);
		assertFalse(calculator.divide(2, 2) == 5);
		assertEquals(1, calculator.divide(2, 2));
			
	}
	
	
	
}
		
	
	

