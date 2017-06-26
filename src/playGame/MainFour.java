package playGame;

import game.PlayField;

public class MainFour {

	public static void main(String[] args) {
		PlayField pf = new PlayField();
		pf.startGame(2, 10);
	
		System.out.println("Current player: " + pf.getCurrentPlayer());
		System.out.println("Balance current player: " + pf.checkBalance());
		pf.playerMove();
		pf.currentPlayerBuy();
		System.out.println(pf.playBalance(1));
		
		
	}
}
