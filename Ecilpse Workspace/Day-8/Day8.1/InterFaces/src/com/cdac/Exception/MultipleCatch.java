package com.cdac.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Num1;
		int Num2;
		int Res;
		
		try {
			System.out.println("Enter First Number");
			Num1 = sc.nextInt();
			System.out.println("Enter Second Number");
			Num2 = sc.nextInt();
			Res=Num1/Num2;
			System.out.println("Result: "+Res);
			
		}
		catch(InputMismatchException | ArithmeticException e) {
			System.out.println("Exception Occured: "+e.getMessage());
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Num1;
		int Num2;
		int Res;
		
		try {
			System.out.println("Enter First Number");
			Num1 = sc.nextInt();
			System.out.println("Enter Second Number");
			Num2 = sc.nextInt();
			Res=Num1/Num2;
			System.out.println("Result: "+Res);
			
		}
		catch(InputMismatchException e) {
			System.out.println("Exception Occured: "+e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Occured: "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured: "+e.getMessage());
		}
	}

}
