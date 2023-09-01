package state;

import p1.ATM;
import p1.User;

public class ExitState implements ATMState {
    @Override
    public void insertCard(ATM atm, User user) throws Exception {
        throw new Exception("In exit cannot execute anything");
    }

    @Override
    public void enterPin(ATM atm, String pin) throws Exception {
        throw new Exception("In exit cannot execute anything");
    }

    @Override
    public void selectOperation(ATM atm, String operation, User user, double... amount) throws Exception {
        throw new Exception("In exit cannot execute anything");
    }

    @Override
    public void displayBalance(ATM atm, User user) throws Exception {
        throw new Exception("In exit cannot execute anything");
    }

    @Override
    public void withdrawMoney(ATM atm, User user, double amount) throws Exception {
        throw new Exception("In exit cannot execute anything");
    }

    @Override
    public void ejectCard(ATM atm) throws Exception {
        System.out.println("Card already ejected.");
        atm.setState(new IdleState());
    }
}
