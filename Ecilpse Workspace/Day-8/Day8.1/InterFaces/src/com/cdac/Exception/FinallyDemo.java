package com.cdac.Exception;

import java.util.InputMismatchException;

// Finally block gets executed either the exception is handled or not handled
public class FinallyDemo {
	static void DivByeZero() throws ArithmeticException, InputMismatchException
	{
		throw new ArithmeticException();
	}
	public static void main(String[] args) {
		FinallyDemo.DivByeZero();
	}
	public static void main1(String[] args) {
		try
		{
			//throw new ArithmeticException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Occured: "+e.getMessage());
			
		}
		finally
		{
			System.out.println("Close the connection");
			System.out.println("Close the file");
		}
		System.out.println("Rest of the Program");
		
	}
}
