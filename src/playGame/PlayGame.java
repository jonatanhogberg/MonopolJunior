package playGame;

import java.util.ArrayList;

import game.PlayField;
import strategy.Strategy;

public class PlayGame {
	private ArrayList<Strategy> strategys;
	private PlayField pf;
	private int startMoney;
	private int players;
	
	public PlayGame(int players, int startMoney) {
		pf = new PlayField();
		this.startMoney = startMoney;
		this.players = players;
		pf.startGame(players, startMoney);
	}
	
	public void giveStrategy(ArrayList<Strategy> strategys) {
		this.strategys = strategys;
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
		Strategy currentStrategy = strategys.get(pf.getCurrentPlayer() - 1);
		currentStrategy.newTurn(pf);
		return pf.currentPlayerBroke();
	}
	
	
}
