package objects;

import java.util.Vector;

public class Item {
	
	private String type;
	private String id;
	
	private String visualName;
	private String visualDescription;
	
	private String auralName;
	private String auralDescription;
	
	private Vector<String> properties;
	
	public Item(String id, String vName, String vDesc, String aName, String aDesc, Vector<String> props){
		type = "item";
		this.id = id;
		visualName = vName;
		visualDescription = vDesc;
		auralName = aName;
		auralDescription = aDesc;
		properties = props;
	}
	
	public String getType() {
		return type;
	}

	public String getId() {
		return id;
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

	public Vector<String> getProperties() {
		return properties;
	}

	public void addProperty(String property){
		//Check to make sure scene does not already contain the item
		if(!properties.contains(property)){
			properties.add(property);
		}
		else
			System.out.println(this.id+" already contains "+property);
	}
	
	//We'll do this for now, may change later
	public void removeProperty(String property){
		int i=0;
		//Search for first occurrence of "property" and removes it from array. We are guaranteed a single occurrence of
		//a property by addProperty(String)
		while(!properties.get(i).equalsIgnoreCase(property)){
			i++;
			if(i==properties.size()){
				System.out.println("Property "+property+" was not found.");
				return;
			}
		}
		properties.remove(property);
	}
	
}
