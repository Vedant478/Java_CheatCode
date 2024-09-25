package com.cdac.main;
// Same name of method and same signature
class Person
{
	int Age;
	String Name ;
	
	
	void Method1() {
		System.out.println("am method1 of person");
	}

}

class Employee extends Person
{
	int Id;
	float Salary;
	
	void Method1() {
		System.out.println("Am method of employee");
		
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		Employee e = new Employee(); // Static binding or Early binding
		e.Method1();
		
		Person p1 = new Employee();// This process is known as Object Upcasting
		p1.Method1(); // Dynamic method dispatch , late binding , dynamic binding
		
		Employee e1 = (Employee)p1; // Down-casting
		e1.Method1(); 
	}

}
