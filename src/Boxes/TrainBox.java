package Boxes;
import game.Dice;
import game.Player;

public class TrainBox implements Box {
	private String name;
	
	public TrainBox(String name) {
		this.name = name;
	}
	
	@Override
	public boolean nextAction(Player player) {
		player.move();
		System.out.println("Train");
		return true;
	}
	
	@Override
	public boolean isBuyable() {
		return false;
	}
	 
	public int extraRoll() {
		return Dice.roll();
	}
}
