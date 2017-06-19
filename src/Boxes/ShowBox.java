package Boxes;
import game.OnkelKrosus;
import game.Player;

public class ShowBox implements Box {
	
	private int cost = 2;
	
	@Override
	public boolean nextAction(Player player) {
		if (affordEntertainment(player)) {
			payOnkel(player);
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
