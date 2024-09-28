package com.cdac.generic;
class Demo // Super Class
{
	
}
class Demo1 extends Demo // Sub Class
{
	
}
public class GenericDemo<T extends Demo>
{
	T Num1;
	T Num2;
	
	void ShowData() {
		System.out.println("Num1: "+this.Num1+" Num2: "+this.Num2);
	}
	
	public static void main(String[] args) {
		GenericDemo<Demo> d1 = new GenericDemo<Demo>();
		d1.Num1=new Demo();
		
		d1.Num2=new Demo();
		}
	
	public static void main3(String[] args) {
		GenericDemo<String> g1 = new GenericDemo<String>();
		GenericDemo<String> g2 = new GenericDemo<String>();
		
		g2.Num1="Malkeet";
		g2.Num2="Singh";
		
		g2.ShowData();
	}
	
	public static void main2(String[] args) {
		GenericDemo<Integer> in1 = new GenericDemo<Integer>(); //Bounded Type
		
		in1.Num1=100;
		in1.Num2=200;
		
		in1.ShowData();
		
		//in1.Num1 = "Malkeet";
	}
	
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		GenericDemo d1 = new  GenericDemo<>();
		GenericDemo d2 = new  GenericDemo<>();

		d1.Num1=100;
		d1.Num2=200;
		d2.Num1="Malkeet";
		d2.Num2= "Singh";		
		d1.ShowData();
		d2.ShowData();
 	}

}
