package p1;

public class Main {

	public static void main(String[] args) {
		
		ATM atm = new ATM();
				
		try {
			atm.insertCard();
			atm.enterPin("1234");
			atm.selectOperation("DISPLAY_BALANCE",atm.user);
			
			
//	        atm.selectOperation("DISPLAY_BALANCE",atm.user);
//	        atm.ejectCard();

//	        atm.displayBalance();
//	        atm.insertCard();
	        
//	        atm.enterPin("1234");
////	        atm.selectOperation(null, null);
//	        atm.selectOperation("WITHDRAW_MONEY", 4000 ,atm.user);
//	        atm.displayBalance();
//	        atm.ejectCard();
//	        
//	        atm.insertCard();
//	        atm.enterPin("1234");
//	        atm.selectOperation("WITHDRAW_MONEY",30000, atm.user);
//	        atm.displayBalance();
//	        atm.ejectCard();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
        

	}

}
