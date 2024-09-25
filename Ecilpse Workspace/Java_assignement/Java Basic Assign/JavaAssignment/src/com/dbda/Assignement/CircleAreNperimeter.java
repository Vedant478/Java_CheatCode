package com.dbda.Assignement;
//4.Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. 
//Calculate the area and circumference of the circle.
import java.util.Scanner;

class Circle{
	float radius;
	
	Circle(float r) {
		r = radius;
	}
	double Area() {
		return Math.PI*radius*radius;
	}
	double Circum() {
		return 2*Math.PI*radius;
	}
	void TakeHeightnWidth() {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Radius");
     radius = sc.nextFloat();

 }
	void display() {
     System.out.println("Radius : " + radius);
     System.out.println("Area : " + Area());
     System.out.println("Circumference : " + Circum());
 }
}
public class CircleAreNperimeter {
	public static void main(String[] args) {
		Circle c = new Circle(0);
		c.TakeHeightnWidth();
		c.Area();
		c.Circum();
		c.display();		
	}
}

