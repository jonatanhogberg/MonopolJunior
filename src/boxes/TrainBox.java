package boxes;
import game.Player;

public class TrainBox implements Box {
	private String name;
	
	public TrainBox(String name) {
		this.name = name;
	}
	
	@Override
	public boolean nextAction(Player player) {
		player.move();
		return true;
	}
	
	@Override
	public boolean isBuyable() {
		return false;
	}
}
