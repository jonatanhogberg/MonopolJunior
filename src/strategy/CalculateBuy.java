package strategy;

import game.PlayField;

public class CalculateBuy implements Strategy {
	
	public CalculateBuy() {
		
	}

	@Override
	public void newTurn(PlayField pf) {
		pf.nextPlayerMove();
		if (pf.costForEntertement() * 2 <= pf.checkBalance())
			pf.currentPlayerBuy();
		
	}
}
