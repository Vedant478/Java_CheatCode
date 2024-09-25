package com.cdac.Inheritance;

class Demo
{
	int Num1;
	Demo(){
		System.out.println("Am cons of Demo with 0-args");
	}
	Demo(int Num1){
		System.out.println("Am cons of Demo with 1 args");
	}
	Demo(int Num1 , int Num2){
		System.out.println("Am cons of Demo with 2 args");
	}
}

class Demo1 extends Demo{
	String Name;
	Demo1(){
		super(10); //It will call parameterized constructor of super class
		System.out.println("am i with zero args");
	}
}
public class ConsCallingUsingSuper {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1(); //Creating instance of sub class
		

	}

}
