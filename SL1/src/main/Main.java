package main;

import java.util.Scanner;

import interfaces.Board;
import interfaces.Dice;
import interfaces.GameLogic;
import interfaces.Ladder;
import interfaces.Player;
import interfaces.Snake;
import services.BoardService;
import services.DiceService;
import services.GameService;
import services.LadderService;
import services.PlayerService;
import services.SnakeService;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Board board = new BoardService();
		System.out.println("Enter Player 1 name - ");
		String name1 = sc.next();
		System.out.println("Enter Player 2 name - ");
		String name2 = sc.next();
		Player player1 = new PlayerService(name1);
		Player player2 = new PlayerService(name2);
		Ladder ladder = new LadderService();
		Snake snake = new SnakeService();
		Dice dice = new DiceService();
		GameLogic game = new GameService(board,player1,player2,ladder,snake,dice);
		game.init();
		game.play();
	}
}
