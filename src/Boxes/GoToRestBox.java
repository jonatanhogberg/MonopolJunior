package Boxes;

import game.OnkelKrosus;
import game.Player;

public class GoToRestBox implements Box {
	private int cost = 3;
	private int RestBoxAmountOfSteps = 16;
	
	
	@Override
	public boolean nextAction(Player player) {
		if (affordEntertainment(player)) {
			payOnkel(player);
			player.moveToPosition(RestBoxAmountOfSteps);
			return true;
		}
		
		return false;
	}
	
	private void payOnkel(Player player) {
		OnkelKrosus.getInstance().payOnkel(player.pay(cost));
	}
	
	private boolean affordEntertainment(Player player) {
		return (player.getBalance() >= cost);
	}
}
