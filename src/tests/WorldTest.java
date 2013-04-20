package tests;

import static org.junit.Assert.*;

import objects.Item;
import objects.MoveEvent;
import objects.Scene;
import objects.TakeEvent;
import objects.UseEvent;
import objects.World;

import org.junit.Test;

public class WorldTest {

	@Test
	public void testWorld() {
		World testWorld = new World();
		
	
		Scene testRoom = new Scene("testRoom");
		Scene outside = new Scene("outside");
		Item trees = new Item("trees");
		Item lock = new Item("lock");
		Item crowbar = new Item("crowbar");
		Item journal = new Item("journal");
		TakeEvent takeCrowbar = new TakeEvent(crowbar);
		UseEvent crowbarToLock = new UseEvent("crowbarToLock", crowbar, lock);
		MoveEvent moveTestRoom = new MoveEvent(testRoom);
		
		testWorld.getItem().getItems().add(trees);
		testWorld.getItem().editItem(1);
		testWorld.getItem().getItem().setVisualName("Trees");
		testWorld.getItem().getItem().setVisualDescription("It is a tree.  You hear birds.");
		

		
		crowbarToLock.setReportDescription("SMASH.");
		crowbarToLock.setReportNarration("");
		crowbarToLock.setAdjoinScene(outside);
		crowbarToLock.setUponScene(testRoom);
	
		
		moveTestRoom.setVisMoveDesc("You are in a test room");
		
		testRoom.getItems().add(lock);
		testRoom.getItems().add(crowbar);
		testRoom.setVisualDescription("You find yourself in a test room.  You do not know how you got here.");
		testRoom.setVisualName("Test Room");
		testRoom.setAuralBackdrop("sound://music/music2");
		
		outside.getItems().add(trees);
		outside.getAdjoins().add(testRoom);
		outside.setVisualName("Outside");
		outside.setVisualDescription("You are outside.");
		outside.setAuralBackdrop("sound://music/music2");
		
		testWorld.getScene().
		
		testWorld.getItem().getItems().add(lock);
		testWorld.getItem().editItem(2);
		testWorld.getItem().getItem().setVisualDescription("It is a lock on a door.");
		testWorld.getItem().getItem().setVisualName("Lock");
		testWorld.getItem().getItem().setUseable(true);
		
		
		crowbar.setVisualName("Crowbar");
		crowbar.setVisualDescription("It's a crowbar, perfect for unlocking things.");
		crowbar.getProperties().add("takeable");
		
		journal.setVisualName("Journal");
		journal.setVisualDescription("It's a journal.  To save your game, use it.");
		journal.setAuralDescription("sound://speech/journalDesc");
		journal.setAuralName("sound://speech/journal");
		journal.getProperties().add("useable");
	}

	@Test
	public void testAddObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveObject() {
		fail("Not yet implemented");
	}

}
