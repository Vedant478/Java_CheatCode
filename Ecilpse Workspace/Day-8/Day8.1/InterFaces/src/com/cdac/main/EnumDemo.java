package com.cdac.main;

// Enum are constant literals 
enum Fruits{
	Apple,Bannana,Mango,Orange;
}
public class EnumDemo {
	public static void main(String[] args) {
		Fruits.Apple.ordinal();
		System.out.println(Fruits.Apple.name()); // Name of element of array
		System.out.println(Fruits.Apple.ordinal()); // Index of array
		System.out.println(Fruits.valueOf("Mango")); // Index of array

	}
}
