package playGame;

import java.util.ArrayList;

import game.PlayField;
import strategy.AlwaysBuy;
import strategy.NeverBuy;
import strategy.Strategy;

public class MainPlayField {

	public static void main(String[] args) {
		
		PlayField pf = new PlayField();
		pf.startGame(2, 1000);
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Current player: " + pf.getCurrentPlayer());
			System.out.println("Balance current player: " + pf.checkBalance());
			pf.playerMove();
			if (i % 2 == 0) {
				pf.currentPlayerBuy();
			}
			pf.nextTurn();
			System.out.println("New Turn:");
		}
		System.out.println("Player 1 balance: " + pf.playBalance(1));
		System.out.println("Player 2 balance: " + pf.playBalance(2));
	}
	
}
