package junitdemo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class DynamicTestsDemo {

	@TestFactory
	Collection<DynamicTest> dynamicTests1() {
		
		DynamicTest dynTest1 = dynamicTest("Dynamic test 1", () -> { assertTrue(7 == new Calculator().add(2, 5)) ; } );
		
		DynamicTest dynTest2 = dynamicTest("Dynamic test 2 for division", () -> { assertTrue(2 == new Calculator().divide(5, 2)) ; } );
		
		
		return Arrays.asList(dynTest1, dynTest2);		
	}
	
	@TestFactory
	Collection<DynamicTest> dynamicTests2() {
		
		Collection<DynamicTest> dynamicTests = new ArrayList<DynamicTest>();
		
		
		for (int i = 0; i < 5; i++) {
			int x=i;
			dynamicTests.add(dynamicTest("Dynamic test for a="+x, () -> assertTrue( 5+x == new Calculator().add(x, 5))));
		}
		
		return dynamicTests;
		
	}

}
