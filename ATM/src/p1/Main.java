package p1;

public class Main {

	public static void main(String[] args) throws Exception {
		User user = new User();
        ATM atm = new ATM(1);

        // Insert Card
        atm.insertCard();  // Output: Card inserted. Please enter your PIN.

        // Transition to HasCardState
        atm.enterPin("1234");  // Output: PIN entered. Please wait for validation.

        atm.selectOperation("DISPLAY_BALANCE");
        atm.selectOperation("CASH_WITHDRAWAL",100);
        atm.ejectCard();

        // Transition to WithdrawalState
//        atm.ejectCard();  // Output: Card ejected.
    }
	

}
