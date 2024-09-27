package BankingApplication;

public class BankManager {
	BankModule[] bm = new BankModule[5];
	
	void DisplayAccDetails()
	{
		for (int i=0;i<bm.length;i++)
		{
			if(bm[i]!=null)
			{
				System.out.println(bm[i]);
			}
		}
	}
}
