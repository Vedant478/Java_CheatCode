package com.cdac.vehiclemanagement;

import java.util.Scanner;

public class Vehicle {
	String make;
	String mode;
	int year;
	public Vehicle(String make, String mode, int year) {
		super();
		this.make = make;
		this.mode = mode;
		this.year = year;
	}
	public Vehicle() {
		super();
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	void addVehicle() {
		Scanner sc = new Scanner(System.in);
		Vehicle v = new Vehicle();
		System.out.println("Enter a make");
		v.make=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter a mode");
		v.mode=sc.nextLine();
		System.out.println("Enter a year");
		v.year=sc.nextInt();
		
		
	}
	
}

class Car extends Vehicle{
	int numberOfDoors;

	public Car(String make, String mode, int year, int numberOfDoors) {
		super(make, mode, year);
		this.numberOfDoors = numberOfDoors;
	}

	public Car(String make, String mode, int year) {
		super(make, mode, year);
	}
	
	
}
