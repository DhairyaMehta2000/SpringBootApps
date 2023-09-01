package p1;

import state.ATMState;
import state.ExitState;
import state.IdleState;
import state.SelectOperationState;

public class ATM {

	protected User user;
	private ATMState currentState;
	private SelectOperationState selectOperationState;
	
	
	public ATM() {
		user = new User("Dhairya");
		currentState = new IdleState();
        selectOperationState = new SelectOperationState(this);
	}
	
	public void setState(ATMState state) throws Exception{
        currentState = state;
    }
	public ATMState getState() {
		return currentState;
	}
	
	public void insertCard() throws Exception{
        currentState.insertCard(this,user);
    }

    public void enterPin(String pin) throws Exception{
    	if(currentState.getClass().getSimpleName().equals("HasCardState")) {
    		currentState.enterPin(this, pin);
    	}
        
    }

    public void selectOperation(String operation, double amount,User user) throws Exception{
    	  selectOperationState.selectOperation(this, operation, user, amount);
    }
    public void selectOperation(String operation,User user) throws Exception{
    	selectOperationState.selectOperation(this, operation, user, null);
    }

    public void displayBalance() throws Exception{
        selectOperationState.displayBalance(this,user);
    }

    public void withdrawMoney(double amount) throws Exception{
        selectOperationState.withdrawMoney(this,user, amount);
    }

    public void ejectCard() throws Exception {
        currentState.ejectCard(this);
        setState(new IdleState ());
    }
}
