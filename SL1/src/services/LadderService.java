package services;

import java.util.ArrayList;
import java.util.List;

import interfaces.Ladder;
import interfaces.Player;

public class LadderService implements Ladder{

	private List<Integer> ladders;
//	private Player player;
	
	public LadderService() {
		ladders=new ArrayList<>();
		ladders.add(4);
		ladders.add(20);
		ladders.add(68);
		ladders.add(84);
	}
	
	public List<Integer> getLadders() {
		return ladders;
	}

	public void setLadders(List<Integer> ladders) {
		this.ladders = ladders;
	}

	@Override
	public void promote(Player player) {
		player.setPosition(player.getPosition()+15);
	}

}
