package Boxes;

import game.OnkelKrosus;
import game.Player;

public class GoToRestBox implements Box {
	private int cost = 3;
	private int RestBoxPos = 9;
	
	
	@Override
	public boolean nextAction(Player player) {
		payOnkel(player);
		player.receivePayment(2);
		player.moveToPosition(RestBoxPos);

		return false;
	}
	
	@Override
	public boolean isBuyable() {
		return false;
	}
	
	private void payOnkel(Player player) {
		OnkelKrosus.getInstance().payOnkel(player.pay(cost));
	}
}
