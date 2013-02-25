package objects;

public class Scene {
	
	private String type;
	private String id;
	
	private String visualName;
	private String visualDescription;
	private String visualBackdrop;
	
	private String auralName;
	private String auralDescription;
	private String auralBackdrop;
	
	private Ctrl controller;
	
	//TODO: Replace arrays with lists or vectors or SOMETHING else
	private Item[] items;
	private Scene[] adjoins;
	
	//Constructor with Ctrl variable
	public Scene(String id, String vName, String vDescription, String vBackdrop,
			String aName, String aDescription, String aBackdrop, Ctrl controller){
		type = "scene";
		this.id = id;
		visualName = vName;
		visualDescription = vDescription;
		visualBackdrop = vBackdrop;
		auralName = aName;
		auralDescription = aDescription;
		auralBackdrop = aBackdrop;
		this.controller = controller;
		items = new Item[64];
		adjoins = new Scene[64];
		
	}
	
	//Constructor without Ctrl variable
	public Scene(String id, String vName, String vDescription, String vBackdrop,
			String aName, String aDescription, String aBackdrop){
		type = "scene";
		this.id = id;
		visualName = vName;
		visualDescription = vDescription;
		visualBackdrop = vBackdrop;
		auralName = aName;
		auralDescription = aDescription;
		auralBackdrop = aBackdrop;
		controller = null;
		items = new Item[64];
		adjoins = new Scene[64];
	}

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVisualName() {
		return visualName;
	}

	public void setVisualName(String visualName) {
		this.visualName = visualName;
	}

	public String getVisualDescription() {
		return visualDescription;
	}

	public void setVisualDescription(String visualDescription) {
		this.visualDescription = visualDescription;
	}

	public String getVisualBackdrop() {
		return visualBackdrop;
	}

	public void setVisualBackdrop(String visualBackdrop) {
		this.visualBackdrop = visualBackdrop;
	}

	public String getAuralName() {
		return auralName;
	}

	public void setAuralName(String auralName) {
		this.auralName = auralName;
	}

	public String getAuralDescription() {
		return auralDescription;
	}

	public void setAuralDescription(String auralDescription) {
		this.auralDescription = auralDescription;
	}

	public String getAuralBackdrop() {
		return auralBackdrop;
	}

	public void setAuralBackdrop(String auralBackdrop) {
		this.auralBackdrop = auralBackdrop;
	}

	public Ctrl getController() {
		return controller;
	}

	public void setController(Ctrl controller) {
		this.controller = controller;
	}

	public Item[] getItems() {
		return items;
	}

	public Scene[] getAdjoins() {
		return adjoins;
	}	
	
	public void addItem(Item item){
		int i=0;	
		//Making sure we are not repeating input in array
		while(i<items.length){
			if(items[i].getId().equalsIgnoreCase(item.getId())){
				System.out.println("Item "+item.getId()+" is already an item in the room");
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
	
	//TODO: Populate addScene
	public void addScene(Scene scene){
		
	}
	
	//TODO: Populate removeScene
	public void removeScene(Scene scene){
		
	}

}
