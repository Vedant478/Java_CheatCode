package com.cdac.library;

public class BookUnavailableException extends Exception {
	public BookUnavailableException() {
		System.out.println("Book not available in library");
		
	}
	
	public BookUnavailableException(String msg) {
		super(msg);
	}
}
