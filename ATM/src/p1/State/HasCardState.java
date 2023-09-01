package p1.State;

public class  HasCardState implements ATMState {
    @Override
    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    @Override
    public void enterPin(String pin) {
        System.out.println("PIN entered. Please wait for validation.");
    }
    
    @Override
	public void selectOperation(String type) {
    	 System.out.println("No card inserted. Please insert a card first.");
	}
    
    @Override
	public void displayBalance() {
		System.out.println("No card inserted. Please insert a card first.");
		
	}

    @Override
    public void withdrawMoney(double amount) {
        System.out.println("PIN not entered. Please enter your PIN first.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected.");
    }

    
}

