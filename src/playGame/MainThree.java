package playGame;

import strategy.AlwaysBuy;
import strategy.NeverBuy;


public class MainThree {

	
	public static void main(String[] args) {
		
		PlayGame pg = new PlayGame(2, 100);
		pg.giveStrategy(1, new NeverBuy());
		pg.giveStrategy(2, new AlwaysBuy());
		
		while (pg.nextMove()) {};
		
		System.out.println(pg.winner());
		
	}
}
