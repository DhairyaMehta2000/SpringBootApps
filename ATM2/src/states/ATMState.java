package states;

import entities.ATM;
import entities.User;

public interface ATMState {

	void insertCard(ATM atm, User user) throws Exception;
	
	void enterPin(ATM atm, int pin) throws Exception;
	
	void selectOperation(ATM atm, User user,String operationType, double... arguments) throws Exception;
	
	void ejectCard(ATM atm, User user) throws Exception;
}
