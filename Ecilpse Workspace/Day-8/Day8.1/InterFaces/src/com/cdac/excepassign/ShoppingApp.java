package com.cdac.excepassign;

import java.util.Scanner;

public class ShoppingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		ShoppingCart sca = new ShoppingCart();
		do {
			System.out.println("****************** Shopping operation ************************");
			System.out.println("Press 1 to add an Item in Cart");
			System.out.println("Press 2 to View your Cart");
			System.out.println("Press 3 to Remove Item From Cart");
			System.out.println("Press 4 to Calculate Total Price");
			System.out.println("Press 5 to Exit");
			System.out.println("***************************************************************");
			
			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				try {
					sca.addItem();
				} catch (NegatvePriceException e) {
					System.out.println("Error: "+e.getMessage());
				}
				
				break;
			case 2:
				sca.ViewCart();
				break;
			case 3:
				try {
					sca.removeItem();
				} catch (ItemNotFound e) {
					System.out.println("Error: "+e.getMessage());
				}
				
				break;
			case 4:
				sca.calculateTotalPrice();
				break;
			case 5:
				System.out.println("Program Exited");
				break;
			default:
				System.out.println("Program Exited ! Have a Nice day");
				break;
			}
		} while (choice!=5);

	}

}
