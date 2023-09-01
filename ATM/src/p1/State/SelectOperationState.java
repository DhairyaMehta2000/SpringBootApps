package p1.State;

public class SelectOperationState implements ATMState{

	@Override
    public void insertCard() {
        System.out.println("Card already inserted.");
    }

	@Override
	public void enterPin(String pin) {
		System.out.println("Pin entered");
		
	}

	@Override
	public void selectOperation(String type) {
		System.out.println("Select an opreation from : 1)Withdraw money. 2)Display Balance");
	}

	@Override
	public void displayBalance() {
		System.out.println("balance is 100Rs");
	}

	@Override
    public void withdrawMoney(double amount) {
        if (amount > 0) {
        	System.out.println("withdrawing 100Rs");
//            atm.withdrawMoney(withdrawalAmount);
        } else {
            System.out.println("No withdrawal amount specified.");
        }
    }

	@Override
    public void ejectCard() {
        System.out.println("Card ejected.");
//        atm.setState(new ExitState());
    }
	
	
	

}
