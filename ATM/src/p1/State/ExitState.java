package p1.State;

public class ExitState implements ATMState {
    @Override
    public void insertCard() {
        System.out.println("ATM out of service. Card cannot be inserted.");
    }

    @Override
    public void enterPin(String pin) {
        System.out.println("ATM out of service. PIN cannot be entered.");
    }

    @Override
    public void withdrawMoney(double amount) {
        System.out.println("ATM out of service. Money cannot be withdrawn.");
    }
    @Override
	public void selectOperation(String type) {
    	 System.out.println("ATM out of service.No operation can be performed.");
	}
    
    @Override
	public void displayBalance() {
		System.out.println("ATM out of service.No operation can be performed.");
		
	}
    @Override
    public void ejectCard() {
        System.out.println("Ejecting card");
    }
    
    
}

