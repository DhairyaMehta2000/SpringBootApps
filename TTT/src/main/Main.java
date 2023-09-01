package main;

import java.util.Scanner;

import entities.Board;
import entities.Piece;
import entities.Player;
import game.Game;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter board size, eg. 3x3 ");
		int size = sc.nextInt();
		Board board = new Board(size);
		System.out.println("Enter Player 1 name - ");
		String name1 = sc.next();
		
		char piece1 = 'X';
		Player player1 = new Player(name1, piece1);
		System.out.println("Enter Player 2 name - ");
		String name2 = sc.next();
		char piece2 = 'O';
		Player player2 = new Player(name2,piece2);
		System.out.println(name1+"|"+name2);
		
		Game game = new Game(board, player1,player2);
		
		game.initGame();
		game.play();
		
	}

}
