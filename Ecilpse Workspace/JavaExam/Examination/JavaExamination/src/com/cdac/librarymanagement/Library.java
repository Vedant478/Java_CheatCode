package com.cdac.librarymanagement;

public class Library {
	String title;
	String author;
	int ISBN;
	
	public Library(String title, String author, int iSBN) {
		super();
		this.title = title;
		this.author = author;
		ISBN = iSBN;
	}

	public Library() {
		super();
	}

	@Override
	public String toString() {
		return "title=" + title + ", author=" + author + ", ISBN=" + ISBN;
	}
	
	
	
	
	
}
