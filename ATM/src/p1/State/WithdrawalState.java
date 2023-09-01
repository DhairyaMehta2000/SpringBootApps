package p1.State;

public class WithdrawalState implements ATMState {
    @Override
    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    @Override
    public void enterPin(String pin) {
        System.out.println("PIN already entered.");
    }
    
    @Override
	public void selectOperation(String type) {
    	 System.out.println("Operation withdrawal started");
	}
    
    @Override
	public void displayBalance() {
		System.out.println("Select display balance for this operation.");
	}

    @Override
    public void withdrawMoney(double amount) {
        System.out.println("Withdrawing $" + amount + ". Please take your cash.");
    }
    
    @Override
    public void ejectCard() {
        System.out.println("Card ejected 1.");
    }
}

