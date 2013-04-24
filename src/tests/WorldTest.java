package tests;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import objects.ActionType;
import objects.EventType;
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
	
		testWorld.getGameInfo().setGameName("Test World");
		testWorld.getGameInfo().setStartingScene("testRoom");
		
		testWorld.getEvent().getEvent().addExec();
		testWorld.getEvent().getEvent().getExecs().get(0).setAction(ActionType.append);
		testWorld.getEvent().getEvent().getExecs().get(0).setArg1("scene.testRoom.adjoins");
		testWorld.getEvent().getEvent().getExecs().get(0).setArg2("outside");

		testWorld.getEvent().getEvent().addExec();	
		testWorld.getEvent().getEvent().getExecs().get(1).setAction(ActionType.remove);
		testWorld.getEvent().getEvent().getExecs().get(1).setArg1("player.items");
		testWorld.getEvent().getEvent().getExecs().get(1).setArg2("crowbar");

		testWorld.getEvent().getEvent().addExec();	
		testWorld.getEvent().getEvent().getExecs().get(2).setAction(ActionType.remove);
		testWorld.getEvent().getEvent().getExecs().get(2).setArg1("scene.testRoom.items");
		testWorld.getEvent().getEvent().getExecs().get(2).setArg2("lock");

			
		testWorld.getEvent().getEvent().getReport().setDescription("SMASH!");
		testWorld.getEvent().getEvent().getOn().setType(EventType.UseOn);
		testWorld.getEvent().getEvent().getOn().setArg1("crowbar");
		testWorld.getEvent().getEvent().getOn().setArg2("lock");
		testWorld.getEvent().getEvent().setId("useCrowbarOnLock");
		testWorld.getEvent().addEvent();
		
		testWorld.getEvent().getEvent().addExec();
		testWorld.getEvent().getEvent().getExecs().get(0).setAction(ActionType.set);
		testWorld.getEvent().getEvent().getExecs().get(0).setArg1("scene.testRoom.visual.description");
		testWorld.getEvent().getEvent().getExecs().get(0).setArg2("You are in a testroom.");
		testWorld.getEvent().getEvent().addExec();
		testWorld.getEvent().getEvent().getExecs().get(1).setAction(ActionType.set);
		testWorld.getEvent().getEvent().getExecs().get(1).setArg1("scene.testRoom.aural.description");
		testWorld.getEvent().getEvent().getOn().setType(EventType.Move);
		testWorld.getEvent().getEvent().getOn().setArg1("testRoom");
		testWorld.getEvent().getEvent().setId("moveTestRoom");
		testWorld.getEvent().addEvent();
		
		
		testWorld.getEvent().getEvent().addExec();
		testWorld.getEvent().getEvent().getExecs().get(0).setAction(ActionType.append);
		testWorld.getEvent().getEvent().getExecs().get(0).setArg1("item.lock.properties");
		testWorld.getEvent().getEvent().getExecs().get(0).setArg2("useable");
		
		testWorld.getEvent().getEvent().setId("takeCrowbar");
		testWorld.getEvent().getEvent().getOn().setType(EventType.Take);
		testWorld.getEvent().getEvent().getOn().setArg1("crowbar");
		testWorld.getEvent().addEvent();
		
//		crowbarToLock.setReportDescription("SMASH.");
//		crowbarToLock.setReportNarration("");
//		crowbarToLock.setAdjoinScene(outside);
//		crowbarToLock.setUponScene(testRoom);
//	
//		
//		moveTestRoom.setVisMoveDesc("You are in a test room");
		
		testWorld.getItem().getItem().setId("trees");
		testWorld.getItem().getItem().setVisualName("Trees");
		testWorld.getItem().getItem().setVisualDescription("It is a tree.  You hear birds.");
		testWorld.getItem().addItem();
		
		testWorld.getItem().getItem().setId("lock");
		testWorld.getItem().getItem().setVisualDescription("It is a lock on a door.");
		testWorld.getItem().getItem().setVisualName("Lock");
		testWorld.getItem().getItem().setUseable(true);
		testWorld.getItem().addItem();
		
		testWorld.getItem().getItem().setId("crowbar");
		testWorld.getItem().getItem().setVisualName("Crowbar");
		testWorld.getItem().getItem().setVisualDescription("It's a crowbar, perfect for unlocking things.");
		testWorld.getItem().getItem().setTakeable(true);
		testWorld.getItem().addItem();
		
		testWorld.getScene().getScene().setId("outside");
		testWorld.getScene().getScene().setVisualName("Outside");
		testWorld.getScene().getScene().addScene("testRoom");
		testWorld.getScene().getScene().addItem("trees");
		testWorld.getScene().getScene().setVisualDescription("You are outside.");
		testWorld.getScene().getScene().setAuralBackdrop("sound://music/music2");
		testWorld.getScene().addScene();
		
		testWorld.getScene().getScene().setId("testRoom");
		testWorld.getScene().getScene().addItem("lock");
		testWorld.getScene().getScene().addItem("crowbar");
		testWorld.getScene().getScene().setVisualDescription("You find yourself in a test room.");
		testWorld.getScene().getScene().setVisualName("Test Room");
		testWorld.getScene().getScene().setAuralBackdrop("sound://music/music2");
		testWorld.getScene().addScene();
		
		
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
