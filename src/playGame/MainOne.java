package playGame;

import java.util.ArrayList;

import strategy.AlwaysBuy;
import strategy.CalculateBuy;
import strategy.NeverBuy;
import strategy.Strategy;

public class MainOne {

	public static void main(String[] args) {
		
		PlayGame  pg = new PlayGame(2, 100);
		pg.giveStrategy(1, new CalculateBuy());
		pg.giveStrategy(2, new AlwaysBuy());
		
		GameStrategyStatistics gss = new GameStrategyStatistics(pg, 100);
		gss.start();
		
		System.out.println("Player 1 amounts of win: " + gss.resultForPlayer(1));
		System.out.println("Player 2 amounts of win: " + gss.resultForPlayer(2));
		
	}

}
