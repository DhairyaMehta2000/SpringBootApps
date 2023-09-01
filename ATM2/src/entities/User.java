package entities;

public class User {

	private String name;
	private Card card;
	
	public User(String name) {
		this.name=name;
		card = new Card(1234, "Dhairya Mehta", 555, "12-03-2040");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
}
