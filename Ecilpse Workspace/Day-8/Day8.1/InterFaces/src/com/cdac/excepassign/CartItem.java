package com.cdac.excepassign;

public class CartItem {
	String ItemName;
	int ItemPrice;
	int quantity;
	
	//Constructor 
	public CartItem(String itemName, int itemPrice, int quantity) {
		super();
		ItemName = itemName;
		ItemPrice = itemPrice;
		this.quantity = quantity;
	}

	public CartItem() {
		super();
	}

	@Override
	public String toString() {
		return "ItemName=" + ItemName + ", ItemPrice=" + ItemPrice + ", quantity=" + quantity;
	}
	
	
	
	
}
