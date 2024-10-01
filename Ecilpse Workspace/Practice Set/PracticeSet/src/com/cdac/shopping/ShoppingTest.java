package com.cdac.shopping;

import java.util.ArrayList;

public class ShoppingTest {
	public static void main(String[] args) {
		Product p1 = new Product(101, "Laptop", 750.00);
        Product p2 = new Product(102, "Smartphone", 500.00);
        Product p3 = new Product(103, "Headphones", 150.00);

        // Create CartItem objects
        CartItem item1 = new CartItem(p1, 1); // 1 Laptop
        CartItem item2 = new CartItem(p2, 2); // 2 Smartphones
        CartItem item3 = new CartItem(p3, 3); // 3 Headphones

        // Create a Cart object
        Cart cart = new Cart();

        // Add CartItem objects to the Cart
        cart.addCartItem(item1);
        cart.addCartItem(item2);
        cart.addCartItem(item3);

        // Display all items in the cart
        System.out.println("Cart Items:");
        cart.displayCartItems();

        // Calculate and display the total price of the cart
        double totalPrice = cart.calculateTotalPrice();
        System.out.println("\nTotal Price of all items in the cart: $" + totalPrice);	
	
	}

}
