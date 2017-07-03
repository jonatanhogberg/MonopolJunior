package playGame;

import java.util.HashMap;

import game.PlayField;
import strategy.Strategy;

public class PlayGame {
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
	
	/**
	 * Give strategy for a player
	 * @param player
	 * @param strategy
	 */
	public void giveStrategy(int player, Strategy strategy) {
		strategys.put(player, strategy);
	}
	
	/**
	 * Number of the player that won
	 * @return
	 */
	public int winner() {
		return pf.victoryPlayer();
	}

	/**
	 * Clear's values from previous game
	 */
	public void resetGame() {
		pf = new PlayField();
		pf.startGame(players, startMoney);
	}
	
	/**
	 * Makes next move in the Game
	 * @return true/false depending if any moves left
	 */
	public boolean nextMove() {
		int nextPlayer = pf.getCurrentPlayer();
		Strategy currentStrategy = strategys.get(nextPlayer);
		currentStrategy.newTurn(pf);
		return pf.currentPlayerBroke();
	}
}
