package com.cdac.excepassign;

class NegatvePriceException extends Exception {
	public NegatvePriceException() {
		System.out.println("Cannot Enter Negative Price");
		
	}
	public NegatvePriceException(String msg) {
		super(msg);
	}
}
