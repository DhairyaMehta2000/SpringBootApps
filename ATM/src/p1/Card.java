package p1;

public class Card {

	private int pin;
	private int cvv;
	private String expiry;
	private String name;
	private int card_number;
	private UserBankAccount userAccount;
	
	public Card(String name ,int card_number,int pin, int cvv, String expiry) {
		this.card_number=card_number;
		this.cvv=cvv;
		this.expiry=expiry;
		this.name=name;
		this.pin=pin;
	}
	
	public boolean validateCard(int pin) {
		return pin==1234;
	}
	
	public int balance() {
		return userAccount.balance;
	}
}
