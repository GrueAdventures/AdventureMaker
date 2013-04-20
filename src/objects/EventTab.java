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
		item = new EditableItem();
		items = new Vector<Item>();
	}
		
	@Row(0) @Column(0)
	public EditableItem getItem(){
		return item;
	}
	
	@Row(2) @Column(0)
	public Vector<Item> getItems(){
		return items;
	}
	
	private void clear(){
		item.setId("");
		item.setVisualName("");
		item.setVisualDescription("");
		item.setAuralName("");
		item.setAuralDescription("");
		item.setTakeable(false);
		item.setUseable(false);
	}
	
	//BEGIN ADD, REMOVE, AND EDIT METHODS FOR VECTOR<ITEM> items
	
	@Row(1) @Column(0) @Explanation("Press to add Item to Item list.")
	public void addItem(){
		Item toBeAdded =  new Item(item.getId(), item.getVisualName(), item.getVisualDescription(),
				item.getAuralName(), item.getAuralName(), item.getUseable(), item.getTakeable());
		//Check to make sure world does not already contain the item
		if(!items.contains(toBeAdded)){
			items.add(toBeAdded);
			clear();
		}
		else
			System.out.println("World already contains "+toBeAdded.getId());
	}
	
	@Row(1) @Column(1) @Explanation("Input an Item id to remove it from the list.")
	public void removeItem(String id){
		int i=0;
		if(i==items.size()){
			System.out.println("Item "+id+" was not found.");
			return;
		}
		//Search for first occurrence of "item" and removes it from vector. We are guaranteed a single occurrence of
		//an item by addItem(Item)
		while(!items.get(i).getId().equalsIgnoreCase(id)){
			i++;
			if(i==items.size()){
				System.out.println("Item "+id+" was not found.");
				return;
			}
		}
		items.remove(items.get(i));
	}
	
	@Row(1) @Column(2)	@Explanation("Enter list number of an Item to edit it.")
	public void editItem(int i){
		
		if(i<=0){
			System.out.println("Must enter a positive value!");
			return;
		}
		
		if(i>items.size()){
			System.out.println("Value is out of range!");
			return;
		}
		
		Item it = items.get(i-1);
		items.remove(items.get(i-1));
		item.setId(it.getId());
		item.setVisualName(it.getVisualName());
		item.setVisualDescription(it.getVisualDescription());
		item.setAuralName(it.getAuralName());
		item.setAuralDescription(it.getAuralDescription());
		item.setUseable(it.getUseable());
		item.setTakeable(it.getTakeable());
	}
		//END ADD, REMOVE, AND EDIT METHODS FOR VECTOR<ITEM> items
}