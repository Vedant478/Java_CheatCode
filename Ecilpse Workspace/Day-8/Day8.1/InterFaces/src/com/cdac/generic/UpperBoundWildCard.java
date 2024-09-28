package com.cdac.generic;
class Person
{
	
	
}
class Employee extends Person
{
	
}
class EmployeeManager extends Employee 
{
	
}

class Gen<T>
{
	T a;
	
	void Show() {
		System.out.println("Value of a: "+this.a);
	}
}
public class UpperBoundWildCard {
	public static void main(String[] args) {
		Gen g1 = new Gen<>();  // Raw type
		
		g1.a="Malkeet";
		g1.a =900;
		g1.a = new Person(); /// Unbounded Wild Card
		
		Gen<Employee> e1 = new Gen<>();
		
		e1.a = new Employee();
		//e1.a = new Person();
		
		//Whatever u want to take u can take 
		Gen<Employee> e2 = new Gen<>();
		Gen<Integer> e3 = new Gen<>();
		Gen<Float> e4 = new Gen<>();


	}
}
