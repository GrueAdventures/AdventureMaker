package objects;

import java.util.Vector;

import util.annotations.Explanation;
import util.annotations.Column;
import util.annotations.Row;
import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Bean Pattern")
public class Scene implements ObjectInterface{
	
	protected String type;
	protected String id;
	
	protected String visualName;
	protected String visualDescription;
	protected String visualBackdrop;
	
	protected String auralName;
	protected String auralDescription;
	protected String auralBackdrop;
	
	protected Ctrl controller;
	
	protected Vector<String> items;
	protected Vector<String> adjoins;
	
	public Scene(){
		type = "scene";
		this.id = "";
		visualName = "";
		visualDescription = "";
		visualBackdrop = "";
		auralName = "";
		auralDescription = "";
		auralBackdrop = "";
		this.controller = null;
		items = new Vector<String>();
		adjoins = new Vector<String>();	
	}
	
	//Constructor with Ctrl variable
	public Scene(String id){
		type = "scene";
		this.id = id;
		visualName = "";
		visualDescription = "";
		auralName = "";
		auralDescription = "";
		auralBackdrop = "";
		this.controller = null;
		items = new Vector<String>();
		adjoins = new Vector<String>();	
	}
		
	public Scene(String id, String vName, String vDescription, String vBackdrop,
			String aName, String aDescription, String aBackdrop, Vector<String> items, Vector<String> adj, Ctrl controller){
		type = "scene";
		this.id = id;
		visualName = vName;
		visualDescription = vDescription;
		visualBackdrop = vBackdrop;
		auralName = aName;
		auralDescription = aDescription;
		auralBackdrop = aBackdrop;
		this.controller = controller;
		this.items = items;
		adjoins = adj;		
	}
	
	@Visible(false)
	public String getType() {
		return type;
	}

	@Row(0) @Column(0) @Explanation("Id of Scene")
	public String getId() {
		return id;
	}

	@Row(1) @Column(0) @Explanation("Name of Scene which shows on screen")
	public String getVisualName() {
		return visualName;
	}

	@Row(2) @Column(0) @Explanation("Description of Scene which shows on screen")
	public String getVisualDescription() {
		return visualDescription;
	}

	@Row(3) @Column(0) @Explanation("Relative path to image file for the backdrop of the Scene")
	public String getVisualBackdrop() {
		return visualBackdrop;
	}

	@Row(4) @Column(0) @Explanation("Relative path to sound file which has the Name of Scene")
	public String getAuralName() {
		return auralName;
	}

	@Row(5) @Column(0) @Explanation("Relative path to sound file which has the Description of Scene")
	public String getAuralDescription() {
		return auralDescription;
	}

	@Row(6) @Column(0) @Explanation("Relative path to sound file which will be played as background on a loop")
	public String getAuralBackdrop() {
		return auralBackdrop;
	}

	@Visible(false) @Row(7) @Column(0) @Explanation("Coming soon!")
	public Ctrl getController() {
		return controller;
	}

	@Visible(false)
	public Vector<String> getItems() {
		return items;
	}

	@Visible(false)
	public Vector<String> getAdjoins() {
		return adjoins;
	}	

}
