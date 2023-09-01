package main;

import java.util.Scanner;

import services.Board;
import services.BoardService;
import services.GameLogic;
import services.GameService;
import services.Player;
import services.PlayerService;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter board size, e.g., 3x3 ");
        int size = sc.nextInt();

        Board board = new BoardService(size);

        System.out.println("Enter Player 1 name - ");
        String name1 = sc.next();
        System.out.println("Enter Player 1 symbol - ");
        String symbol1 = sc.next();
        Player player1 = new PlayerService(name1, symbol1);

        System.out.println("Enter Player 2 name - ");
        String name2 = sc.next();
        System.out.println("Enter Player 2 symbol - ");
        String symbol2 = sc.next();
        Player player2 = new PlayerService(name2, symbol2);
        
        GameLogic game = new GameService(player1, player2,board);
        game.initGame(board, player1, player2);
        game.play();
	}
	
}
