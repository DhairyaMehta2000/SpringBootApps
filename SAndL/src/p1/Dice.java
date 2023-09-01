package p1;

public class Dice {
	
	public int rollDice() {
		 int min=1;
		 int max =6;
		 
		return((int)(Math.random()*max)+min);
	}
	
}
