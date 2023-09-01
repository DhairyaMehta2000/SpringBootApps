package state;

import p1.ATM;
import p1.User;

public interface ATMState {
	void insertCard(ATM atm, User user) throws Exception;

	void enterPin(ATM atm,String pin) throws Exception;
	
	void selectOperation(ATM atm,String operation,User user,double...amount) throws Exception;
	
	void displayBalance(ATM atm, User user) throws Exception;	

	void withdrawMoney(ATM atm,User user, double amount) throws Exception;
	
	void ejectCard(ATM atm) throws Exception;

}
