package p1.State;

import p1.ATM;
import p1.User;

public interface ATMState {
	void insertCard(ATM atm, User user);

	void enterPin(ATM atm,String pin);
	
	void selectOperation(ATM atm);
	
	void displayBalance(ATM atm, User user);	

	void withdrawMoney(ATM atm,User user, double amount);
	
	void ejectCard(ATM atm);
}
