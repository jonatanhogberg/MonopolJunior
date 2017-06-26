package game;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlayFieldTest {
	PlayField pf;

	@Before
	public void setUp() throws Exception {
		pf = new PlayField();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPlayField() {
		
	}

	@Test
	public void testStartGame() {
		int players = 2;
		int startMoney = 10;
		pf.startGame(players, startMoney);
	}
	
	@Test
	public void testCheckBalance() {
		//assert(10, pf.checkBalance(1));
		
	}

	@Test
	public void testNextPlayerMove() {
		pf.playerMove();
	}

	@Test
	public void testCanBuy() {
		fail("Not yet implemented");
	}

	@Test
	public void testCostForEntertement() {
		fail("Not yet implemented");
	}

	@Test
	public void testCurrentPlayerBuy() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsGameOver() {
		fail("Not yet implemented");
	}

	@Test
	public void testVictoryPlayer() {
		fail("Not yet implemented");
	}

	@Test
	public void testCurrentPlayerBroke() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCurrentPosition() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCurrentPlayer() {
		fail("Not yet implemented");
	}

}
