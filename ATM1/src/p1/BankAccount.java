package p1;

public class BankAccount {

	public double balance;
	
	final public void updateAmount(double amount) {
		balance = balance-amount;
	}
}

