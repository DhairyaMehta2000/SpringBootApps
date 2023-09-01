package p1;

public class User {

	protected Card card;
	protected String name;

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		card = new Card(112233, 1234);
		this.name=name;
	}

}
