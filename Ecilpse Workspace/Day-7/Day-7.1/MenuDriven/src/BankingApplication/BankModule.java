package BankingApplication;

public class BankModule {
	int AccNo;
	String Name;
	double balance;
	
	public BankModule(int accNo, String name,double bal) {
		AccNo = accNo;
		Name = name;
		balance = bal;
	}

	public BankModule() {

	}

	@Override
	public String toString() {
		return "AccNo=" + AccNo + ", Name=" + Name;
	}
}
