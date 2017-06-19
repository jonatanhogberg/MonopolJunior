package Boxes;
import game.Dice;
import game.Player;

public class TrainBox implements Box {
	
	@Override
	public boolean nextAction(Player player) {
		player.move();
		return true;
	}
	 
	public int extraRoll() {
		return Dice.roll();
	}
}
