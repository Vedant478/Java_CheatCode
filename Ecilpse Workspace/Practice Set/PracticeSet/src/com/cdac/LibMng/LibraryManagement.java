package com.cdac.LibMng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagement {
	List<Library> llist = new ArrayList<Library>() ;
	
	public LibraryManagement() {
	llist = new ArrayList<Library>();
	llist.add(new Library("Iron Man","Tony Start","23982472"));
	llist.add(new Library("Captain America","Steve Rogers","2320472"));
	llist.add(new Library("Deadpool","Ryan Reynolds","3298479"));
	llist.add(new ReferenceBook("Enclyopedia","Darwin","2382472","Science"));
	}
	
	
	void displayAllBook() {
		for (Library l : llist) {
	        if (l instanceof ReferenceBook) {
	            ReferenceBook rb = (ReferenceBook) l;
	            System.out.println("title=" + l.title + ", author=" + l.author + ", ISBN=" + l.ISBN+", Category: " + rb.category);
	        } else {
	            System.out.println(l);
	        }
	    
	    }
		
	}
	
	void addBook() {
		Library l = new Library();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a title of book");
		l.title=sc.nextLine();
		System.out.println("Enter a author of book");
		l.author=sc.nextLine();
		System.out.println("Enter a IBSN of book");
		l.ISBN=sc.nextLine();
		System.out.println("Is this a reference book? (yes/no)");
	    String isReference = sc.nextLine();
	    
	    if (isReference.equalsIgnoreCase("yes")) {
	        
	        System.out.println("Enter the category of the reference book:");
	        String category = sc.nextLine();
	        ReferenceBook rb = new ReferenceBook(l.title,l.author,l.ISBN,category);
	        llist.add(rb);
	        System.out.println("Book Added Successfully");
	    } else 
	        llist.add(l);
	    	System.out.println("Book Added Successfully");
	    }
		
	
	void deleteBook() {
		Scanner sc = new Scanner(System.in);
		Library l = new Library();
		boolean flag = false;
		System.out.println("Enter a title of the book to remove");
		String rem = sc.nextLine();
		
		for (Library lb:llist)
		{
			if(lb.title.equalsIgnoreCase(rem))
			{	
				flag=true;
				llist.remove(lb);
				System.out.println("Book removed Successfully");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Book not found");
		}
	}
	}
