package p1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {
	private Board board;
	private Queue<Player> players=new LinkedList<>();

	public void initGame() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter board size,for eg 3 for 3x3");
		int size = sc.nextInt();
		board = new Board(size);
		board.printBoard();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Player 1 name : ");
		String player1 = scanner.nextLine();

		System.out.println("Enter player 1 symbol : ");
		String symbol1 = scanner.nextLine();

		System.out.println("Enter Player 2 name : ");
		String player2 = scanner.nextLine();

		System.out.println("Enter player 2 symbol : ");
		String symbol2 = scanner.nextLine();

//		players = new Player[2];
//		players[0] = new Player(player1, symbol1);
//		players[1] = new Player(player2, symbol2);
		players.add(new Player(player1,symbol1));
		players.add(new Player(player2, symbol2));
//		for(int i=0;i<players.size();i++) {
//			System.out.println(players.get(i).getPlayerName() + "|"+players[i].getSymbol());
//		}
//		currentPlayerIndex = 0;

	}

	public boolean isValid(Move move) {
		int row = move.getRow();
		int col = move.getCol();

		return row >= 0 && row < board.boardSize && col >= 0 && col < board.boardSize && board.board[row][col] == " ";
	}

	public boolean makeMove(Player currentPlayer, Move move) {
		int row = move.getRow();
		int col = move.getCol();
		if (isValid(move)) {
			board.board[row][col] = currentPlayer.getSymbol();
		} else {
			return false;
		}
		return true;
	}

	public boolean isThereDraw() {
		for (int i = 0; i < board.boardSize; i++) {
			for (int j = 0; j < board.boardSize; j++) {
				if (board.board[i][j] == " ") {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isThereWinner(Player currentPlayer,Move move) {
		int row=move.getRow();
		int col = move.getCol();
		
		boolean rowFlag=true;
		boolean colFlag=true;
		boolean diagFlag=true;
		boolean antiDiagFlag=true;
		
//		Check rows
		for(int i=0;i<board.boardSize;i++) {
			if(board.board[row][i]!=currentPlayer.getSymbol()) {
				rowFlag=false;
			}
		}
		
//		Check cols
		for(int i=0;i<board.boardSize;i++) {
			if(board.board[i][col]!=currentPlayer.getSymbol()) {
				colFlag=false;
			}
		}
		
		// Check diag
		for(int i=0,j=0;i<board.boardSize;i++,j++) {
			if(board.board[i][j]!=currentPlayer.getSymbol()) {
				diagFlag=false;
			}
		}
		
		//check anti diag
		for(int i=board.boardSize-1,j=0;i>=0;i--,j++) {
			if(board.board[i][j]!=currentPlayer.getSymbol()) {
				antiDiagFlag=false;
			}
		}
		return rowFlag || colFlag || diagFlag || antiDiagFlag;
		
	}
	
	public void play() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			board.printBoard();
			Player currentPlayer = players.poll();
			System.out.println("It is " + currentPlayer.getPlayerName() + "'s turn ");

			System.out.println("Enter the row you want to play in");
			int row = sc.nextInt();

			System.out.println("Enter the col you want to play in");
			int col = sc.nextInt();

			Move move = new Move(currentPlayer, row, col);

			if (makeMove(currentPlayer, move)) {
				if (isThereWinner(currentPlayer,move)) {
					System.out.println("Player " + currentPlayer.getPlayerName() + " wins");
					board.printBoard();
					break;
				} else if (isThereDraw()) {
					System.out.println("It's a draw");
					board.printBoard();
					break;
				}
			} else {
				System.out.println("Invalid move, please try again");
			}
			players.offer(currentPlayer);
		}

	}

}
