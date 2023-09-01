package p1.State;

public class CheckBalanceState implements ATMState{

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
    	 System.out.println("Operation display balance started");
	}
    
    @Override
	public void displayBalance() {
		System.out.println("Balance is 100 Rs");
		
	}
	@Override
	public void withdrawMoney(double amount) {
	System.out.println("cannot perform this operation");
		
	}

	@Override
	public void ejectCard() {
		System.out.println("card ejected");
		
	}

	

}
