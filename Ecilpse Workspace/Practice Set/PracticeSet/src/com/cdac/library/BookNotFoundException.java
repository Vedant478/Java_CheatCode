package com.cdac.library;

public class BookNotFoundException extends Exception{
	public BookNotFoundException() {
		System.out.println("Book not Found Exception");
	}
	
	public BookNotFoundException(String msg) {
		super(msg);
	}
}
