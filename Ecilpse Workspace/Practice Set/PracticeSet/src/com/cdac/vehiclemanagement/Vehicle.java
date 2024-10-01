package com.cdac.vehiclemanagement;

public class Vehicle {
	String make;
	String model;
	int year;
	protected double rentalPrice;
	
	public Vehicle(String make, String model, int year, double rentalPrice) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.rentalPrice = rentalPrice;
	}

	public Vehicle() {
		super();
	}

	@Override
	public String toString() {
		return "Make=" + make + ", Model=" + model + ", Year=" + year + ", RentalPrice=" + rentalPrice;
	}
	
	public void displayVehicle() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Base Rental Price: $" + rentalPrice + " per day");
    }
	public double calculateRentaldays(int days) {
        return rentalPrice *days;
    }
}

class Economy extends Vehicle {

	public Economy(String make, String model, int year ) {
		super(make, model, year, 40.00);
	}
}

class Luxury extends Vehicle{

	public Luxury(String make, String model, int year) {
		super(make, model, year, 100.00);
	}
	
}

class SUV extends Vehicle{

	public SUV(String make, String model, int year) {
		super(make, model, year, 70.00);
	}
	
}

