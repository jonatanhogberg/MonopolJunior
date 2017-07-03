package game;

import java.util.HashMap;

import card.CardDeck;
import card.FreePassCard;

public class Player {
	private int balance;
	private int position;
	private HashMap<Integer, Integer> freePass;

	
	public Player(int balance) {
		this.balance = balance;
		position = 1;
		freePass = new HashMap<Integer, Integer>();
		
	}
	
	public void giveFreePass(int pos) {
		if (freePass.get(pos) == null)
			freePass.put(pos, 0);

		freePass.put(pos, freePass.get(pos) + 1);
	}
	
	public boolean useFreePass(int pos) {
		boolean haveFreePass = false;
		
		if (freePass.get(pos) > 0) {
			
			freePass.put(pos, freePass.get(pos) - 1);
			
			if (freePass.get(pos - 1) > 0) {
				freePass.put(pos - 1, freePass.get(pos) - 1);
				CardDeck.getInstance().giveBackCard(new FreePassCard(pos, pos - 1));
			} else {
				freePass.put(pos + 1, freePass.get(pos) - 1);
				CardDeck.getInstance().giveBackCard(new FreePassCard(pos, pos + 1));
			}			
			
			haveFreePass = true;
		}
		return haveFreePass;
	}
	
	public void move() {
		position += Dice.roll();
		passGoCheck();
	}
	
	public void moveToPosition(int position) {
		this.position = position;
		passGoCheck();
	}
	
	public void passGoCheck() {
		if (position > 32) {
			position -= 32;
			balance += 2;
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int pay(int cost) {
		return balance -= cost;
	}
	
	public void receivePayment(int amount) {
		balance += amount;
	}
	
	public int getPosition() {
		return position;
	}
}
