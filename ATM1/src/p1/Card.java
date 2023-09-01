package p1;

public class Card {

	protected int cardNumber;
	protected int pin;
	protected BankAccount account;
	
	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public Card(int cardNumber, int pin) {
		account = new BankAccount();
		this.cardNumber=cardNumber;
		this.pin=pin;
		this.account.balance = 3000;
	}
}
