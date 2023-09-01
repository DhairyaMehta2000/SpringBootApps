package states;

import entities.ATM;
import entities.User;

public class IdleState implements ATMState{

	@Override
	public void insertCard(ATM atm, User user) throws Exception {
		if(atm.getCurrentState()==this) {
			System.out.println("Inserting card ...");
			atm.setCurrentState(new HasCardState());
		}else {
			throw new Exception("System not in Idle State cannot insert card");
		}
		
		
	}

	@Override
	public void enterPin(ATM atm, int pin) throws Exception {
		throw new Exception("Cannot enter pin in Idle State");
		
	}

	@Override
	public void selectOperation(ATM atm, User user, String operationType, double... arguments) throws Exception {
		throw new Exception("Cannot select operation in Idle State");
		
	}

	

	@Override
	public void ejectCard(ATM atm, User user) throws Exception {
		System.out.println("Eject card from Idle State");
		atm.setCurrentState(new ExitState()); 
	}

}
