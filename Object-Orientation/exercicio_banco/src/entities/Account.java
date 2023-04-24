package entities;

public class Account {

	private int accountNumber;
	private String holder;
	private double balance;
	
	public Account(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}

	public Account(int accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		depositMoney(initialDeposit);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void depositMoney(double amount) {
		this.balance += amount;
	}
	
	public void withDrawMoney(double amount) {
		this.balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account " + accountNumber 
			+ ", Holder: " + holder 
			+ ", Balance: $ " + String.format("%.2f", balance);
	}
	
}
