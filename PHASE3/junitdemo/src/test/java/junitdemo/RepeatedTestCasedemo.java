package junitdemo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;

class RepeatedTestCasedemo {

	@RepeatedTest(7)
	void testAddPositiveValues() {
		System.out.println("INSIDE testAddPositiveValues");

		Calculator cal = new Calculator();

		int a = 2;
		int b = 5;

		assertTrue(7 == cal.add(a, b));
	}

}
