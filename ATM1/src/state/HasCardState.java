package state;

import p1.ATM;
import p1.User;

public class HasCardState implements ATMState {
	
	boolean pinEnetered;
    @Override
    public void insertCard(ATM atm, User user) throws Exception{
    	throw new Exception("Enter pin now");
    	
    }

    @Override
    public void enterPin(ATM atm, String pin) throws Exception{
    	System.out.println("here");
//    	if !atm.user.get.pin.equals(pin){throw exception wrong pin}
        System.out.println("PIN accepted. Please select an option.");
        atm.setState(new SelectOperationState(atm));
    }

    @Override
    public void selectOperation(ATM atm,String operation, User user,double...amount) throws Exception{
    	System.out.println("here");
    	throw new Exception("Enter pin first");    }

    
    @Override
    public void displayBalance(ATM atm,User user) throws Exception{
    	System.out.println("here");
    	throw new Exception("Enter pin first");    }

    @Override
    public void withdrawMoney(ATM atm,User user, double amount) throws Exception{
        throw new Exception("Enter pin now");
    }

    @Override
    public void ejectCard(ATM atm) throws Exception{
        System.out.println("Card ejected.");
        atm.setState(new ExitState());
    }
}