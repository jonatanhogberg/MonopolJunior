package game;
public class Main {

	public static void main(String[] args) {
		PlayField pf = new PlayField();
		pf.startGame(2, 10);
		
		for (int i = 0; i < 100; i++) {
			pf.nextPlayerMove();
			System.out.println("");
			System.out.println("Move: " + (i + 1));
			System.out.println("");
			System.out.println("Player: " + pf.getCurrentPlayer());
			System.out.println("Position: " + pf.getCurrentPosition());
			
			boolean canBuy = pf.canBuy();
			
			if (canBuy) {
				boolean buy = pf.currentPlayerBuy();
				System.out.println("Can buy!");
				if (buy) 
					System.out.println("Did buy!");
			}
			System.out.println("Balance: " + pf.checkBalance());
			System.out.println("Onkel: " + OnkelKrosus.getInstance().OnkelMoeny());
			System.out.println("");
		}
	}
}
