package boxes;

import game.Player;

public class RestBox implements Box {
	private String name;
	
	public RestBox(String name) {
		this.name = name;
	}

	@Override
	public boolean nextAction(Player player) {
		return false;
	}

	@Override
	public boolean isBuyable() {
		return false;
	}

}
