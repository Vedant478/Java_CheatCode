package com.cdac.abstracts;
abstract class Demo { // If a method inside the class is abstract then the class should also be abstract 
	int Num1;
	static void Demo() {
		
	}
	void Method1() { // Non static concrete method of class
		System.out.println("Am Method1 of Demo");	
	}
	abstract void Method2(); // Abstract method
	static void Method3() {
		
	}
}
public class AbstractionDemo {
	public static void main(String[] args)
	{
		//Demo d1 = new Demo(); //An abstract class cannot be instantiated
	}
}
