package Boxes;

import game.Player;

public class ChanceBox implements Box {

	@Override
	public boolean nextAction(Player player) {
		return false;
	}

	@Override
	public boolean isBuyable() {
		return false;
	}
}
