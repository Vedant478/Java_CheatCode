package com.cdac.vehiclemanagement;

import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter vehicle make:");
        String make = sc.nextLine();

        System.out.println("Enter vehicle model:");
        String model = sc.nextLine();

        System.out.println("Enter vehicle year:");
        int year = sc.nextInt();

        System.out.println("Enter vehicle type (Economy/Luxury/SUV):");
        String vehicleType = sc.next();

        System.out.println("Enter number of rental days:");
        int days = sc.nextInt();

        Vehicle vh;

        
        if (vehicleType.equalsIgnoreCase("Economy")) {
            vh = new Economy(make, model, year);
        } else if (vehicleType.equalsIgnoreCase("Luxury")) {
            vh = new Luxury(make, model, year);
        } else if (vehicleType.equalsIgnoreCase("SUV")) {
            vh = new SUV(make, model, year);
        } else {
            System.out.println("Invalid vehicle type. Defaulting to Economy.");
            vh = new Economy(make, model, year);  
        }

        
        System.out.println("\nVehicle Details:");
        vh.displayVehicle();  
        double totalCost = vh.calculateRentaldays(days);  
        System.out.println("Rental cost for " + days + " days: $" + totalCost);

        sc.close();
    }
}
