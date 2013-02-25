package objects;

public class Player {
	
	private String type;
	//TODO: Replace arrays with lists or vectors or SOMETHING else
	private Item[] items;
	private String scene;
	
	
	public Player(String initScene){
		type = "Player";
		scene = initScene;
		items = new Item[64];
	}


	public String getType() {
		return type;
	}

	public Item[] getItems() {
		return items;
	}

	public String getScene() {
		return scene;
	}


	public void setScene(String scene) {
		this.scene = scene;
	}
	
	public void addItem(Item item){
		int i=0;	
		//Making sure we are not repeating input in array
		while(i<items.length){
			if(items[i].getId().equalsIgnoreCase(item.getId())){
				System.out.println("Item "+item.getId()+" is already an item that the player has");
				return;
			}
		}
		
		i=0;
		//Search for first null String occurrence. This is where we add the item.
		while(items[i] != null){
			i++;
		}
		items[i] = item;
	}
	
	public void removeItem(Item item){
		int i=0;
		//Search for first occurrence of "item" and removes it from array. We are guaranteed a single occurrence of
		//an item by addItem(String)
		while(!items[i].getId().equalsIgnoreCase(item.getId())){
			i++;
			if(i==items.length){
				System.out.println("Item "+item.getId()+" was not found.");
				return;
			}
		}
	items[i] = null;
	}
}
