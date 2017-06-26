package boxes;

import card.Card;
import card.CardDeck;
import card.FreePassCard;
import card.GoToCard;
import game.Player;

public class ChanceBox implements Box {

	@Override
	public boolean nextAction(Player player) {
		Card newCard = CardDeck.getInstance().getCard();
		
		if (newCard instanceof GoToCard) {
			GoToCard card = (GoToCard) newCard;
			int nextPos = card.getNewPosition();
			player.moveToPosition(nextPos);
		} else {
			FreePassCard card = (FreePassCard) newCard;
			int[] positions = card.getPosition();
			player.giveFreePass(positions[0]);
			player.giveFreePass(positions[1]);
			CardDeck.getInstance().removeLatestCard();
		}
		
		return false;
	}

	@Override
	public boolean isBuyable() {
		return false;
	}
}
