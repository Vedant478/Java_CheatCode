package com.cdac.librarymanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {
	
	ArrayList<Library> llist = new ArrayList<Library>();
	
	void addBook() {
		Scanner sc = new Scanner(System.in);
		Library l =  new Library();
		
		System.out.println("Enter a title of book");
		l.title=sc.nextLine();
		System.out.println("Enter a author of book");
		l.author=sc.nextLine();
		System.out.println("Enter a ISBN no");
		l.ISBN=sc.nextInt();
		
		llist.add(l);
		System.out.println("Book added successfully");
	}

	void removeBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ISBN of book to remove");
		int rem = sc.nextInt();
		boolean flag = false;
		for (Library l:llist)
		{
			if(l.ISBN==rem)
			{
				flag=true;
				llist.remove(l);
				System.out.println("Book removed Successfully");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Book not Found");
		}
	}
	
	void displayBook() {
		for (Library l : llist)
		{
			System.out.println(l);
		}
	}
	
	void searchBookbyName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Title of Book to search");
		String ser = sc.nextLine();
		boolean search = false;
		for (Library l : llist)
		{
			
			if(l.title.equalsIgnoreCase(ser)) {
				search=true;
				System.out.println("Title: "+l.title+" Author: "+l.author+" ISBN: "+l.ISBN);
				break;
			}
		}
		if(search==false)
		{
			System.out.println("Invalid title of the book");
		}
	
	}
	
	
}
