package playGame;

import strategy.CalculateBuy;
import strategy.NeverBuy;


public class Main {

	public static void main(String[] args) {
		
		int players = 2;
		int startMoeney = 0;
		
		PlayGame  pg = new PlayGame(players, startMoeney);
		// Ge strategi till player 1 och 2
		pg.giveStrategy(1, new CalculateBuy());
		pg.giveStrategy(2, new NeverBuy());
		
		int amountOfGames = 1000;
		GameStrategyStatistics gss = new GameStrategyStatistics(pg, amountOfGames);
		gss.start();

		System.out.println("Player 1 amounts of win: " + gss.resultForPlayer(1));
		System.out.println("Player 2 amounts of win: " + gss.resultForPlayer(2));
	}
}