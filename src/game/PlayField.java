package game;

public class PlayField {
	private int boxes = 32;
	private int amountOfPlayers;
	private Player[] players = new Player[3];
	private int turn = 0;
	
	
	public PlayField(int amountOfPlayers) { 
		this.amountOfPlayers = amountOfPlayers;
	}
	
	
	public void startGame() {
		for (int i = 0; i < amountOfPlayers; i++) {
			players[i] = new Player();
		}
	}
	
	public void nextPlayerMove() {
		players[turn].move();
		turn++;
		
		if (amountOfPlayers == turn)
			turn = 0;
	}
	
	public int checkPlayerPosition(int player) {
		return players[player].getPosition();
	}
	
	public int checkPlayerCurrentPosition() {
		return players[turn].getPosition();
	}
	
	public int getCurrentPlayer() {
		return turn;
	}
	
}
