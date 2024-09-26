package com.cdac.intrfc;

interface MyInterface
{
	static int Num1=300;
	void Method1();
	void Method2();
	
}
class MyClass implements MyInterface {
	
	@Override
	public void Method1() {
		System.out.println("Method by MyClass");
	}
	
	@Override
	public void Method2() {
		System.out.println("Method2 by MyClass");
	}
	
	
}

public class InterfaceDemo{
	
}
