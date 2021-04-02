import java.util.Scanner;

public class BankThreshold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter starting account balance: ");
		double startingBal=in.nextDouble();
		
		System.out.println("Enter interest: ");
		double interest = in.nextDouble();
		
		BankAccount myBankAccount = new BankAccount(startingBal, interest);
		
		System.out.println("Enter the threshold that the account balance must reach: ");
		
		while(in.hasNextDouble())
			{
				double threshold = in.nextDouble();
				int m = 0;
						
				while(myBankAccount.getBalance() < threshold)
				{
					myBankAccount.calcInterest();
					m++;						
				}
				System.out.println("It will take " + m + " months to reach the threshold: $" + threshold);
				myBankAccount.BankThreshold(startingBal, interest);		
			}
			in.close();
		}
	}
	
			
	

		


