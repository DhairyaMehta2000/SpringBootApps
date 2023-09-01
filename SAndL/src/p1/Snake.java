package p1;

import java.util.ArrayList;
import java.util.List;

public class Snake {
	List<Integer> snakes = new ArrayList<Integer>();
	public Snake() {
		
		snakes.add(99);
		snakes.add(77);
		snakes.add(56);
		snakes.add(20);
		snakes.add(83);
	}
	public void demote(Player current_player, int end_pos) {
		current_player.setCurrPos(end_pos - 20);
	}
	public List<Integer> getSnakes() {
		return snakes;
	}
}
