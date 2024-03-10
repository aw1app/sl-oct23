package junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator calulator1;
	
	
	@BeforeEach
	void myBeforeEach() {
		System.out.println(" INSIDE myBeforeEach ");
		calulator1 = new Calculator();
	}
	
	@AfterEach
	void myAfterEach() {
		System.out.println(" INSIDE myAfterEach ");
		calulator1 = null;
	}
	

	@Test
	void test1Add() {
		System.out.println(" INSIDE test1Add ");
		
		// Test the calculator class for add functionality.
		// Pass parameters 4 and 5 to the add method.
		// We should expect 9 to be returned.
		
		//Calculator calulator1 = new Calculator();		
		
		int actualResult = calulator1.add(4,5);
		
		int expectedResult = 9;
		
		// do the assertion
		assertEquals(expectedResult, actualResult);	
	}
	
	@Test
	void test2Add() {
		System.out.println(" INSIDE test2Add ");
		
		// Test the calculator class for add functionality.
		// Pass parameters -1 and 5 to the add method.
		// We should expect 4 to be returned.
		
		//Calculator calulator1 = new Calculator();		
		
		int actualResult = calulator1.add(-1,5);
		
		int expectedResult = 4;
		
		// do the assertion
		assertEquals(expectedResult, actualResult);	
	}
	
	//Challenge: Write two more test cases for add method
	@Test
	void test3Add() {
		System.out.println(" INSIDE test3Add ");
		
		// Test the calculator class for add functionality.
		// Pass parameters positive 5 and negative -10 to the add method.
		// We should expect -5 to be returned.
		
		//Calculator calulator1 = new Calculator();
		int actualResult = calulator1.add(5,-10);
		int expectedResult = -5;
		assertEquals(expectedResult, actualResult);
	}


}
