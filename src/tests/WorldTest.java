package tests;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import objects.Item;
import objects.MoveEvent;
import objects.Scene;
import objects.TakeEvent;
import objects.UseEvent;
import objects.World;

import org.junit.Test;

public class WorldTest {

	@Test
	public void testWorld() throws FileNotFoundException {
		World testWorld = new World();
		
	
		Scene testRoom = new Scene("testRoom");
		Scene outside = new Scene("outside");
		Item trees = new Item("trees");
		Item lock = new Item("lock");
		Item crowbar = new Item("crowbar");

//		TakeEvent takeCrowbar = new TakeEvent(crowbar);
//		UseEvent crowbarToLock = new UseEvent("crowbarToLock", crowbar, lock);
//		MoveEvent moveTestRoom = new MoveEvent(testRoom);	
				
//		crowbarToLock.setReportDescription("SMASH.");
//		crowbarToLock.setReportNarration("");
//		crowbarToLock.setAdjoinScene(outside);
//		crowbarToLock.setUponScene(testRoom);
//	
//		
//		moveTestRoom.setVisMoveDesc("You are in a test room");
		
		
		testWorld.getScene().getScenes().add(outside);
		testWorld.getScene().editScene(1);
		testWorld.getScene().getScene().setVisualName("Outside");
		testWorld.getScene().getScene().getAdjoins().add("testRoom");
		testWorld.getScene().getScene().getItems().add("trees");
		testWorld.getScene().getScene().setVisualDescription("You are outside.");
		testWorld.getScene().getScene().setAuralBackdrop("sound://music/music2");
		testWorld.getScene().addScene();
		
		testWorld.getScene().getScenes().add(testRoom);
		testWorld.getScene().editScene(2);
		testWorld.getScene().getScene().getItems().add("lock");
		testWorld.getScene().getScene().getItems().add("crowbar");
		testWorld.getScene().getScene().setVisualDescription("You find yourself in a test room.");
		testWorld.getScene().getScene().setVisualName("Test Room");
		testWorld.getScene().getScene().setAuralBackdrop("sound://music/music2");
		testWorld.getScene().addScene();
		
		testWorld.getItem().getItems().add(trees);
		testWorld.getItem().editItem(1);
		testWorld.getItem().getItem().setVisualName("Trees");
		testWorld.getItem().getItem().setVisualDescription("It is a tree.  You hear birds.");
		testWorld.getItem().addItem();
		
		testWorld.getItem().getItems().add(lock);
		testWorld.getItem().editItem(2);
		testWorld.getItem().getItem().setVisualDescription("It is a lock on a door.");
		testWorld.getItem().getItem().setVisualName("Lock");
		testWorld.getItem().getItem().setUseable(true);
		testWorld.getItem().addItem();
		
		testWorld.getItem().getItems().add(crowbar);
		testWorld.getItem().editItem(3);
		testWorld.getItem().getItem().setVisualName("Crowbar");
		testWorld.getItem().getItem().setVisualDescription("It's a crowbar, perfect for unlocking things.");
		testWorld.getItem().getItem().setTakeable(true);
		testWorld.getItem().addItem();
		
		testWorld.translate();
		
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
