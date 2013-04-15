package objects;

import util.annotations.Column;
import util.annotations.Row;

public class EditableScene extends Scene {
	
	@Row(0) @Column(1)
	public void setId(String id) {
		this.id = id;
	}

	@Row(1) @Column(1)
	public void setVisualName(String visualName) {
		this.visualName = visualName;
	}

	@Row(2) @Column(1)
	public void setVisualDescription(String visualDescription) {
		this.visualDescription = visualDescription;
	}

	@Row(3) @Column(1)
	public void setVisualBackdrop(String visualBackdrop) {
		this.visualBackdrop = visualBackdrop;
	}

	@Row(4) @Column(1)
	public void setAuralName(String auralName) {
		this.auralName = auralName;
	}

	@Row(5) @Column(1)
	public void setAuralDescription(String auralDescription) {
		this.auralDescription = auralDescription;
	}

	@Row(6) @Column(1)
	public void setAuralBackdrop(String auralBackdrop) {
		this.auralBackdrop = auralBackdrop;
	}

	@Row(7) @Column(1)
	public void setController(Ctrl controller) {
		this.controller = controller;
	}
	
	public void addItem(String item){
		//Check to make sure scene does not already contain the item
		if(!items.contains(item)){
			items.add(item);
		}
		else
			System.out.println(this.id+" already contains "+item);
	}
	
	//This may have to be by ID
	//We'll see how it goes
	public void removeItem(String item){
		int i=0;
		//Search for first occurrence of "item" and removes it from array. We are guaranteed a single occurrence of
		//an item by addItem(String)
		while(!items.get(i).equalsIgnoreCase(item)){
			i++;
			if(i==items.size()){
				System.out.println("Item "+item+" was not found.");
				return;
			}
		}
	items.remove(item);
	}
	
	public void addScene(String scene){
		//Check to make sure scene is not already joined
		if(!adjoins.contains(scene)){
			adjoins.add(scene);
		}
		else
			System.out.println(this.id+" already contains "+scene);
	}
	
	public void removeScene(String scene){
		int i=0;
		//Search for first occurrence of "item" and removes it from array. We are guaranteed a single occurrence of
		//an item by addItem(String)
		while(!adjoins.get(i).equalsIgnoreCase(scene)){
			i++;
			if(i==adjoins.size()){
				System.out.println("Item "+scene+" was not found.");
				return;
			}
		}
	adjoins.remove(scene);
	}

}
