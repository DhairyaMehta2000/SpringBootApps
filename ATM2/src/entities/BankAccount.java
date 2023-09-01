package entities;

public class BankAccount {

	private double balance;
	
	final public double updateBalance(double amount) {
		this.balance = balance-amount;
		return balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
