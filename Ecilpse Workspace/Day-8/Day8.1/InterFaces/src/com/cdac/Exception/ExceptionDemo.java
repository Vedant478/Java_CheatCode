package com.cdac.Exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		
		int Num1=10;
		int Num2=20;
		
		try
		{	
		int Res=Num1/Num2; // This Line will throw instance of ArithmeticExceptionClass
		System.out.println("Another Part of the Block");
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Message: "+e.getMessage());

		}
		System.out.println("Rest of the program");
		System.out.println("Program Ends Here");
		
		
		
	}
}
