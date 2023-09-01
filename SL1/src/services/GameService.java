package services;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import interfaces.Board;
import interfaces.Dice;
import interfaces.GameLogic;
import interfaces.Ladder;
import interfaces.Move;
import interfaces.Player;
import interfaces.Snake;

public class GameService implements GameLogic {

	private Board board;
	private Ladder ladder;
	private Snake snake;
	private Deque<Player> players;
	private Dice dice;

	public GameService(Board board, Player player1, Player player2, Ladder ladder, Snake snake, Dice dice) {
		this.board = board;
		this.ladder = ladder;
		this.snake = snake;
		this.players = new LinkedList<>();
		players.add(player1);
		players.add(player2);
		this.dice = dice;
	}

	@Override
	public void init() {
	}

	@Override
	public void play() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			Player currentPlayer = players.poll();
			int roll = dice.rollDice();
//			currentPlayer.setPosition(currentPlayer.getPosition()+roll);

			Move move = new MoveService(currentPlayer, currentPlayer.getPosition(), roll);

			if (makeMove(currentPlayer.getPosition(),roll)) {
				currentPlayer.setPosition(currentPlayer.getPosition()+roll);
				board.setBoard(board.getBoard()[currentPlayer.getPosition()-1]);
				for (int i = 0; i < ladder.getLadders().size(); i++) {
					if (currentPlayer.getPosition() == ladder.getLadders().get(i)) {
						System.out.println(currentPlayer.getName()+" got ladder at "+currentPlayer.getPosition());
						ladder.promote(currentPlayer);
					}
				}
				for (int i = 0; i < snake.getSnakes().size(); i++) {
					if (currentPlayer.getPosition() == snake.getSnakes().get(i)) {
						System.out.println(currentPlayer.getName()+" got snake at "+currentPlayer.getPosition());
						snake.demote(currentPlayer);
					}
				}
				if (isThereWinner(currentPlayer)) {
					System.out.println("Player " + currentPlayer.getName() + " wins");
					break;
				}
			} else {
				System.out.println("Invalid move try next time ");
				players.addLast(currentPlayer);
			}
			System.out.println(
					"Current position of player - " + currentPlayer.getName() + "-" + currentPlayer.getPosition());
			players.offer(currentPlayer);

//			
		}

	}

	@Override
	public boolean makeMove(int curr, int end) {
		if(curr>=0 && curr+end<101) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isThereWinner(Player player) {
		if(player.getPosition()==100) {
			return true;
		}
		return false;
	}

	@Override
	public boolean makeMove(Move move) {
		// TODO Auto-generated method stub
		return false;
	}

}
