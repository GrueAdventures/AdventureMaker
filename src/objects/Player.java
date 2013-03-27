//I made the arguments consistent, for better or for worse.

package objects;

import java.util.Iterator;
import java.util.Vector;

public class Player extends AbstractObject implements ObjectInterface{
	
	private String type;
	private String id;
	
	private Vector<Item> items;
	private Scene scene;
	
	public Player(Scene initScene){
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

	public Scene getScene() {
		return scene;
	}


	public void setScene(Scene obScene) {
		this.scene = obScene;
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
//		int i=0;
		//Search for first occurrence of "item" and removes it from array. We are guaranteed a single occurrence of
		//an item by addItem(String)
//		while(!items.get(i).getId().equalsIgnoreCase(item.getId())){
//			i++;
//			if(i==items.size()){
//				System.out.println("Item "+item.getId()+" was not found.");
//				return;
//			}
//		}
	items.remove(item);
	}
	
	public Item getItemById(String id){
		Iterator<Item> itemItr = items.iterator();
		Item temp;
		while(itemItr.hasNext()){
			temp = itemItr.next();
			if(temp.equals(id)) return temp;
		}
		System.out.println("returning null");
		return null;
	}
	
	public boolean hasItem(String id) {
		//The outside class will have to determine whether or not two objects are equals
		Iterator<Item> itemItr = items.iterator();
		while(itemItr.hasNext()){
			if(itemItr.next().getId().equals(id)) return true;
		}
		return false;
	}
	
	public boolean hasItem(Item item){
		return items.contains(item);
	}
	
}
