package com.cdac.shopping;

public class CartItem implements Displayable {
	public CartItem() {
		super();
	}



	public CartItem(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}


	Product product;
	int quantity;
	
	@Override
	public void display() {
		System.out.println("Product: " + product + ", Quantity: " + quantity + ", Total Price: $" + TotalPrice());
		
	}
	
	
	double TotalPrice() {
		return product.price*quantity;
	}
}
