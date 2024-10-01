package com.cdac.excepassign;

public class ItemNotFound extends Exception {
	public ItemNotFound() {
		System.out.println("Item not Found");
	}
	
	public ItemNotFound(String msg) {
		super(msg);
	}
}
