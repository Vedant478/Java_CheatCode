package com.cdac.library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		Library lb= new Library();
		
		do {
			System.out.println("****************** Library operation ************************");
			System.out.println("Press 1 to view all books");
			System.out.println("Press 2 to add a book");
			System.out.println("Press 3 to loan a book");
			System.out.println("Press 4 to return a book");
			System.out.println("Press 5 to exit");
			System.out.println("*************************************************************");
		
			System.out.println("Enter a choice");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
				lb.getBook();
				break;			
			case 2:
				lb.addBook();
				break;
			case 3:
				try {
					lb.loanBook();
				} catch (BookUnavailableException e) {
					// TODO: handle exception
					System.out.println("Error: "+e.getMessage());
				}
				break;
			case 4:
				try {
					lb.returnBook();
				} catch (BookNotFoundException e) {
					// TODO: handle exception
					System.out.println("Error: "+e.getMessage());
				}
				
				break;
			case 5:
				System.err.println("Program Exited");
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		} while (choice!=5);
		
		
	}
}
