package services;

public class MoveService implements Move {

	private int row;
	private int col;
	private Player player;
	
	MoveService(Player currentPlayer, int row, int col){
		this.player=currentPlayer;
		this.row=row;
		this.col=col;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
