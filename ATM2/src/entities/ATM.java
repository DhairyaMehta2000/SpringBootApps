package entities;

import states.ATMState;
import states.IdleState;

public class ATM {

	private int id;
	private User user;
	private ATMState currentState;

	public ATM(int id,User user) {
		this.id = id;
		this.user=user;
		currentState = new IdleState();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ATMState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(ATMState currentState) {
		this.currentState = currentState;
	}

	final public void insertCard(User user) throws Exception{
		currentState.insertCard(this, user);
	}
	
	final public void enterPin( int pin) throws Exception{
		currentState.enterPin(this,pin);
	}
	
	final public void selectOperation(User user, String operationType, double amount) throws Exception {
		currentState.selectOperation(this, user, operationType, amount);
	}
	
	final public void selectOperation(User user, String operationType) throws Exception{
		currentState.selectOperation(this,user, operationType);
	}
	
	final public void ejectCard() throws Exception {
		currentState.ejectCard(this, user);
		currentState = new IdleState();
	}
}
