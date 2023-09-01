package p1;

public class Game {
	Board board;

	public Game() {
		this.board=new Board();
	}
	
	public void init() {
		board.resetBoard();
		board.printBoard();
	}
	
	
}
