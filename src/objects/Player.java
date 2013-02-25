package objects;

public class Player {
	
	private String type;
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
	
	
	//TODO: Add checks to make sure it doesn't repeat input in array
	public void addItem(Item item){
		int i=0;
		//Search for first null String occurrence. This is where we add the item.
		while(items[i] != null){
			i++;
		}
		items[i] = item;
	}
	
	public void removeItem(Item item){
		int i=0;
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
