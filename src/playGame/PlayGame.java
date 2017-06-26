package playGame;

import java.util.ArrayList;
import java.util.HashMap;

import game.PlayField;
import strategy.Strategy;

public class PlayGame {
	//private ArrayList<Strategy> strategys;
	private HashMap<Integer, Strategy> strategys;
	private PlayField pf;
	private int startMoney;
	private int players;
	
	public PlayGame(int players, int startMoney) {
		pf = new PlayField();
		strategys = new HashMap<Integer, Strategy>();
		
		this.startMoney = startMoney;
		this.players = players;
		pf.startGame(players, startMoney);
	}
	
	public PlayField getPlayField() {
		return pf;
	}
	
	/*public void giveStrategy(ArrayList<Strategy> strategys) {
		this.strategys = strategys;
	}*/
	
	public void giveStrategy(int player, Strategy strategy) {
		strategys.put(player, strategy);
	}
	
	public int amountOfPlayers() {
		return players;
	}
	
	public int winner() {
		return pf.victoryPlayer();
	}
	
	public void resetGame() {
		pf = new PlayField();
		pf.startGame(players, startMoney);
	}
	
	public boolean nextMove() {
		int nextPlayer = pf.getCurrentPlayer();
		Strategy currentStrategy = strategys.get(nextPlayer);
		currentStrategy.newTurn(pf);
		return pf.currentPlayerBroke();
	}
	
	
}
