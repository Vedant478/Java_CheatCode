package com.cdac.Inheritance;

class Student {
	public int RollNo; // Available everywhere 
	String Name; // Not available outside package
	private int Age ; //Within class
 	protected float Fees; // protected becomes private outside of package
}
// class can't be protected and private