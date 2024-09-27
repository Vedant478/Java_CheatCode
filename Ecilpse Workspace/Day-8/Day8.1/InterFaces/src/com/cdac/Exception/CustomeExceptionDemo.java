package com.cdac.Exception;
class InvalidAgeException extends Exception{
	
	public InvalidAgeException(){
		System.out.println("Invalid Age Exception");

	}
	public InvalidAgeException(String msg) {
		super(msg);
	}
	
}
public class CustomeExceptionDemo {
	static void CheckAge(int Age) throws InvalidAgeException {
		if(Age>18) {
			System.err.println("Valid Age to Vote");
		}
		else
		{
			throw new InvalidAgeException("Age is Less than 18");
		}
	}
	public static void main(String[] args) {
		int Age = 19;
		try {
			CheckAge(Age);
		}
		catch (InvalidAgeException e) {
			System.out.println("Exception Occured: "+e.getMessage());
		}
	}
}
