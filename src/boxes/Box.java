package boxes;

import game.Player;

public interface Box {

	public boolean nextAction(Player player);
	
	public boolean isBuyable();
	
}
