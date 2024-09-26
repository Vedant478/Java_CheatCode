package com.cdac.inner;
class ABC{
	int Num1;
	class XYZ { //Only inner class is static
		int Num2;
		void Show()
		{
			System.out.println("Value of Num2 "+this.Num2);
		}
	}
	void Show() {
		System.out.println("Value of Num1 "+this.Num1);

	}
}
class PQR
{
	static int P; // Static Var
	int Q; // Non Static var
	static class JKl{
		static int K;
		int J;
		void Show()
		{
			System.out.println("Value of j : "+this.J);
		}
	}
}
public class InnerClassDemo {
	public static void main(String[] args) {
		/// Q can be accessed used making instance
		PQR.JKl j1 = new PQR.JKl();
		PQR.P=200;

		PQR.JKl.K=100;
		
		System.out.println(PQR.JKl.K);
	}
	
	public static void main1(String[] args) {
		ABC a1 = new ABC(); // Instance of outer class
		ABC.XYZ xy =a1.new XYZ(); // Instance of inner class
		
		xy.Num2=100;
		xy.Show();
	}
}
