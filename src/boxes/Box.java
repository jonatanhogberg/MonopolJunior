package boxes;

import game.Player;

public interface Box {

	/**
	 * Each box have different behavior that this method automat
	 * @param player
	 * @return true/false if player has one more action after executed
	 */
	public boolean nextAction(Player player);

	/**
	 * Simple check if Box is Buyable
	 * @return
	 */
	public boolean isBuyable();
	
}
