package p1.State;

public class IdleState implements ATMState {
    @Override
    public void insertCard() {
        System.out.println("Card inserted. Please enter your PIN.");
    }

    @Override
    public void enterPin(String pin) {
        System.out.println("No card inserted. Please insert a card first.");
    }

    @Override
	public void selectOperation(String type) {
    	 System.out.println("No card inserted. Please insert a card first.");
	}
    @Override
    public void withdrawMoney(double amount) {
        System.out.println("No card inserted. Please insert a card first.");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card to eject.");
    }

	@Override
	public void displayBalance() {
		System.out.println("No card inserted. Please insert a card first.");
		
	}

	

	
}

