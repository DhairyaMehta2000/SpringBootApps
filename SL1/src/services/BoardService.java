package services;

import interfaces.Board;

public class BoardService implements Board {

	private int[]board;
	
	public BoardService() {
		this.board = new int[100];
	}

	public int[] getBoard() {
		return board;
	}

	public void setBoard(int i) {
		this.board[i] = i;
	}
}
