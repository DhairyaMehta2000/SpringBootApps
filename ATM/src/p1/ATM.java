package p1;

import p1.State.ATMState;
import p1.State.CheckBalanceState;
import p1.State.ExitState;
import p1.State.HasCardState;
import p1.State.IdleState;
import p1.State.SelectOperationState;
import p1.State.ValidationState;
import p1.State.WithdrawalState;

public class ATM {
	private int id;
	private ATMState currentState;
	private static boolean pinEntered;

	public ATM(int id) {
		currentState = new IdleState();
		this.id = id;
	}
	
	public void setState(ATMState state) {
		currentState = state;
	}

	public void insertCard() throws Exception {
		if(currentState.getClass().getSimpleName().equals("IdleState")) {
			currentState.insertCard();
			setState(new HasCardState());
		}else {
			throw new Exception("Please init machine");
		}
		
	}

	public void enterPin(String pin) throws Exception{
		pinEntered=true;
		if(currentState.getClass().getSimpleName().equals("HasCardState")) {
			setState(new ValidationState());
			currentState.enterPin(pin);
		}else {
			throw new Exception("Please insert your card");
		}
		
	}

	public void selectOperation(String type, double ... arguments) throws Exception{
		if(pinEntered==true || currentState.getClass().getSimpleName().equals("ValidationState")) {
			setState(new SelectOperationState());
			switch(type) {
			case "CASH_WITHDRAWAL" : 
//				System.out.println("withdraw");
				setState(new WithdrawalState());
				currentState.withdrawMoney(arguments[0]);
//				setState(new ExitState());
//				currentState.ejectCard();
				break;
			case "DISPLAY_BALANCE" : 
//				System.out.println("display");
				setState(new CheckBalanceState());
				currentState.displayBalance();
//				setState(new ExitState());
//				currentState.ejectCard();
				break;
			default :
				System.out.println("exit");
				setState(new ExitState());
				currentState.ejectCard();
			}
		}else {
			throw new Exception("Please validate card first");
		}
		
	}

	public void ejectCard() {
		currentState.ejectCard();
		setState(new ExitState());
	}

}
