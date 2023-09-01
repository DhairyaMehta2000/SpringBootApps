package states;

import entities.ATM;
import entities.User;

public class ExitState implements ATMState {

	@Override
	public void insertCard(ATM atm, User user) throws Exception {
		throw new Exception("Cannot insert card in exit state");

	}

	@Override
	public void enterPin(ATM atm, int pin) throws Exception {
		throw new Exception("Cannot enter pin  in exit state");

	}

	@Override
	public void selectOperation(ATM atm, User user, String operationType, double... arguments) throws Exception {
		throw new Exception("Cannot select operation in exit state");

	}
	
	@Override
	public void ejectCard(ATM atm, User user) throws Exception {
		if(atm.getCurrentState()==this) {
			System.out.println("Exiting from exit state");
			atm.setCurrentState(new ExitState());
		}else {
			throw new Exception("Something went wrong");
			
		}
	}

}
