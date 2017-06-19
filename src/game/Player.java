package game;

public class Player {
	private int balance;
	private int position;
	
	public Player() {
		position = 0;
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
