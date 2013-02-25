package objects;

public class Item {
	
	private String type;
	private String id;
	
	private String visualName;
	private String visualDescription;
	
	private String auralName;
	private String auralDescription;
	
	//TODO: Replace arrays with lists or vectors or SOMETHING else
	private String[] properties;
	
	public Item(String id, String vName, String vDesc, String aName, String aDesc, String[] props){
		type = "item";
		this.id = id;
		visualName = vName;
		visualDescription = vDesc;
		auralName = aName;
		auralDescription = aDesc;
		properties = new String[64];
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

	public String[] getProperties() {
		return properties;
	}

	public void addProperty(String property){
		int i=0;
		
		//Making sure we are not repeating input in array
		while(i<properties.length){
			if(properties[i].equalsIgnoreCase(property)){
				System.out.println("Property "+property+" is already a property off the item");
				return;
			}
		}
		
		i=0;
		//Search for first null String occurrence. This is where we add the property.
		while(properties[i] != null){
			i++;
		}
		properties[i] = property.toLowerCase();
	}
	
	public void removeProperty(String property){
		int i=0;
		//Search for first occurrence of "property" and removes it from array. We are guaranteed a single occurrence of
		//a property by addProperty(String)
		while(!properties[i].equalsIgnoreCase(property)){
			i++;
			if(i==properties.length){
				System.out.println("Property "+property+" was not found.");
				return;
			}
		}
		properties[i] = null;
	}
	
}
