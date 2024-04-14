package com.sl;

public class CalculatorServiceImpl implements CalculatorService {

	Calculator calc = new Calculator();

	@Override
	public int add(int x, int y) {

		return calc.add(x, y);
	}

	public int multiply(int x, int y) {

		return x * y;
	}

}
