package com.cdac.shoppincart;

import java.util.Scanner;

public class ShoppingCart {
	public static void main(String[] args) throws NumberFormatException {
		int choice;
		Scanner sc =  new Scanner(System.in);
		
		ShoppinCartManager scm = new ShoppinCartManager();
		
		do {
			System.out.println("************ Shopping Cart Management **************");
			System.out.println("Press 1 to Add a item");
			System.out.println("Press 2 to calculate the total price of your cart");
			System.out.println("Press 3 to display all items");
			System.out.println("****************************************************");
			
			System.out.println("Enter a choice");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				try {
					scm.addItem();
					break;
				} catch (NumberFormatException e) {
					System.out.println("Error: "+e.getMessage());
				}
				catch (ArithmeticException e) {
					System.out.println("Error: "+e.getMessage());
				}
				
			case 2: 
				try {
					scm.CalulateTotalPrice();
					break;
				} catch (ArithmeticException e) {
					System.out.println("Error: "+e.getMessage());
				}
				
			case 3: 
				scm.displayItems();
				break;
			case 4: 
				System.out.println("Program Exited");
				sc.close();
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		} while (choice!=4);
	}
}
