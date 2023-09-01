package services;

import java.util.ArrayList;
import java.util.List;

import interfaces.Player;
import interfaces.Snake;

public class SnakeService implements Snake{

	private List<Integer>snakes;
	private Player player;
	public SnakeService() {
		snakes=new ArrayList<>();
		snakes.add(20);
		snakes.add(56);
		snakes.add(98);
		snakes.add(34);
	}
	@Override
	public void demote(Player player) {
		player.setPosition(player.getPosition()-20);
	}
	public List<Integer> getSnakes() {
		return snakes;
	}
	public void setSnakes(List<Integer> snakes) {
		this.snakes = snakes;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}

}
