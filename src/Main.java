
public class Main {

	public static void main(String[] args) {
		PlayField pf = new PlayField(3);
		pf.startGame();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Player: "  + pf.getCurrentPlayer());
			System.out.println(pf.checkPlayerCurrentPosition());
			pf.nextPlayerMove();
			System.out.println("-------------");
		}
		
	}
}
