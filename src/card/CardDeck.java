package card;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {
	private static CardDeck instance = new CardDeck();
	
	private static ArrayList<Card> cards;

	private CardDeck() {
		cards = new ArrayList<>();
		init();
	}
	
	public static CardDeck getInstance(){
		return instance;
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card getCard() {
		shuffle();
		return cards.get(cards.size() - 1);
	}
	
	public void removeLatestCard() {
		cards.remove(cards.size() - 1);
	}
	
	public void giveBackCard(Card card) {
		cards.add(card);
	}
	
	public void init() {
		cards.add(new FreePassCard(2, 3));
		cards.add(new FreePassCard(6, 7));
		cards.add(new FreePassCard(6, 7));
		cards.add(new FreePassCard(11, 12));
		cards.add(new FreePassCard(14, 15));
		cards.add(new FreePassCard(14, 15));
		cards.add(new FreePassCard(18, 19));
		cards.add(new FreePassCard(22, 23));
		cards.add(new FreePassCard(22, 23));
		cards.add(new FreePassCard(27, 28));
		cards.add(new FreePassCard(30, 31));
		cards.add(new FreePassCard(30, 31));
		
		cards.add(new GoToCard(1));
		cards.add(new GoToCard(5));
		cards.add(new GoToCard(8));
		cards.add(new GoToCard(11));
		cards.add(new GoToCard(13));
		cards.add(new GoToCard(14));
		cards.add(new GoToCard(18));
		cards.add(new GoToCard(21));
		cards.add(new GoToCard(24));
		cards.add(new GoToCard(25));
		cards.add(new GoToCard(27));
		cards.add(new GoToCard(29));
		cards.add(new GoToCard(30));
	}
}
