package objects;

import java.util.Iterator;
import java.util.Vector;

import util.annotations.Column;
import util.annotations.Explanation;
import util.annotations.Row;
import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Bean Pattern")
public class Event extends AbstractObject implements ObjectInterface{

	protected String type;
	protected String id;
	
	protected Vector<Exec> execs;
	protected Report report;
	protected On on;
	
	public Event(){
		type = "event";
		id = "";
		execs = new Vector<Exec>();
		report = new Report();
		on = new On();
	}
	
	public Event(String id, Vector<Exec> exs, Report rep, On on){
		type = "event";
		this.id = id;
		execs = exs;
		report = rep;
		this.on = on;
	}

	@Visible(false)
	public String getType() {
		return type;
	}
	
	@Row(0) @Column(0) @Explanation("Id of Event")
	public String getId() {
		return id;
	}

	@Row(1) @Column(0) @Explanation("")
	public On getOn(){
		return on;
	}
	
	@Visible(false)
	public Vector<Exec> getExecs() {
		return execs;
	}
	
	@Row(4) @Column(0) @Explanation("")
	public Report getReport() {
		return report;
	}
	
/*
	
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
