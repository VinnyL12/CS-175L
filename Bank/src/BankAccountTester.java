import java.util.Scanner;
public class BankAccountTester {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter amount to start the account: ");
		double startBal = in.nextDouble();
		
		System.out.println("Enter the interest rate for this account: ");
		double interestPct = in.nextDouble();
		
		BankAccount myBankAccount = new BankAccount(startBal,interestPct);
		
		System.out.println("Enter amount to deposit in the account: ");
		double depositAmount = in.nextDouble();
		myBankAccount.deposit(depositAmount);
		
		double Bal = myBankAccount.getBalance();
		
		System.out.print("Enter amount to withdraw fom the account: ");
		double withDrawAmount = in.nextDouble();
		myBankAccount.withdraw(withDrawAmount);
		
		double withdrawBal = myBankAccount.getBalance();
		
		if(withdrawBal == Bal)
		{
			System.out.print("Enter amount to withdraw fom the account: ");
			withDrawAmount = in.nextDouble();
			myBankAccount.withdraw(withDrawAmount);
		}
		
		System.out.println("If you want me to generate interest, enter 'Yes'");
		String response = in.next();
		
		if(response.compareTo("Yes")==0)
		{
			myBankAccount.calcInterest();
			System.out.println("The account balance is: $" + myBankAccount.getBalance());
		}
		else
		{
			System.out.println("The account balance is: $" + myBankAccount.getBalance());
		}	
	}
}
