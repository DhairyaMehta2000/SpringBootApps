package entities;

public class Card {

	private int pin;
	private String holderName;
	private int cvv;
	private String expiry;
	private BankAccount account;

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public Card(int pin, String holderName, int cvv, String expiry) {
		super();
		this.pin = pin;
		this.holderName = holderName;
		this.cvv = cvv;
		this.expiry = expiry;
		account = new BankAccount();
		account.setBalance(3000);
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

}
