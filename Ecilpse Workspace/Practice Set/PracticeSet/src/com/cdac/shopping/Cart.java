package com.cdac.shopping;

import java.util.ArrayList;

public class Cart {
	ArrayList<CartItem> clist; 

    public Cart() {
        clist = new ArrayList<>();
    }

    public Cart(ArrayList<CartItem> clist) {
        this.clist = clist;
    }

    public void addCartItem(CartItem item) {
        clist.add(item);  // Add the CartItem to the list
    }

    public void displayCartItems() {
        for (CartItem item : clist) {
            item.display();
        }
    }
   
    public double calculateTotalPrice() {
        double total = 0;
        for (CartItem item : clist) {
            total += item.TotalPrice();
        }
        return total;
    }
	
}
