package bankingprogram;

public class SavingAccount extends BankAccount {
	boolean active;
	
	// Constructor sends balance and interest rate to BankAccount
	public SavingAccount(double balance, double annualInterestRate) {
		super(balance, annualInterestRate);
		if (balance < 25) {
			active = false;
		}else{
			active = true;
		}
	}
	
	@Override
	public void withdraw(double amount){
		if(active == true) {
			super.withdraw(amount);
		}else{
			System.out.println("Account is inactive.");
		}
	}
	
	@Override
	public void deposit(double amount) {
		if(active == true) {
			super.deposit(amount);
		}else{
			System.out.println("Account is inactive.");
		}
	}
	@Override
	public void monthlyProcess() {
		if (numWithdrawals > 4) {
			monthlyServiceCharge += (numWithdrawals - 4);
		}
		if (balance < 25) {
			active = false;
		}
	}
}
