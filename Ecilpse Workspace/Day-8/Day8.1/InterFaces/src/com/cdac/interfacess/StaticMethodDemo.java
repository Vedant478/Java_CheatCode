package com.cdac.interfacess;
interface Int2{
	static void Show() { // Static Method of Int2
		System.out.println("Am static of int2");
	}
}

class Demo2 implements Int2
{
	static void Show() // Static method of Demo2
	{
		Int2.Show();
		System.out.println("Am static of Demo2");
	}
}
public class StaticMethodDemo {

	public static void main(String[] args) {
		Demo2.Show();
		
		Int2.Show();
	}

}
