package objects;

import java.util.Vector;

public class Player implements ObjectInterface{
	
	private String type;
	private String id;
	
	private Vector<Item> items;
	private String scene;
	
	//Why are we passing initScene as a String and not a Scene object?
	//In addItem we pass an Item object to Player.
	public Player(String initScene){
		type = "Player";
		id = "player";
		scene = initScene;
		items = new Vector<Item>();
	}
	public Player(){
		type = "Player";
		id = "player";
		scene = null;
		items = new Vector<Item>();
	}


	public String getId(){
		return id;
	}
	
	public void setId(String id){
		System.out.println("Cannot change id of player");
	}
	
	public String getType() {
		return type;
	}

	public Vector<Item> getItems() {
		return items;
	}

	public String getScene() {
		return scene;
	}


	public void setScene(String scene) {
		this.scene = scene;
	}
	
	public void addItem(Item item){
		//Check to make sure scene does not already contain the item
		if(!items.contains(item)){
			items.add(item);
		}
		else
			System.out.println("Player already has "+item.getId());
	}
	
	//We'll leave it like this for now, see how it works, and maybe change it later
	public void removeItem(Item item){
		int i=0;
		//Search for first occurrence of "item" and removes it from array. We are guaranteed a single occurrence of
		//an item by addItem(String)
		while(!items.get(i).getId().equalsIgnoreCase(item.getId())){
			i++;
			if(i==items.size()){
				System.out.println("Item "+item.getId()+" was not found.");
				return;
			}
		}
	items.remove(item);
	}
	public boolean containsItem(String id) {
		// TODO Auto-generated method stub
		return false;
	}
}
