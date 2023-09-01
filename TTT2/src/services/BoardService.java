package services;

public class BoardService implements Board {

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String[][] getBoard() {
		return board;
	}

	public void setBoard(String[][] board) {
		this.board = board;
	}

	private int size;
	private String[][] board;

	public BoardService(int size) {
		this.size = size;
		this.board = new String[size][size];
	}

	@Override
	public void initBoard() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				board[i][j] = " ";
			}
		}

	}

	@Override
	public void displayBoard() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(board[i][j]);

				if (j < size) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (i < size) {
				System.out.println("---------");
			}
		}

	}
}
