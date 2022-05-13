package bankingprogram;
/**
 * BankAccount class
 * This class simulates a bank account
 * @author edisongarcia
 *
 */

public class BankAccount {
	double balance;			         //Account balance
	int numDeposits,              	 //Number of deposits
	    numWithdrawals; 			 //Number of withdrawals
	double annualInterestRate,	     //Annual interest rate
		   monthlyServiceCharge,     //Monthly service charge
	       monthlyInterest;

	/**
	 * The constructor initializes the balance
	 * and interestRate fields with the values
	 * passed to startBalance and intRate. The 
	 * interest field is assigned to 0.0.
	 */
	
	public BankAccount(double startBalance, double intRate) {
		balance = startBalance;
		annualInterestRate = intRate;
	}
	
	/**
	 * The deposit method adds the parameter
	 * amount to the balance field.
	 */
	
	public void deposit(double amount) {
		balance += amount;
		numDeposits++;
	}
	
	/**
	 * The withdraw method subtracts the parameter
	 * amount from the balance field.
	 */
	
	public void withdraw(double amount) {
		balance -= amount;
		numWithdrawals++;
	}
	
	/**
	 * The addInterest method adds the interest
	 * for the month to the balance field.
	 */
	
	public void calcInterest() {
		double monthlyInterestRate = (annualInterestRate / 12);
		monthlyInterest = balance * monthlyInterestRate;
		balance += monthlyInterestRate;
	}
	
	public void monthlyProcess() {
		balance -= monthlyServiceCharge;
		calcInterest();
		numDeposits = 0;
		numWithdrawals = 0;
		monthlyServiceCharge = 0;
	}
}
