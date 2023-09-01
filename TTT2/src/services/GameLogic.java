package services;

public interface GameLogic {

	void initGame(Board board, Player player1, Player player2);
	
	boolean isThereWinner(Move move, Player currentPlayer, int row, int col);
	
	boolean isThereDraw();
	
	boolean makeMove(Move move, Player player, int row, int col);
	
	boolean isValidMove( int row, int col);
	
	void play();
}
