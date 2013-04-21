package objects;

import java.util.Vector;
import util.annotations.Explanation;
import util.annotations.Column;
import util.annotations.Row;
import util.annotations.StructurePattern;

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
	
	@Row(1) @Column(1) @Explanation("Input an Event id to remove it from the list.")
	public void removeEvent(String id){
		int i=0;
		if(i==events.size()){
			System.out.println("Event "+id+" was not found.");
			return;
		}
		//Search for first occurrence of "item" and removes it from vector. We are guaranteed a single occurrence of
		//an item by addItem(Item)
		while(!events.get(i).getId().equalsIgnoreCase(id)){
			i++;
			if(i==events.size()){
				System.out.println("Event "+id+" was not found.");
				return;
			}
		}
		events.remove(events.get(i));
	}
	
	@Row(1) @Column(2)	@Explanation("Enter list number of an Event to edit it.")
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
	}
		//END ADD, REMOVE, AND EDIT METHODS FOR VECTOR<ITEM> items
}