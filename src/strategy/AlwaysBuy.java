package strategy;

import game.PlayField;

public class AlwaysBuy implements Strategy {

	@Override
	public void newTurn(PlayField pf) {
		pf.nextPlayerMove();
		pf.currentPlayerBuy();
	}

}
