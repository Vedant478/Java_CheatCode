package com.cdac.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	ArrayList<Book> blist;
	
	public Library() {
		blist = new ArrayList<Book>();
		blist.add(new Book("Iron Man", 3));
		blist.add(new Book("Captian America", 4));
		blist.add(new Book("Hulk", 5));
		blist.add(new Book("Spider Man", 2));
		blist.add(new Book("Hawkeye", 1));				
	}
	
	void getBook() {
		for ( Book bo:blist) {
			System.out.println(bo);
		}
	}
	
	void addBook() {
		Scanner sc = new Scanner(System.in);
		Book b = new Book();
		
		System.out.println("Enter Name of Book");
		b.Title=sc.nextLine();
		System.out.println("Enter No. of Available Copies");
		b.availableCopies=sc.nextInt();
		
		blist.add(b);
		System.out.println("Books Added Successfully");
	}
	
	void loanBook() throws BookUnavailableException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of Book");
		String rb=sc.nextLine();
		boolean found = false;
		for(Book b:blist)
		{
			if (b.Title.equalsIgnoreCase(rb)) {
				if (b.availableCopies > 0) { 
					b.availableCopies--;  
					System.out.println("Successfully loaned");
		        } 
			}
		}
		if (!found);
		{
			throw new BookUnavailableException("No available to loan");
		}
	}
	
	void returnBook() throws BookNotFoundException {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of book u want to return");
		String rb=sc.nextLine();
		boolean found = false;
		for (Book b:blist) {
			
			if(b.Title.equalsIgnoreCase(rb)){
				found =true;
				b.availableCopies++;
				System.out.println("Successfully returned: " + rb);
	            break;
			}
		}	
		if(!found)
		{
			throw new BookNotFoundException("Cannot return Book pls leave");
		}
}
}
