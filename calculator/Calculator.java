package com.codingdojo.calculator;

public class Calculator implements java.io.Serializable {
	
	//member variables
	private double operandOne;
	private double operandTwo;
	private char operation;
	private double output;
	
	//getters and setters
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public char getOperation() {
		return operation;
	}
	public void setOperation(char operation) {
		this.operation = operation;
	}
	
	public Calculator() {};
	
	public void performOperation(double operandOneParam, char operationParam, double operandTwoParam) {
		this.setOperandOne(operandOneParam);
		this.setOperation(operationParam);
		this.setOperandTwo(operandTwoParam);
		
		Double y;
		
		if(this.operation == '+') {
			System.out.println("Adding "+operandTwoParam+" to "+operandOneParam);
			y = this.operandTwo + this.operandOne;
		}
		else if(operationParam == '-') {
			System.out.println("Subtracting "+operandTwoParam+" from "+operandOneParam);
			y = this.operandOne - this.operandTwo;
		}
		else if(operationParam == '*') {
			System.out.println("Multiplying "+operandOneParam+" by "+operandTwoParam);
			y = this.operandTwo * this.operandOne;
		}
		else if(operationParam == '/') {
			System.out.println("Dividing "+operandOneParam+" by "+operandTwoParam);
			y = this.operandOne / this.operandTwo;
		}
		else {
			System.out.println("Invalid operation");
			y=null;
		}
		this.output = y;
	}
	
	public Double getResults() {
		System.out.println("result "+this.output);
		return this.output;
	}
	
	public Double calculate(double operandOneParam, char operationParam, double operandTwoParam) {
		
		Double x;
		
		if(operationParam == '+') {
			System.out.println("Adding "+operandTwoParam+" to "+operandOneParam);
			x = operandOneParam+operandTwoParam;
		}
		else if(operationParam == '-') {
			System.out.println("Subtracting "+operandTwoParam+" from "+operandOneParam);
			x = operandOneParam-operandTwoParam;
		}
		else if(operationParam == '*') {
			System.out.println("Multiplying "+operandOneParam+" by "+operandTwoParam);
			x = operandOneParam*operandTwoParam;
		}
		else if(operationParam == '/') {
			System.out.println("Dividing "+operandOneParam+" by "+operandTwoParam);
			x = operandOneParam/operandTwoParam;
		}
		else {
			System.out.println("Invalid operation");
			x = null;
			return null;
		}
		this.output = x;
		System.out.println("result: "+this.output);
		return this.output;
	}
	

}
