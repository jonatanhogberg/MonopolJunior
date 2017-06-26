package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import playGame.PlayGame;

public class PlayGameTest {
	PlayGame play;
	

	@Before
	public void setUp() throws Exception {
		int players = 2;
		int startMoney = 10;
		play = new PlayGame(players, 10);
	}

	@After
	public void tearDown() throws Exception {
		play = null;
	}

	@Test
	public void testPlayGame() {
		fail("Not yet implemented");
	}

	@Test
	public void testGiveStrategy() {
		fail("Not yet implemented");
	}

	@Test
	public void testAmountOfPlayers() {
		fail("Not yet implemented");
	}

	@Test
	public void testWinner() {
		fail("Not yet implemented");
	}

	@Test
	public void testResetGame() {
		fail("Not yet implemented");
	}

	@Test
	public void testNextMove() {
		fail("Not yet implemented");
	}

}
