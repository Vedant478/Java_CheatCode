package com.cdac.calculator;

public class Calculator {
	int Numerator ;
	int Denominator;
	
	double Divison(int Numerator, int Denominator) throws ArithmeticException,NegativeNumberException {
		if ( Denominator == 0) {
			throw new ArithmeticException("Number cannot be divide by zero");
		}
		
		if (Numerator < 0) {
			throw new NegativeNumberException("Numerator "+Numerator+" Cannot be Negative");
		}
		
		if (Denominator < 0) {
			throw new NegativeNumberException("Denominator "+Denominator+" Cannot be Negative");
		}
		
		return (double) Numerator/Denominator;	
	}
}


