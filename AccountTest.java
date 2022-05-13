package bankingprogram;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		SavingAccount account;	// To reference a BankAccount object
		
		double balance,			// The account's starting balance 		
			   annualInterestRate,	// The monthly interest rate	 
			   amount, 			// The user's pay
			   cashNeeded;		// The amount of cash to withdraw
		
		//Create a scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		//Get the starting balance
		System.out.println("What is your account's starting balance? ");
		balance = keyboard.nextDouble();
		
		//Get the monthly interest rate
		System.out.println("What is your annual interest rate? ");
		annualInterestRate = keyboard.nextDouble();
		
		//Create a BankAccount object
		account = new SavingAccount(balance, annualInterestRate);
		
		//Get the amount of pay for the month.
		System.out.println("How much were you paid this month?");
		amount = keyboard.nextDouble();
		
		//Deposit the user's pay into the account
		System.out.println("We will deposit your pay into your account.");
		account.deposit(amount);
		System.out.println("Your current balance is $" + balance );
		
		//Withdraw some cash from the account
		System.out.println("How much cash would you like to withdraw? ");
		cashNeeded = keyboard.nextDouble();
		account.withdraw(cashNeeded);
		
		//Add the monthly interest to the account.
		//account.addInterest();
		
		//Display the interest earned and the balance.
		//System.out.println("This month you have earned $" + account.getInterest() + " in interest.");
		//System.out.println("Now your balance is $" +  account.getBalance());
		System.out.println("You have " + balance + " dollars in your account." );

	}

}
