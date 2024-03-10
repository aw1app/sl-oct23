package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class CalculatorTest {
	Calculator calulator1;

	@BeforeAll
	static void myBeforeAll() {
		System.out.println(
				" INSIDE myBeforeAll. My-Speciality: I will run before the first test case in this class. I will be run only once ");
	}

	@AfterAll
	static void myAfterAll() {
		System.out.println(
				" INSIDE myAfterAll. My-Speciality: I will run after the last test case in this class. I will be run only once ");
	}

	@BeforeEach
	void myBeforeEach() {
		System.out.println(" INSIDE myBeforeEach. My-Speciality: I will run before each test case in this class  ");
		calulator1 = new Calculator();
	}

	@AfterEach
	void myAfterEach() {
		System.out.println(" INSIDE myAfterEach. My-Speciality: I will run after each test case in this class ");
		calulator1 = null;
	}

	@Test
	void test1Add() {
		System.out.println(" INSIDE test1Add ");

		// Test the calculator class for add functionality.
		// Pass parameters 4 and 5 to the add method.
		// We should expect 9 to be returned.

		// Calculator calulator1 = new Calculator();

		int actualResult = calulator1.add(4, 5);

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

		// Calculator calulator1 = new Calculator();

		int actualResult = calulator1.add(-1, 5);

		int expectedResult = 4;

		// do the assertion
		assertEquals(expectedResult, actualResult);
	}

	// Challenge: Write two more test cases for add method
	@Test
	void test3Add() {
		System.out.println(" INSIDE test3Add ");

		// Test the calculator class for add functionality.
		// Pass parameters positive 5 and negative -10 to the add method.
		// We should expect -5 to be returned.

		// Calculator calulator1 = new Calculator();
		int actualResult = calulator1.add(5, -10);
		int expectedResult = -5;
		assertEquals(expectedResult, actualResult);
	}

}
