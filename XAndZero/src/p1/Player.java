package p1;

public class Player {
	String playerName;
	String symbol;

	public Player(String playerName, String symbol) {
		super();
		this.playerName = playerName;
		this.symbol = symbol;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
}
