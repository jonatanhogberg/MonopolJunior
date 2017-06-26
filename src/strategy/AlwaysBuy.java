package strategy;

import game.PlayField;

public class AlwaysBuy implements Strategy {

	@Override
	public void newTurn(PlayField pf) {
		pf.playerMove();
		pf.currentPlayerBuy();
		pf.nextTurn();
	}

}
