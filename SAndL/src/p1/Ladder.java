package p1;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
	List<Integer> ladders = new ArrayList<Integer>();
	public Ladder() {
		
		ladders.add(1);
		ladders.add(77);
		ladders.add(56);
		ladders.add(20);
		ladders.add(83);
	}
	
	public int promote(Player current_player, int end_pos) {
		current_player.setCurrPos(end_pos+15);
		return current_player.getCurrPos();
	}
	public List<Integer> getLadders() {
		return ladders;
	}
	
}
