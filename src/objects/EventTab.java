package objects;

import java.util.Vector;
import util.annotations.*;

//Wrapper class for EditableEvent+Vector<Event>
@StructurePattern("Bean Pattern")
public class EventTab {

	private EditableEvent event;
	private Vector<Event> events;
	
	public EventTab(){
		event = new EditableEvent();
		events = new Vector<Event>();
	}
		
	@Row(0) @Column(0)
	public EditableEvent getEvent(){
		return event;
	}
	
	@Row(2) @Column(0)
	public Vector<Event> getEvents(){
		return events;
	}
	
	private void clear(){
//		event.setId("");
//		event.getOn().resetOn();
//		event.getReport().resetReport();
//		event.getExecs().clear();
		event = new EditableEvent();
	}
	
	//BEGIN ADD, REMOVE, AND EDIT METHODS FOR VECTOR<ITEM> items
	
	@Row(1) @Column(0) @Explanation("Press to add Event to Event list.")
	public void addEvent(){
		Event toBeAdded = new Event(event.getId(), (Vector<Exec>) event.getExecs().clone(),
				(new Report(event.getReport().getTitle(), event.getReport().getDescription(),event.getReport().getBackdrop(),
						event.getReport().getNarration(), event.getReport().getSound(), event.getReport().getAmbience())),
				(new On(event.getOn().getType(), event.getOn().getArg1(), event.getOn().getArg2())));
		//Check to make sure world does not already contain the item
		if(!events.contains(toBeAdded)){
			events.add(toBeAdded);
			clear();
		}
		else
			System.out.println("World already contains "+toBeAdded.getId());
	}
	
	@Row(1) @Column(1) @Explanation("Input an Event id to remove it from the list.") @Label("Remove Event") 
	public void removeEvent(int i){
		if((i>events.size())||(i<=0)){
			System.out.println("Please enter a number within the range.");
			return;
		}
		i=i-1;
		events.remove(events.get(i));
	}
	
	@Row(1) @Column(2)	@Explanation("Enter list number of an Event to edit it.") @Label("Edit Event")
	public void editEvent(int i){
		
		if(i<=0){
			System.out.println("Must enter a positive value!");
			return;
		}
		
		if(i>events.size()){
			System.out.println("Value is out of range!");
			return;
		}
		
		Event ev = events.get(i-1);
		events.remove(events.get(i-1));
		event.setId(ev.getId());
		event.editOn(ev.getOn().getType(), ev.getOn().getArg1(), ev.getOn().getArg2());
		event.editReport(ev.getReport().getTitle(), ev.getReport().getDescription(), ev.getReport().getBackdrop(), ev.getReport().getNarration(),
				ev.getReport().getSound(), ev.getReport().getAmbience());
		event.copyExecs(ev.getExecs());
		
	}
		//END ADD, REMOVE, AND EDIT METHODS FOR VECTOR<ITEM> items
}