package Boxes;

import game.OnkelKrosus;
import game.Player;

public class OnkelKrosusBox implements Box {
	
	@Override
	public boolean nextAction(Player player) {
		getChangeMoney(player);
		return true;
	}
	
	private void getChangeMoney(Player player) {
		OnkelKrosus.getInstance().receiveFromOnkel(player);
	}	
}
