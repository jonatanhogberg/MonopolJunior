package card;

public class GoToCard implements Card {
	private int newPosition;

	public GoToCard(int newPosition) {
		this.newPosition = newPosition;
	}
	
	public int getNewPosition() {
		return newPosition;
	}
}
