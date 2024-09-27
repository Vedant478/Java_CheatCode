package com.cdac.interfacess;

interface Int1
{
	void Show();  // abstract public void show();
}

class Demo1 implements Int1
{
	public void Show() {
	System.out.println("Am show def by Demo1");
	}
}
public class JavaInterfaces {
	
	// lambda function (shorter syntax thats the reason we use lamda function)
	public static void main(String[] args) {
		Int1 ref=() -> {
			System.out.println("Hello");
		};
		
		ref.Show();
	}
	
	
	//--------------------------------------------//
	public static void main2(String[] args) {
		Int1 ref1 = new Int1() { // Anonymous ends with semi-colon(;)
			
			@Override
			public void Show() {
				// TODO Auto-generated method stub
				System.out.println("Show def by anon class");
			}
		};
		ref1.Show();
	}
	
	//-----------------------------------------//
	public static void main1(String[] args) {
		Demo1 d1 = new Demo1();
		d1.Show();
	}
}
