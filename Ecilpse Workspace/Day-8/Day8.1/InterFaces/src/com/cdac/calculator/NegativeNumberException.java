package com.cdac.calculator;

public class NegativeNumberException extends Exception {
	public NegativeNumberException(){
		System.out.println("Cannot Divide by zero");
	}
	
	public NegativeNumberException(String msg) {
		super(msg);
	}
}
