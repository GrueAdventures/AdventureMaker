package objects;

import java.util.Iterator;
import java.util.Vector;

public class Event extends AbstractObject implements ObjectInterface{
	
	protected String type;
	protected String id;
	
	public Event(){
		type = "event";
		id = "";
	}
	
	public Event(String id){
		type = "event";
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}


	
	
	/*
	
	
	
	public Vector<String> getOn() {
		return ons;
	}

	public void setOn(Vector<String> ons) {
		this.ons = ons;
	}

	public Vector<Exec> getExec() {
		return execs;
	}

	public void setExec(Vector<Exec> execs) {
		this.execs = execs;
	}

	public Vector<Report> getReport() {
		return reports;
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
