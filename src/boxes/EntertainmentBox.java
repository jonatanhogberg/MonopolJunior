package boxes;
import game.Player;

public class EntertainmentBox implements Box {
	private int cost;
	private boolean isBuyable;
	private Player owner;
	private String name;
	
	public EntertainmentBox(int cost, String name) {
		isBuyable = true;
		this.cost = cost;
	}
	
	@Override
	public boolean nextAction(Player player) {
		if (isOwned())
			payOwner(player);
		return false;
	}
	
	@Override
	public boolean isBuyable() {
		return isBuyable;
	}
	
	public boolean isOwned() {
		return !isBuyable;
	}

	
	public int getCost() {
		return cost;
	}
	
	public void payOwner(Player player) {
		player.pay(cost);
		owner.receivePayment(cost);
	}
	
	public boolean buy(Player player) {
		boolean didBuy = false;
		
		if (isBuyable() && affordEntertainment(player)) {
			owner = player;
			player.pay(cost);
			isBuyable = false;
			didBuy = true;
		}
		return didBuy;
	}
	
	private boolean affordEntertainment(Player player) {
		return (player.getBalance() >= cost);
	}
}
