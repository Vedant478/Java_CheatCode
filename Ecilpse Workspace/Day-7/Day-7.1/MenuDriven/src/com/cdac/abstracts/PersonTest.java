package com.cdac.abstracts;

abstract class Person {
	String Name;
	int Age;
	void PrintDetails() {
		System.out.println("Name: "+Name+"Age: "+Age);
	}
	abstract void GetDetails();
}
class Employee extends Person
{
	int EmpId;
	String DeptName1;
	
	@Override
	void GetDetails() {
		this.EmpId=10;
		this.Name="Malkeet";
		this.Age=20;
		this.DeptName1="CDAC";
	}
	void PrintDetails() {
		super.PrintDetails();
		System.out.println("EmpId: "+this.EmpId+"DeptName1: "+this.DeptName1);
	}
	
}

public class PersonTest
{
	public static void main(String[] args) {
		
	}
}