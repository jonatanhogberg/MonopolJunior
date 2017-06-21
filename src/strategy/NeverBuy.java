package strategy;

import game.PlayField;

public class NeverBuy implements Strategy {

	@Override
	public void newTurn(PlayField pf) {
		pf.nextPlayerMove();
	}

}
