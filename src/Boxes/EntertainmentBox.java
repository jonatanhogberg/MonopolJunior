package Boxes;
import game.Player;

public class EntertainmentBox implements Box {
	public int cost;
	public boolean isBuyable;
	public Player owner;
	
	public EntertainmentBox(int cost) {
		this.cost = cost;
	}
	
	@Override
	public boolean nextAction(Player player) {
		if (isOwned() == false)
			return true;
		else 
			return payOwner(player);
	}
	
	public boolean isOwned() {
		return isBuyable;
	}
	
	public int getCost() {
		return cost;
	}
	
	public boolean payOwner(Player player) {
		if (affordEntertainment(player)) {
			player.pay(cost);
			owner.receivePayment(cost);
			return true;
		}
		return false;
	}
	
	public boolean buy(Player player) {
		if (isOwned() && affordEntertainment(player)) {
			owner = player;
			player.pay(cost);
			isBuyable = false;
			return true;
		}
		return false;
	}
	
	private boolean affordEntertainment(Player player) {
		return (player.getBalance() >= cost);
	}
}
