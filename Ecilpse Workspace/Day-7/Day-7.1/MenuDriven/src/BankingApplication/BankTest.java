package BankingApplication;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		int choice ;
		Scanner sc = new Scanner(System.in);
		BankManager bmng = new BankManager();
		
		do
		{
			System.out.println("************ Employee operat0ions ************************");
			System.out.println("Press 1 to see account details");
			System.out.println("Press 2 to Deposit the money");
			System.out.println("Press 3 to Withdrawing money");
			System.out.println("Press 4 to Check Balance");
			System.out.println("Press 5 to Delete a Account from bank");
			System.out.println("Press 6 to Exit");
			System.out.println("************************************************************");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			}
		}while (choice!=5);
	}

}
