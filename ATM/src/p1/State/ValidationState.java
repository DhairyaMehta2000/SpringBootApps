package p1.State;

public class ValidationState implements ATMState {
    private boolean pinEntered = false;

    @Override
    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    @Override
    public void enterPin(String pin) {
        if (pin.equals("1234")) {
            System.out.println("PIN accepted. Please select an option.");
            pinEntered = true;
        } else {
            System.out.println("Invalid PIN. Card ejected.");
            pinEntered = false;
        }
    }
    
    @Override
	public void selectOperation(String type) {
    	if(pinEntered) {
    		System.out.println("Select operation type");
    	}
    	else {
    		System.out.println("No operation selected, please select one of the above");
    	}
	}
    
    @Override
	public void displayBalance() {
		System.out.println("No card inserted. Please insert a card first.");
		
	}

    @Override
    public void withdrawMoney(double amount) {
        if (pinEntered) {
            System.out.println("Starting withdrawal action");
        } else {
            System.out.println("PIN not entered. Please enter your PIN first.");
        }
    }
    
    @Override
    public void ejectCard() {
        System.out.println("Card ejected.");
        pinEntered = false;
    }
}
