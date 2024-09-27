package com.cdac.Exception;

import java.util.InputMismatchException;

public class NestedTry {

	public static void main(String[] args) {
		try {
			try {  //Nested Try
				throw new ArrayIndexOutOfBoundsException();
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Exceotion in inner try: "+e.getMessage());
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Catch of outer Try: "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Master Catch of outer: "+e.getMessage());
		}
		System.out.println("Rest of the Program");
		System.out.println("End Program");
	}
}
