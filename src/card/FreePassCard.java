package card;

public class FreePassCard implements Card {
	private int firstPos;
	private int secondPos;
	
	public FreePassCard(int firstPos, int secondPos) {
		this.firstPos = firstPos;
		this.secondPos = secondPos;
	}
	
	public int[] getPosition() {
		return new int[] {firstPos, secondPos};
	}

}
