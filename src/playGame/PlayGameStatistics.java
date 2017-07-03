package playGame;

import java.util.HashMap;

public class PlayGameStatistics {
	private int gamesToPlay;
	private PlayGame game; 
	private HashMap<Integer, Integer> results = new HashMap<Integer, Integer>();
	
	public PlayGameStatistics(PlayGame game, int gamesToPlay) {
		this.gamesToPlay = gamesToPlay;
		this.game = game;
	}
	
	/**
	 * Initlize game
	 */
	public void start() {
		results.put(1, 0);
		results.put(2, 0);
		
		for (int i = 0; i < gamesToPlay; i++) {
			int winner = playOneGame();	
			game.resetGame();
			
			results.put(winner, (results.get(winner) + 1));
		}
	}
	
	/**
	 * Plays one game and return winner
	 * @return
	 */
	public int playOneGame() {
		
		while (game.nextMove()){};
		
		return game.winner();
	}
	
	/**
	 * amounts of win for a player
	 * @param player
	 * @return
	 */
	public int resultForPlayer(int player) {
		return results.get(player);
	}
	
}
