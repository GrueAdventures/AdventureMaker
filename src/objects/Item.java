package objects;

import util.annotations.Explanation;
import util.annotations.Column;
import util.annotations.Row;
import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Bean Pattern")
public class Item extends AbstractObject implements ObjectInterface{
	
	protected String type;
	protected String id;
	
	protected String visualName;
	protected String visualDescription;
	
	protected String auralName;
	protected String auralDescription;
	
	protected boolean useable;
	protected boolean takeable;
	
	public Item(){
		type = "item";
		id = "";
		visualName = "";
		visualDescription = "";
		auralName = "";
		auralDescription = "";
		useable = false;
		takeable = false;		
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

	//Constructor for creating an Item with only an ID.
	public Item(String id){
		type = "item";
		this.id = id;
			visualName = "";
		visualDescription = "";
		auralName = "";
		auralDescription = "";
		useable = false;
		takeable = false;
			
	}
	
	@Visible(false)
	public String getType() {
		return type;
	}
		
	@Row(0)  @Column(0) @Explanation("Id of Item")
	public String getId() {
		return id;
	}
	
	@Row(1) @Column(0) @Explanation("Name of Item which shows on screen")
	public String getVisualName() {
		return visualName;
	}

	@Row(2) @Column(0) @Explanation("Description of Item which shows on screen")
	public String getVisualDescription() {
		return visualDescription;
	}

	@Row(3) @Column(0) @Explanation("Relative path to sound file which has the Name of Item")
	public String getAuralName() {
		return auralName;
	}

	@Row(4) @Column(0) @Explanation("Relative path to sound file which has the Description of Item")
	public String getAuralDescription() {
		return auralDescription;
	}

	@Row(5) @Column(0) @Explanation("Select to give Item the \"Useable\" property")
	public boolean getUseable(){
		return useable;
	}
	
	@Row(6) @Column(0) @Explanation("Select to give Item the \"Takeable\" property")
	public boolean getTakeable(){
		return takeable;
	}
}
