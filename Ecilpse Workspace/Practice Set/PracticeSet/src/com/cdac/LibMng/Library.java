package com.cdac.LibMng;

public class Library {
	String title;	
	String author;
	String ISBN;
	
	public Library(String title, String author, String iSBN) {
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

