package objects;

public class EditableItem extends Item{
	
	public void setId(String id){
		this.id = id;
	}

	public void setVisualName(String visualName) {
		this.visualName = visualName;
	}

	public void setVisualDescription(String visualDescription) {
		this.visualDescription = visualDescription;
	}

	public void setAuralName(String auralName) {
		this.auralName = auralName;
	}

	public void setAuralDescription(String auralDescription) {
		this.auralDescription = auralDescription;
	}

	public void setUseable(boolean useable){
		this.useable = useable;
	}
	
	public void setTakeable(boolean takeable){
		this.takeable = takeable;
	}
	
}
