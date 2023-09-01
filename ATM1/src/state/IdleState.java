package state;

import p1.ATM;
import p1.User;

public class IdleState implements ATMState {
    @Override
    public void insertCard(ATM atm,User user) throws Exception {
    	System.out.println("now : " +atm.getState().getClass().getSimpleName());
        System.out.println("Card inserted.... Please enter your PIN.");
        
        atm.setState(new HasCardState());
        System.out.println(atm.getState());
    }

    @Override
    public void enterPin(ATM atm, String pin) throws Exception{
    	throw new Exception("Enter card first");
    }

    @Override
    public void selectOperation(ATM atm,String operation,User user,double...amount) throws Exception{
    	throw new Exception("Enter card first");
    }

    @Override
    public void displayBalance(ATM atm,User user) throws Exception{
    	throw new Exception("Enter card first");
    }

    @Override
    public void withdrawMoney(ATM atm,User user, double amount) throws Exception{
    	throw new Exception("Enter card first");
    }

    @Override
    public void ejectCard(ATM atm) throws Exception{
    	throw new Exception("Enter card first");
    }
}