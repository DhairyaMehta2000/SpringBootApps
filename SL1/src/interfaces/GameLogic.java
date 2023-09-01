package interfaces;

public interface GameLogic {

	void init();
	
	void play();
	
	boolean makeMove(Move move);
	
	boolean isThereWinner(Player player);

	boolean makeMove(int curr, int end);
}
