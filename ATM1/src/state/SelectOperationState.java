package state;

import p1.ATM;
import p1.User;

public class SelectOperationState implements ATMState {
	private ATM atm;

	public SelectOperationState(ATM atm) {
		this.atm = atm;
	}

	public SelectOperationState(ATM atm, User user) {
		this.atm = atm;
	}

	@Override
	public void insertCard(ATM atm, User user) throws Exception {
		throw new Exception("Card already inserted.");
	}

	@Override
	public void enterPin(ATM atm, String pin) throws Exception {
		throw new Exception("PIN already entered.");
	}

	@Override
	public void selectOperation(ATM atm, String operation, User user, double... arguments) throws Exception {
//    	System.out.println(atm.getState().getClass().getSimpleName());
		if (atm.getState().getClass().getSimpleName().equals("SelectOperationState") ) {
			switch (operation) {
			case "WITHDRAW_MONEY":
				withdrawMoney(atm, user, arguments[0]);
				break;

			case "DISPLAY_BALANCE":
				displayBalance(atm, user);
				break;

			default:
				break;
			}
		} else {
			throw new Exception("Cannot perform operations... not in selectOperation mode");
		}

	}

	@Override
	public void displayBalance(ATM atm, User user) throws Exception {
		System.out.println("Displaying Balance");
		System.out.println(user.getCard().getAccount().balance);

		// Your logic to display balance
		atm.setState(new SelectOperationState(atm, user));
	}

	@Override
	public void withdrawMoney(ATM atm, User user, double amount) throws Exception {
		System.out.println("Withdrawing money...");
		// Your logic to withdraw money
		if (amount > user.getCard().getAccount().balance) {
			System.out.println("Insufficient Funds...");
		} else {
			user.getCard().getAccount().updateAmount(amount);
			System.out.println(amount + " withdrawn. Remaining balance is " + user.getCard().getAccount().balance);

		}
		atm.setState(new SelectOperationState(atm, user));
	}

	@Override
	public void ejectCard(ATM atm) throws Exception {
		System.out.println("Card ejected.");
		atm.setState(new ExitState());
	}
}