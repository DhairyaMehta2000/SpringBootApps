package states;

import entities.ATM;
import entities.User;

public class SelectOperationState implements ATMState {

	@Override
	public void insertCard(ATM atm, User user) throws Exception {
		throw new Exception("Cannot insert card in select operation state");

	}

	@Override
	public void enterPin(ATM atm, int pin) throws Exception {
		throw new Exception("Cannot insert pin in select operation state");

	}

	final public boolean withdrawCash(ATM atm, User user, double amount) {
		if(amount>user.getCard().getAccount().getBalance()) {
			return false;
		}else {
			return true;
		}
	}
	
	@Override
	public void selectOperation(ATM atm, User user, String operationType, double... arguments) throws Exception {
		if(atm.getCurrentState()==this) {
			switch(operationType) {
			case "CASH_WITHDRAWAL" :
				if(withdrawCash(atm,user,arguments[0])) {
					user.getCard().getAccount().updateBalance(arguments[0]);
					System.out.println("Withdrawing "+arguments[0]+" current balance is "+atm.getUser().getCard().getAccount().getBalance());
					atm.setCurrentState(this);
					break;
				}else {
					System.out.println("Insufficient funds...");
					atm.setCurrentState(this);
					break;
				}
				
			case "DISPLAY_BALANCE":
				
				System.out.println("Current balance is "+user.getCard().getAccount().getBalance());
				atm.setCurrentState(this);
				break;
			}
		}else {
			throw new Exception("Not in select operation state, cannot select operation");
		}
		// TODO Auto-generated method stub
	}

	@Override
	public void ejectCard(ATM atm, User user) throws Exception {
		System.out.println("exiting from select operation state");
		atm.setCurrentState(new ExitState());
		
		
	}


}
