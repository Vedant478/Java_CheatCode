package com.cdac.shoppincart;

public class NumberFormatException extends Exception {
	public NumberFormatException() {
		System.out.println("Id cannot be string");
	}
	public NumberFormatException(String msg) {
		super(msg);
	}
}
