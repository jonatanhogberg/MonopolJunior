package playGame;

import boxes.GoToRestBox;
import boxes.ShowBox;
import game.OnkelKrosus;
import game.Player;

public class ShowBoxMain {

	public static void main(String[] args) {
		Player player = new Player(100);
		ShowBox showBox = new ShowBox("Ok");
		GoToRestBox go = new GoToRestBox();

		showBox.nextAction(player);
		go.nextAction(player);
		
		System.out.println(player.getBalance());
		System.out.println(OnkelKrosus.getInstance().OnkelMoeny());
		
	}

}
