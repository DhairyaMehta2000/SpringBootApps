package services;

import interfaces.Move;
import interfaces.Player;

public class MoveService implements Move {

	private Player player;
	private int start;
	private int end;

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public MoveService(Player player, int start, int end) {
		super();
		this.player = player;
		this.start = start;
		this.end = end;
	}

}