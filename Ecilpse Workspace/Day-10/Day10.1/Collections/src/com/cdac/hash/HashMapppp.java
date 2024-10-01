package com.cdac.hash;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Customer
{
	int Cid;
	String Name;
	public Customer(int cid, String name) {
		super();
		Cid = cid;
		Name = name;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Cid=" + Cid + ", Name=" + Name;
	}
	
	
}

class Product
{
	int Pid;
	String ProductName;
	public Product(int pid, String productName) {
		super();
		Pid = pid;
		ProductName = productName;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Pid=" + Pid + ", ProductName=" + ProductName;
	}
	
	
}
public class HashMapppp {
	public static void main(String[] args) {
		HashMap<Customer,Product> cp = new HashMap<Customer, Product>();
		
		cp.put(new Customer(101,"Ram") ,new Product(1001,"T-Shirt"));
		cp.put(new Customer(102,"Shaam") ,new Product(1002,"Shirt"));
		cp.put(new Customer(103,"Geeta") ,new Product(1003,"Top"));
		cp.put(new Customer(104,"Seeta") ,new Product(1004,"Saree"));
		cp.put(new Customer(105,"Ramesh") ,new Product(1005,"Phone"));

		for(Map.Entry<Customer, Product> en:cp.entrySet())		{
			System.out.println("CID: "+en.getKey().Cid+"C Name"+en.getKey().Name+"Pid: "+en.getValue().Pid+"P Name: "+en.getValue().ProductName);
		}
		
		for(Map.Entry<Customer, Product> en:cp.entrySet())		
		{
			System.out.println("Customer: "+en.getKey()+" Product: "+en.getValue());
		}
		
		for(Customer c: cp.keySet())
		{
			System.out.println(c);
		}
		for(Product p : cp.values())
		{
			if(p.Pid==1009)
			{
				System.out.println(p);
			}
			
		}
		
		List<Product> plist=(List<Product>)cp.values();
		Collections.sort(plist,(p1,p2)->p1.Pid);
	}
}
