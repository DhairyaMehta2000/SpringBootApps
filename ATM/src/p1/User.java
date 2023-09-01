package p1;

public class User {

	Card card;
	UserBankAccount userAccount;

	public User() {
		
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public UserBankAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserBankAccount userAccount) {
		this.userAccount = userAccount;
	}

}
