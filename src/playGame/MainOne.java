package playGame;

import java.util.ArrayList;

import strategy.AlwaysBuy;
import strategy.CalculateBuy;
import strategy.NeverBuy;
import strategy.Strategy;

public class MainOne {

	public static void main(String[] args) {
		
		PlayGame  pg = new PlayGame(2, 1000);
		ArrayList<Strategy> as = new ArrayList<>();
		as.add(new NeverBuy());
		as.add(new AlwaysBuy());
		pg.giveStrategy(as);
		
		GameStrategyStatistics gss = new GameStrategyStatistics(pg, 1000);
		gss.start();
		
		System.out.println("Player 1 amounts of win: " + gss.resultForPlayer(1));
		System.out.println("Player 2 amounts of win: " + gss.resultForPlayer(2));
		
	}

}
