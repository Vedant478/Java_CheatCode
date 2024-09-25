package com.cdac.main;
class XYZ{
	XYZ(){
		System.out.println("Am cons with zero arg");
	}
	XYZ(int Num1)
	{
		System.out.println("Am cons with 1 arg");
	}
}
class Abc{
	void method1() {
		System.out.println("Method 1");
	}
	void method1(int a) {
		System.out.println("Method 2");
	}
	void method1(int a, int b) {
		System.out.println("Method 3");
	}
}
public class ConsOverLoading {
	public static void main(String [] args) {
		Abc s1 = new Abc();
		s1.method1(); // It will return method1 with zero argu and that decision of calling will be taken by compiler 
					  // Static Binding , early binding
		
		s1.method1(0);
		
		XYZ x = new XYZ(); // it will default cons zero args
		XYZ x1 = new XYZ(10); //it will call parameterized cons with one args
	}

}
