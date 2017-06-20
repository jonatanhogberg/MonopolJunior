package Boxes;
import game.OnkelKrosus;
import game.Player;

public class ShowBox implements Box {
	private String name;
	private int cost = 2;
	
	public ShowBox(String name) {
		this.name = name;
	}
	
	@Override
	public boolean nextAction(Player player) {
		payOnkel(player);
	
		return false;
	}
	
	@Override
	public boolean isBuyable() {
		return false;
	}
	
	private void payOnkel(Player player) {
		player.pay(cost);
		OnkelKrosus.getInstance().payOnkel(cost);
	}
}
