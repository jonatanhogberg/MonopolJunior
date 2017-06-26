package strategy;

import game.PlayField;

public class CalculateBuy implements Strategy {
	
	public CalculateBuy() {
		
	}

	@Override
	public void newTurn(PlayField pf) {
		pf.playerMove();
		if (pf.canBuy()) {
			int balance = pf.checkBalance();
			int cost = pf.costForEntertement();
			System.out.println(pf.checkBalance());
			System.out.println(pf.costForEntertement());
			if (cost * 2 <= balance) {
				//pf.currentPlayerBuy();
			}
		}
		pf.nextTurn();
	}
}
