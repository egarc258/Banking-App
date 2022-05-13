package bankingprogram;
import java.util.Scanner;

public class TestDriver {

	public static void main(String[] args) {
		
		SavingAccount savingAccount = new SavingAccount(150,0.05);
		BankAccount bankAccount = new BankAccount(150,0.05);
		
		savingAccount.deposit(84);
		savingAccount.withdraw(98);
		savingAccount.monthlyProcess();
		System.out.println("Balance: $" + savingAccount.balance);
		
		bankAccount.deposit(84);
		bankAccount.withdraw(98);
		bankAccount.monthlyProcess();
		System.out.println("Balance: $" + bankAccount.balance, 2);
		
		
		
		

	}

}
