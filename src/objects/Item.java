package objects;

import util.Explanation;
import util.annotations.Column;
import util.annotations.Row;
import util.annotations.Visible;

public class Item extends AbstractObject implements ObjectInterface{
	
	protected String type;
	protected String id;
	
	protected String visualName;
	protected String visualDescription;
	
	protected String auralName;
	protected String auralDescription;
	
	protected boolean useable;
	protected boolean takeable;
	
//	private Vector<String> properties;
	
	public Item(){
		type = "item";
		id = "";
		visualName = "";
		visualDescription = "";
		auralName = "";
		auralDescription = "";
		useable = false;
		takeable = false;		
//		properties = new Vector<String>();
	}
	
	public Item(String id, String visName, String visDesc, String aurName, String aurDesc, boolean use, boolean take){
		type = "item";
		this.id = id;
		visualName = visName;
		visualDescription = visDesc;
		auralName = aurName;
		auralDescription = aurDesc;
		useable = use;
		takeable = take;
	}

// constructor for creating an Item with only an ID.
// I don't know if this is necessary.
//	public Item(String id){
//		type = "item";
//		this.id = id;
//		visualName = "";
//		visualDescription = "";
//		auralName = "";
//		auralDescription = "";
//		properties = new Vector<String>();
//		
//	}

//	public void addProperty(String property){
//		//Check to make sure scene does not already contain the item
//		if(!properties.contains(property)){
//			properties.add(property);
//		}
//		else
//			System.out.println(this.id+" already contains "+property);
//	}
//	
//	//We'll do this for now, may change later
//	public void removeProperty(String property){
//		int i=0;
//		//Search for first occurrence of "property" and removes it from array. We are guaranteed a single occurrence of
//		//a property by addProperty(String)
//		while(!properties.get(i).equalsIgnoreCase(property)){
//			i++;
//			if(i==properties.size()){
//				System.out.println("Property "+property+" was not found.");
//				return;
//			}
//		}
//		properties.remove(property);
//	}
	
	@Visible(false)
	public String getType() {
		return type;
	}
	
	
	@Row(0)  @Column(0) @Explanation("Id of Item")
	public String getId() {
		return id;
	}
	
	@Row(1) @Column(0)
	public String getVisualName() {
		return visualName;
	}

	@Row(2) @Column(0)
	public String getVisualDescription() {
		return visualDescription;
	}

	@Row(3) @Column(0)
	public String getAuralName() {
		return auralName;
	}

	@Row(4) @Column(0)
	public String getAuralDescription() {
		return auralDescription;
	}

	@Row(5) @Column(0)
	public boolean getUseable(){
		return useable;
	}
	
	@Row(6) @Column(0)
	public boolean getTakeable(){
		return takeable;
	}

	
}
