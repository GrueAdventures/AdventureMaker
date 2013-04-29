package objects;

import java.util.Vector;

import util.annotations.Explanation;
import util.annotations.Column;
import util.annotations.Label;
import util.annotations.Row;
import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Bean Pattern")
public class EditableScene extends Scene {
	
	
	public EditableScene(){
		type = "scene";
		this.id = "";
		visualName = "";
		visualDescription = "";
		visualBackdrop = "";
		auralName = "";
		auralDescription = "";
		auralBackdrop = "";
		this.controller = null;
//		items = new Vector<String>();
		resetItems();
		adjoins = new Vector<String>();	
	}
	
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

	@Visible(false) @Row(7) @Column(1)
	public void setController(Ctrl controller) {
		this.controller = controller;
	}
	
	@Row(8) @Column(0)
	public Vector<String> getItems() {
		return items;
	}

	@Row(10) @Column(0)
	public Vector<String> getAdjoins() {
		return adjoins;
	}	

	
	private void resetItems(){
		items.clear();
		items = new Vector<String>();
	}
	
	//BEGIN ADD AND REMOVE METHODS FOR VECTOR<STRING> items AND adjoins
	
	@Row(9) @Column(0) @Explanation("Add an Item id to this Scene")@Label("Add Item")
	public void addItem(){
		String item = "";
		//Check to make sure scene does not already contain the item
		if(!items.contains(item)){
			items.add(item);
		}
		else
			System.out.println(this.id+" already contains "+item);
	}
	

	@Row(9) @Column(1) @Explanation("Remove an Item id from this Scene")@Label("Remove Item")
	public void removeItem(int i){
		if((i>items.size())||(i<=0)){
			System.out.println("Please enter a number within the range.");
			return;
		}
		i=i-1;
		items.remove(items.get(i));
	}
	
	@Row(11) @Column(0) @Explanation("Add an ajoining Scene id to this Scene") @Label("Add Adjacent Scene")
	public void addScene(){
		String scene = "";
		//Check to make sure scene is not already joined
		if(!adjoins.contains(scene)){
			adjoins.add(scene);
		}
		else
			System.out.println(this.id+" already contains "+scene);
	}
	
	@Row(11) @Column(1) @Explanation("Remove an ajoining Scene id from this Scene") @Label("Remove Scene")
	public void removeScene(int i){
		if((i>adjoins.size())||(i<=0)){
			System.out.println("Please enter a number within the range.");
			return;
		}
		i=i-1;
		adjoins.remove(adjoins.get(i));
	}
	
	//END ADD AND REMOVE METHODS FOR VECTOR<STRING> items AND adjoins

}
