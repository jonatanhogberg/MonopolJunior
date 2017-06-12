
public class Player {
	private int balance;
	private int position;
	
	public Player() {
		position = 0;
	}
	
	public void move() {
		position += Dice.roll();
		passGo();
	}
	
	public void passGo() {
		if (position > 32) {
			position -= 32;
			balance += 2;
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int getPosition() {
		return position;
	}
}
