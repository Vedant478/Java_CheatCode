package com.cdac.shopping;
interface Displayable {
	void display();
}

public class Product  implements Displayable{
	
	@Override
	public String toString() {
		return "ProductId=" + ProductId + ", Name=" + Name + ", price=" + price;
	}

	public Product() {
		super();
	}
	
	public Product(int productId, String name, double price) {
		super();
		ProductId = productId;
		Name = name;
		this.price = price;
	}
	
	int ProductId;
	String Name;
	double price;
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Product Name: " + Name + ", Price: $" + price);
	}
	
	
}

