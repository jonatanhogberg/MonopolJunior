package playGame;

import java.util.ArrayList;

import strategy.AlwaysBuy;
import strategy.NeverBuy;
import strategy.Strategy;

public class MainOne {

	public static void main(String[] args) {
		
		PlayGame  pg = new PlayGame(2, 30);
		ArrayList<Strategy> as = new ArrayList<>();
		as.add(new NeverBuy());
		as.add(new AlwaysBuy());
		pg.giveStrategy(as);
		
		GameStrategyStatistics gss = new GameStrategyStatistics(pg, 100);
		System.out.println(gss.playOneGame());
	}

}
