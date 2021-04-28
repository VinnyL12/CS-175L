import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount Gil = new BankAccount("Gil", 500);
		BankAccount Joe = new BankAccount("Joe", 500);
		BankAccount Fred = new BankAccount("Fred", 500);
		BankAccount Sally = new BankAccount("Sally", 500);
		double account=0;
		
		ArrayList <BankAccount> accountList = new ArrayList<>();
		accountList.add(Gil);
		accountList.add(Joe);
		accountList.add(Fred);
		BankAccount account2 = accountList.get(0);
		
		for(BankAccount employee: accountList)
		{
			System.out.println(employee.getAccount());
		}
		
		accountList.add(Sally);
		
		for(int i = 0; i < accountList.size(); i++)
		{
			if(accountList.get(i).getBalance() > account)
			{
				account2 = accountList.get(i);
				account = accountList.get(i).getBalance();
			}
		}
		
		System.out.println();
		
		System.out.println("1st Highest Balance: " + account2.getAccount());
		account2 = accountList.get(0);
		account = 0;
		
		accountList.remove(Sally);
		for(int x = 0; x < accountList.size(); x++)
		{
			if(accountList.get(x).getBalance() > account)
			{
				account2 = accountList.get(x);
				account = accountList.get(x).getBalance();
			}
		}
		
		System.out.println();
		System.out.println("Highest Balance (after loop): " + account2.getAccount());
		
	}

}
