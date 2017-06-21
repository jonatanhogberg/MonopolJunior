package game;

import boxes.Box;
import boxes.EntertainmentBox;
import boxes.FactoryBox;

public class PlayField {
	private Player[] players = new Player[3];
	private int turn;
	private FactoryBox boxes;
	
	private int amountOfPlayers;
	
	private int currentPlayerNumber;
	private Player currentPlayer;
	private Box currentBox;
	
	public PlayField() {
	}
	
	
	public void startGame(int amountOfPlayers, int startMoney) {
		turn = 0;
		boxes = new FactoryBox();
		this.amountOfPlayers = amountOfPlayers;
		newPlayers(startMoney);
	}
	
	private void newPlayers(int startMoney) {
		for (int i = 0; i < amountOfPlayers; i++) {
			players[i] = new Player(startMoney);
		}
	}
	
	
	public void nextPlayerMove() {
		currentPlayerNumber = turn;
		
		currentPlayer = players[turn];
		currentPlayer.move();
		
		int newPosition = currentPlayer.getPosition();
		currentBox = boxes.getBox(newPosition);
		boolean newMove = currentBox.nextAction(currentPlayer);
		
		if (newMove) {
			newPosition = currentPlayer.getPosition();
			currentBox = boxes.getBox(newPosition);
			newMove = currentBox.nextAction(currentPlayer);
		}
		
		turn++;
	
		if (amountOfPlayers == turn) {
			turn = 0;
		}
	}
	
	public boolean canBuy() {
		return currentBox.isBuyable();
	}
	
	public int costForEntertement() {
		boolean isEntertementBox = currentBox.getClass().equals(EntertainmentBox.class);
		if (isEntertementBox == false) {
			return 0;
		} else {
			EntertainmentBox tmpBox = (EntertainmentBox) currentBox;
			return tmpBox.getCost();
		}
	}
	
	public int checkBalance() {
		return currentPlayer.getBalance();
	}
	
	public boolean currentPlayerBuy() {
		boolean isEntertementBox = currentBox.getClass().equals(EntertainmentBox.class);
		if (isEntertementBox == false) {
			return false;
		} else {
			EntertainmentBox tmpBox = (EntertainmentBox) currentBox;
			return tmpBox.buy(currentPlayer);
		}
	}
	
	/*public int checkPlayerPosition(int player) {
		return players[player].getPosition();
	}*/
	
	public boolean isGameOver() {
		for (int i = 0; i < amountOfPlayers; i++) {
			if (players[i].getBalance() <= 0) {
				return true;
			}
		}
		return false;
	}
	
	// Inte klar funkar bara med 2
	public int victoryPlayer() {
		int highestPlayer = -1;
		int heighestAmount = -1; 
		
		if (isGameOver()) {
			for (int i = 0; i < amountOfPlayers; i++) {
				
				int currentBalance = players[i].getBalance();
				
				if (currentBalance >= heighestAmount) {
					heighestAmount = currentBalance;
					highestPlayer = i + 1;
				}
			}
		}
		
		return highestPlayer;
	}
	
	public boolean currentPlayerBroke() {
		return (currentPlayer.getBalance() >= 0);
	}
	
	public int getCurrentPosition() {
		return currentPlayer.getPosition();
	}
	
	public int getCurrentPlayer() {
		return currentPlayerNumber + 1;
	}
	
}
