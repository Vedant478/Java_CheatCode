package com.cdac.interfacess;
/*
 * Interview 
 * by implement multiple inheritance or multilevel inheritance
 * 
 * 
 * C --> C extend 
 * I --> I extends
 * I --> C Implements 
 * C --> I can't do anything 
 * ---------------------------------------------------------
 * Abstract method ambiguity is resolve by jvm itself 
 * Default method ambiguity is resolve by programmer itself
 * */
interface Person {
	void Method1();
	void Method2();
	
	default void Method3()
	{
		System.out.println("am default of Person");
	}
}

// U can extend interface inside interface 
interface Employee {
	void Method2();
	default void Method3()
	{
		System.out.println("am default of Person");
	}
}

class Student implements Employee,Person {  // Multiple Inheritance
	// This is called interface inheritance
	@Override
	public void Method1() {
		System.out.println("Am Method1 def by Student");

	}

	@Override
	public void Method2() {
		System.out.println("Am Method2 def by Student");
	}

	@Override
	public void Method3() {		
	}
	
}
public class InterfaceInheritance {
	public static void main(String[] args) {
		Student s1= new Student();
		s1.Method1();
		s1.Method3();
	}
}
