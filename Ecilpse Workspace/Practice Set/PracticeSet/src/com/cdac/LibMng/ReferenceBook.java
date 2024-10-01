package com.cdac.LibMng;

public class ReferenceBook extends Library {
	String category;
	
	
	public ReferenceBook() {
		super();
	}
	
	@Override
	public String toString() {
		return "category=" + category;
	}



	public ReferenceBook(String title, String author, String iSBN, String category) {
		super(title, author, iSBN);
		this.category = category;
	}

	
	
	
}
