/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/

public class BankAccount
{
   private double balance;
   private double interestPercent;
   private double interest;

   /**
      Constructs a bank account with zero balance.
   */
   public BankAccount(double startBal,double interestPct)
   {
      balance = startBal;
      interestPercent = interestPct;
      System.out.println("Created new account with $" + balance + " and interest rate " + interestPct);
   }

   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double amount)
   {
      balance = balance + amount;
      System.out.println("Deposited: $" + amount);
   }

   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double amount)
   {
	  if (amount > balance)
	  {
		  System.out.println("Insufficient Funds to support withdrawal");
	  }
	  else
	  {
		  balance = balance - amount;
		  System.out.println("Withdrew: $" + amount);
	  }  	 
   }
   
   public void calcInterest()
   {
	  interest=balance*interestPercent;
	  balance = interest + balance;
   }
   /**
      Gets the current balance of this bank account.
      @return the current balance
   */
   public void BankThreshold(double startBal, double interestPct)
   {
	   balance = startBal;
	   interestPercent = interestPct;
   }
   
   public double getBalance()
   {
      return balance;
   }
}
