package com.cdac.librarymanagement;

import java.util.Scanner;

public class LibraryTest {
	public static void main(String[] args) {
		LibraryManagement lm = new LibraryManagement();
		Scanner sc  =  new Scanner(System.in);
		int choice ;
		
		do {
			System.out.println("************ Library Management ****************");
			System.out.println("Press 1 to Add a Book");
			System.out.println("Press 2 to Remove the book");
			System.out.println("Press 3 to Search the book");
			System.out.println("Press 4 to Display all the books ");
			System.out.println("Press 5 to exit");
			System.out.println("************************************************");
			
			System.out.println("Enter a choice");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				lm.addBook();
				break;
			case 2:
				lm.removeBook();
				break;
			case 3:
				lm.searchBookbyName();
				break;
			case 4:
				lm.displayBook();
				break;
			case 5:
				System.out.println("Exit the Program");
				sc.close();
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			
		} while (choice!=6);
		
		
	}
}
