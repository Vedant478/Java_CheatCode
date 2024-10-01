package com.cdac.LibMng;

import java.util.Scanner;

public class LibApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		LibraryManagement lm = new LibraryManagement();
		
		do {
			System.out.println("*************** Library Operations *******************");
			System.out.println("Press 1 to View all books");
			System.out.println("Press 2 to Add a new Book");
			System.out.println("Press 3 to Remove a book");
			System.out.println("Press 4 to Exit");
			System.out.println("******************************************************");
			
			System.out.println("Enter a Choice");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				lm.displayAllBook();
				break;
			case 2:
				lm.addBook();
				break;
			case 3:
				lm.deleteBook();
				break;
			case 4:
				sc.close();
			default:
				System.out.println("Invalid Input");
				break;
			}
			
		} while (choice!=5);
	}
}
