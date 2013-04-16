package objects;

import java.util.Vector;

import util.annotations.Column;
import util.annotations.Row;
import util.annotations.Visible;

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
//	public Scene(String id){
//		type = "scene";
//		this.id = id;
//		visualName = "";
//		visualDescription = "";
//		auralName = "";
//		auralDescription = "";
//		auralBackdrop = "";
//		this.controller = null;
//		items = new Vector<Item>();
//		adjoins = new Vector<Scene>();	
//	}
//	
//	public Scene(String id, String vName, String vDescription, String vBackdrop,
//			String aName, String aDescription, String aBackdrop, Ctrl controller){
//		type = "scene";
//		this.id = id;
//		visualName = vName;
//		visualDescription = vDescription;
//		visualBackdrop = vBackdrop;
//		auralName = aName;
//		auralDescription = aDescription;
//		auralBackdrop = aBackdrop;
//		this.controller = controller;
//		items = new Vector<Item>();
//		adjoins = new Vector<Scene>();
//		
//	}
	
	//Constructor without Ctrl variable
//	public Scene(String id, String vName, String vDescription, String vBackdrop,
//			String aName, String aDescription, String aBackdrop){
//		type = "scene";
//		this.id = id;
//		visualName = vName;
//		visualDescription = vDescription;
//		visualBackdrop = vBackdrop;
//		auralName = aName;
//		auralDescription = aDescription;
//		auralBackdrop = aBackdrop;
//		controller = null;
//		items = new Vector<Item>();
//		adjoins = new Vector<Scene>();
//	}
	
	@Visible(false)
	public String getType() {
		return type;
	}

	@Row(0) @Column(0)
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
	public String getVisualBackdrop() {
		return visualBackdrop;
	}

	@Row(4) @Column(0)
	public String getAuralName() {
		return auralName;
	}

	@Row(5) @Column(0)
	public String getAuralDescription() {
		return auralDescription;
	}

	@Row(6) @Column(0)
	public String getAuralBackdrop() {
		return auralBackdrop;
	}

	@Row(7) @Column(0)
	public Ctrl getController() {
		return controller;
	}

	@Row(8) @Column(0)
	public Vector<String> getItems() {
		return items;
	}

	@Row(10) @Column(0)
	public Vector<String> getAdjoins() {
		return adjoins;
	}	

}
