package com.cdac.studentmanager;

public class Student1 {
	int RollNo;
	String Name;
	int Age;
	float Fees;
	
	public Student1(int rollNo, String name, int age, float fees) {
		super();
		RollNo = rollNo;
		Name = name;
		Age = age;
		Fees = fees;
	}
	public Student1() {
		super();
	}
	@Override
	public String toString() {
		return "RollNo=" + RollNo + ", Name=" + Name + ", Age=" + Age + ", Fees=" + Fees ;
	}
	
	
}
