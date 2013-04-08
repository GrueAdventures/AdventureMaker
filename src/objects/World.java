package objects;

import java.util.Iterator;
import java.util.Vector;

public class World {
	private Player player;
	private Vector<Scene> scenes;
	private Vector<Event> events;
	private Vector<Item> items;
	private Vector<Ctrl> ctrls;

	
	public World(){
		player = new Player();
		scenes = new Vector<Scene>();
		events = new Vector<Event>();
		items = new Vector<Item>();
		ctrls = new Vector<Ctrl>();
	}

	public Player getPlayer() {
		return player;
	}
	
	public Vector<Item> getItems() {
		return items;
	}

	public Vector<Scene> getScenes() {
		return scenes;
	}

	public Vector<Event> getEvents() {
		return events;
	}

	public Vector<Ctrl> getCtrls() {
		return ctrls;
	}
	
}
