package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		
		// Test the calculator class for add functionality.
		// Pass parameters 4 and 5 to the add method.
		// We should expect 9 to be returned.
		
		Calculator calulator1 = new Calculator();
		
		int expectedResult = 9;
		
		int actualResult = calulator1.add(4,5);
		
		// do the assertion
		assertEquals(expectedResult, actualResult);	
	}

}
