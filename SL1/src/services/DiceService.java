package services;

import interfaces.Dice;

public class DiceService implements Dice{

	private int max=6;
	private int min=1;
	
	public int rollDice() {
		return ((int)(Math.random()*max)+min);
	}
}
