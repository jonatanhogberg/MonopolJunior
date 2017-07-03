package strategy;

import game.PlayField;

public class CalculateBuy implements Strategy {

	@Override
	public void newTurn(PlayField pf) {
		pf.playerMove();
		if (pf.canBuy()) {
			int balance = pf.checkBalance();
			int cost = pf.costForEntertement();

			if (cost * 2 <= balance) {
				pf.currentPlayerBuy();
			}
		}
		pf.nextTurn();
	}
}
