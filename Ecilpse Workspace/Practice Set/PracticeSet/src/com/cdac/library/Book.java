package com.cdac.library;

public class Book {
	String Title;
	int availableCopies;
	
	public Book(String title, int availableCopies) {
		super();
		Title = title;
		this.availableCopies = availableCopies;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Title=" + Title + ", availableCopies=" + availableCopies ;
	}
	
	
	
}
