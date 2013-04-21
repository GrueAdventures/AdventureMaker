package objects;

import java.util.Iterator;
import java.util.Vector;

import util.annotations.Column;
import util.annotations.Explanation;
import util.annotations.Row;
import util.annotations.Visible;

public class Event extends AbstractObject implements ObjectInterface{
	
//	protected boolean move;
//	protected boolean take;
//	protected boolean use;
//	protected boolean useOn;
	
	protected String type;
	protected String id;
	
	protected EventType eventType;
	
	protected Vector<Exec> execs;
	protected Vector<Report> reports;
	
	
//	//Properties for "move" sub-event
//	protected String scene;
//	protected String moveVisualDescription;
//	protected String moveAuralDescritpion;
//	
//	//Properties for "take" sub-event
//	protected String item;
//	
//	//Properties for "use" sub-event
//	protected String useItem;
//	protected ActionType useOnActionType; //This is an enum. It will be a drop down menu. Handle with a switch:case.
//	protected String useAction; //Switch:case for useOnActionType will decide the value for this String
//	// Make a Vector<set of these properties>
//	
//	//Properties for "use on" sub-event
//	protected String useOnItem1;
//	protected String useOnItem2;
//	protected String useOnScene; //id of Scene action occurs in
//	
	
	public Event(){
//		move = false;
//		take = false;
//		use = false;
//		useOn = false;
		
		type = "event";
		id = "";
		eventType = EventType.SelectOne;
		execs = new Vector<Exec>();
		reports = new Vector<Report>();
	}
	
	public Event(String id){
		type = "event";
		this.id = id;
	}

	@Visible(false)
	public String getType() {
		return type;
	}
	
	@Row(0) @Column(0) @Explanation("Id of Event")
	public String getId() {
		return id;
	}
	@Row(1) @Column(0) @Explanation("Select a type of Event!")
	public EventType getEventType(){
		return eventType;
	}
	
	@Row(2) @Column(0) @Explanation("")
	public Vector<Exec> getExecs() {
		return execs;
	}
	
	@Row(4) @Column(0) @Explanation("")
	public Vector<Report> getReport() {
		return reports;
	}


	
	
	/*
	
	
	
	public Vector<String> getOn() {
		return ons;
	}

	public void setOn(Vector<String> ons) {
		this.ons = ons;
	}

	

	public void setExec(Vector<Exec> execs) {
		this.execs = execs;
	}



	public void setReport(Vector<Report> reports) {
		this.reports = reports;
	}
	
	public void addReport(Report rep){
		//Check to make sure event does not already contain the rep
		if(!reports.contains(rep)){
			reports.add(rep);
		}
		else
			System.out.println("This report is already part of this event");
	}
	
	//Removes report by numeric index
	public void removeReport(int i){
		reports.remove(i);
	}
	
	public void addExec(Exec ex){
		//Check to make sure event does not already contain the ex
		if(!execs.contains(ex)){
			execs.add(ex);
		}
		else
			System.out.println("This Exec is already part of this event");
	}
	
	//Removes report by numeric index
	public void removeExec(int i){
		execs.remove(i);
	}
	
	public void addOn(String condition){
		//Check to make sure event does not already contain the condition
		if(!ons.contains(condition)){
			ons.add(condition);
		}
		else
			System.out.println("This condition is already part of this event");
	}
	
	//Removes condition by numeric index
	public void removeOn(int i){
		ons.remove(i);
	}
	
//	public Item getItemById(String id){
//		Iterator<Item> itemItr = items.iterator();
//		Item temp;
//		while(itemItr.hasNext()){
//			temp = itemItr.next();
//			if(temp.equals(id)) return temp;
//		}
//		System.out.println("returning null");
//		return null;
//	}
//	
//	public boolean hasItem(String id) {
//		//The outside class will have to determine whether or not two objects are equals
//		Iterator<Item> itemItr = items.iterator();
//		while(itemItr.hasNext()){
//			if(itemItr.next().getId().equals(id)) return true;
//		}
//		return false;
//	}
//	
//	public boolean hasItem(Item item){
//		return items.contains(item);
//	}
*/

}
