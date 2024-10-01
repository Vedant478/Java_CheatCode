package com.cdac.shoppincart;

public class Shopping  {
	int id;
	String Name;
	int quantity;
	int price;
	public Shopping(int id, String name, int quantity, int price) {
		super();
		this.id = id;
		Name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public Shopping() {
		super();
	}
	@Override
	public String toString() {
		return "Id=" + id + ", Name=" + Name + ", quantity=" + quantity + ", price=" + price;
	}	
}
