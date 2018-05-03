package com.codingdojo.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator a = new Calculator();
//		a.performOperation(5.5, '+', 2.0);
//		a.performOperation(5.5, '-', 2.0);
		a.calculate(6.5, '+', 2);
		a.calculate(4.0, '-', 2);
		a.calculate(6, '*', 2);
		a.calculate(6, '/', 2);
		a.performOperation(6, '/', 2);
		a.getResults();
		a.performOperation(7.2, '-', 4);
		a.getResults();
		a.performOperation(4, '*', 4);
		a.getResults();
		a.performOperation(16.0, '/', 4);
		a.getResults();
		a.performOperation(16.0, '^', 4);
		a.getResults();
	}

}
