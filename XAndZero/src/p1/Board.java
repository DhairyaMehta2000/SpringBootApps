package p1;

public class Board {

	int boardSize;
	String[][] board;

	public Board(int boardSize) {
		super();
		this.boardSize = boardSize;
		board = new String[boardSize][boardSize];
		for(int i=0;i<boardSize;i++) {
			for(int j=0;j<boardSize;j++) {
				board[i][j]=" ";
			}
		}
	}

	public int getBoardSize() {
		return boardSize;
	}

	public void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}

	public String[][] getBoard() {
		return board;
	}

	public void setBoard(String[][] board) {
		this.board = board;
	}

	public void printBoard() {
		for (int i = 0; i < board[0].length; i++) {
			for (int j = 0; j < board[1].length; j++) {
				System.out.print(board[i][j]);
				if (j < board[0].length) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (i < board[1].length) {
				System.out.println("---------");
			}
		}
	}
}
