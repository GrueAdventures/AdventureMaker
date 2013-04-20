package objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Vector;

import util.annotations.Column;
import util.annotations.Row;

public class World {
	private Player player;
	private ItemTab itemTab;
	private SceneTab sceneTab;
//	private Vector<Scene> scenes;
	private Vector<Event> events;
//	private Vector<Item> items;
	private Vector<Ctrl> ctrls;
	
	private Translator translator = new Translator();
	
	public World(){
		player = new Player();
		itemTab = new ItemTab();
		sceneTab = new SceneTab();
//		scenes = new Vector<Scene>();
		events = new Vector<Event>();
//		items = new Vector<Item>();
		ctrls = new Vector<Ctrl>();
	}

//	public Player getPlayer() {
//		return player;
//	}
	
	@Row(0) @Column(0)
	public ItemTab getItem(){
		return itemTab;
	}
	
//	@Row(1) @Column(0)
//	public Vector<Item> getItems() {
//		return itemTab.getItems();
//	}
//	
//	public void addItem(){
//		itemTab.addItem();
//	}
//	
//	public void removeItem(Item item){
//		int i=0;
//		//Search for first occurrence of "item" and removes it from vector. We are guaranteed a single occurrence of
//		//an item by addItem(Item)
//		while(!itemTab.getItems().get(i).getId().equalsIgnoreCase(item.getId())){
//			i++;
//			if(i==itemTab.getItems().size()){
//				System.out.println("Item "+item.getId()+" was not found.");
//				return;
//			}
//		}
//		itemTab.getItems().remove(item);
//	}
//	
//	public Item editItem(int i){
//		return itemTab.getItems().get(i-1);
//	}

	@Row(0) @Column(1)
	public SceneTab getScene(){
		return sceneTab;
	}
	
//	public Vector<Scene> getScenes() {
//		return scenes;
//	}
//	
	public void addScene(Scene scene){
		//Check to make sure world does not already contain the scene
		if(!sceneTab.getScenes().contains(scene)){
			sceneTab.getScenes().add(scene);
		}
		else
			System.out.println("World already contains "+scene.getId());
	}
	
	public void removeScene(Scene scene){
		int i=0;
		//Search for first occurrence of "scene" and removes it from vector. We are guaranteed a single occurrence of
		//a scene by addScene(Scene)
		while(!sceneTab.getScenes().get(i).getId().equalsIgnoreCase(scene.getId())){
			i++;
			if(i==sceneTab.getScenes().size()){
				System.out.println("Scene "+scene.getId()+" was not found.");
				return;
			}
		}
		sceneTab.getScenes().remove(scene);
	}
	
	public Scene editScene(int i){
		return sceneTab.getScenes().get(i-1);
	}

	@Row(3) @Column(0)
	public Vector<Event> getEvents() {
		return events;
	}
	
	public void addEvent(Event event){
		//Check to make sure world does not already contain the event
		if(!events.contains(event)){
			events.add(event);
		}
		else
			System.out.println("World already contains "+event.getId());
	}
	
	public void removeEvent(Event event){
		int i=0;
		//Search for first occurrence of "event" and removes it from vector. We are guaranteed a single occurrence of
		//an event by addEvent(Event)
		while(!events.get(i).getId().equalsIgnoreCase(event.getId())){
			i++;
			if(i==events.size()){
				System.out.println("Event "+event.getId()+" was not found.");
				return;
			}
		}
		events.remove(event);
	}
	
	public void translate() throws FileNotFoundException{
		File file = new File("test.json");
		PrintWriter writer = new PrintWriter(file);
		
		for(int i=0; i<items.size(); i++){
			translator.itemTranslate(writer, items.get(i));
			
		}
		
		for(int i=0; i<scenes.size(); i++){
			translator.sceneTranslate(writer, scenes.get(i));
		}
		
	}
	
}