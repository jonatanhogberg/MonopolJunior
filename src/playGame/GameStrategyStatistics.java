package playGame;

public class GameStrategyStatistics {
	private int gamesToPlay;
	private PlayGame game; 
	
	public GameStrategyStatistics(PlayGame game, int gamesToPlay) {
		this.gamesToPlay = gamesToPlay;
		this.game = game;
	}
	
	public void start() {
		for (int i = 0; i < gamesToPlay; i++) {
			int winner = playOneGame();
		}
		
	}
	
	public int playOneGame() {
		
		while (game.nextMove()){};
		
		return game.winner();
	}
	
	public void result() {
		
	}
	
}
