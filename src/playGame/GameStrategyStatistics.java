package playGame;

import java.util.HashMap;

public class GameStrategyStatistics {
	private int gamesToPlay;
	private PlayGame game; 
	private HashMap<Integer, Integer> results = new HashMap<Integer, Integer>();
	
	public GameStrategyStatistics(PlayGame game, int gamesToPlay) {
		this.gamesToPlay = gamesToPlay;
		this.game = game;
	}
	
	public void start() {
		results.put(1, 0);
		results.put(2, 0);
		
		for (int i = 0; i < gamesToPlay; i++) {
			int winner = playOneGame();	
			game.resetGame();
			
			results.put(winner, (results.get(winner) + 1));
		}
		
	}
	
	public int playOneGame() {
		
		while (game.nextMove()){};
		
		return game.winner();
	}
	
	public int resultForPlayer(int player) {
		return results.get(player);
	}
	
}
