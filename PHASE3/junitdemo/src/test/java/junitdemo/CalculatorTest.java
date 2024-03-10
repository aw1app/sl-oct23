package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test1Add() {
		
		// Test the calculator class for add functionality.
		// Pass parameters 4 and 5 to the add method.
		// We should expect 9 to be returned.
		
		Calculator calulator1 = new Calculator();		
		
		int actualResult = calulator1.add(4,5);
		
		int expectedResult = 9;
		
		// do the assertion
		assertEquals(expectedResult, actualResult);	
	}
	
	@Test
	void test2Add() {
		
		// Test the calculator class for add functionality.
		// Pass parameters -1 and 5 to the add method.
		// We should expect 4 to be returned.
		
		Calculator calulator1 = new Calculator();		
		
		int actualResult = calulator1.add(-1,5);
		
		int expectedResult = 4;
		
		// do the assertion
		assertEquals(expectedResult, actualResult);	
	}
	
	//Challenge: Write two more test cases for add method

}
