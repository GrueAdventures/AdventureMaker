package tests;

import static org.junit.Assert.*;

import objects.Item;
import objects.Player;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testPlayer() {
		//Basic Constructor Test1 (and get test)
		//Create a player with a starting scene
		Player testPlayer1 = new Player("testScene");
		assertTrue(testPlayer1.getType() == "Player"
				 &&testPlayer1.getId() == "player"
				 &&testPlayer1.getItems().isEmpty()
				 &&testPlayer1.getScene() == "testScene");
		//Basic Constructor Test2 (and get test)
		//Create player without a starting scene
		Player testPlayer2 = new Player();
		assertTrue(testPlayer2.getType() == "Player"
				 &&testPlayer2.getId() == "player"
				 &&testPlayer1.getItems().isEmpty()
				 &&testPlayer2.getScene() == null);
	
		//Not sure if implementation of Player is correct.  Scenes and things are 
		//held as strings.  Maybe should be held as their respective object.
		//Need to speak with Jose/Rei.
		fail("Not yet implemented");
	}

	@Test
	public void testAddItem() {
		//Basic test case
		//Make a new player, make a new item, then add item to player.
		//Check to see if item is in Player.
		Player testPlayer = new Player();
		Item testItem = new Item("testItem");
		testPlayer.addItem(testItem);
		assertTrue(testPlayer.containsItem("testItem"));
		
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveItem() {
		//Basic test case
		//Make a new player, make a new item, add item to player, and then remove it.
		//Make sure player does not contain item.
		Player testPlayer = new Player();
		Item testItem1 = new Item("testItem1");
		Item testItem2 = new Item("testItem2");
		testPlayer.addItem(testItem1);
		testPlayer.addItem(testItem2);
		
		//test basic remove
		testPlayer.removeItem(testItem1);
		assertTrue(!testPlayer.containsItem("testItem1"));
		assertTrue(testPlayer.containsItem("testItem2"));
		
		//test remove on an item that isn't in player's item vector
		testPlayer.removeItem(testItem1);
		assertTrue(!testPlayer.containsItem("testItem1"));
		assertTrue(testPlayer.containsItem("testItem2"));
		
		//test remove on  empty array
		testPlayer.removeItem(testItem2);
		assertTrue(testPlayer.getItems().isEmpty());
		testPlayer.removeItem(testItem2);
		assertTrue(testPlayer.getItems().isEmpty());
		
		fail("Not yet implemented");
	}

}
