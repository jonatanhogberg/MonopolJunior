package game;
public class OnkelKrosus {
	
	private static OnkelKrosus instance = new OnkelKrosus();
	private int balance = 0;

	private OnkelKrosus() {}

	public static OnkelKrosus getInstance(){
		return instance;
	}
	
	public void payOnkel(int amount) {
		balance += amount;
	}
	
	public void receiveFromOnkel(Player player) {
		player.receivePayment(balance);
		balance = 0;
	}
}
