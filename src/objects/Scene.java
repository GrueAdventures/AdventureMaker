package objects;

import java.util.Vector;

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
	
	private Vector<Item> items;
	private Vector<Scene> adjoins;
	
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
		items = new Vector<Item>();
		adjoins = new Vector<Scene>();
		
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
		items = new Vector<Item>();
		adjoins = new Vector<Scene>();
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

	public Vector<Item> getItems() {
		return items;
	}

	public Vector<Scene> getAdjoins() {
		return adjoins;
	}	
	
	public void addItem(Item item){
		//Check to make sure scene does not already contain the item
		if(!items.contains(item)){
			items.add(item);
		}
		else
			System.out.println(this.id+" already contains "+item.getId());
	}
	//This may have to be by ID
	//We'll see how it goes
	public void removeItem(Item item){
		
//		if(items.remove(item)){
//			System.out.println("");
//		}
		
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
	
	public void addScene(Scene scene){
		//Check to make sure scene is not already joined
		if(!adjoins.contains(scene)){
			adjoins.add(scene);
		}
		else
			System.out.println(this.id+" already contains "+scene.getId());
	}
	
	//TODO: Populate removeScene
	public void removeScene(Scene scene){
		
	}

}
