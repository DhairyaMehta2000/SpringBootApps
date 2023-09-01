package states;

import entities.ATM;
import entities.User;

public class HasCardState implements ATMState {

	@Override
	public void insertCard(ATM atm, User user) throws Exception {
		throw new Exception("Card already inserted, insert pin now");

	}

	final public boolean validatePin(ATM atm, int pin) {
		if (atm.getUser().getCard().getPin() == pin) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void enterPin(ATM atm, int pin) throws Exception {
		if (atm.getCurrentState() == this) {
			if (validatePin(atm, pin)) {
				System.out.println("Pin Validated, select one of the below options");
				atm.setCurrentState(new SelectOperationState());
			} else {
				throw new Exception("Invalid pin, try again");
				
			}
		}
		else {
			atm.setCurrentState(this);
		}

	}

	@Override
	public void selectOperation(ATM atm, User user, String operationType, double... arguments) throws Exception {
		throw new Exception("Cannot select operation, insert pin now");

	}

	@Override
	public void ejectCard(ATM atm, User user) throws Exception {
		System.out.println("Ejecting card from HasCardState");
		atm.setCurrentState(new ExitState());

	}

}
