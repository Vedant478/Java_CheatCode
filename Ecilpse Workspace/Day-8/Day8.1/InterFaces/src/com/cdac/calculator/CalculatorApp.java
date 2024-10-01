package com.cdac.calculator;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Numerator");
			int Numerator = sc.nextInt();
			
			System.out.println("Enter Denominator");
			int Denominator = sc.nextInt();
			
			double result = c.Divison(Numerator, Denominator);
			System.out.println("Result of Divison: " + result);
			
		} catch (ArithmeticException e) {
			System.out.println("Error: "+e.getMessage());
		}
		catch (NegativeNumberException e) {
			System.out.println("Error: "+e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
