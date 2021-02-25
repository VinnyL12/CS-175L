import java.util.Scanner;
public class BankAccountTester {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please input your starting balance: ");
		double startBal = in.nextDouble();
		
		BankAccount myBankAccount = new BankAccount(startBal);
		
		System.out.print("Please input the amount of money you would like to withdraw: ");
		double withDrawAmount = in.nextDouble();
		myBankAccount.withdraw(withDrawAmount);
		System.out.println("Please input the amount of money you would like to deposit: ");
		double depositAmount = in.nextDouble();
		myBankAccount.deposit(depositAmount);
		System.out.println("Your current Balance is: $" + myBankAccount.getBalance());
	}

}
