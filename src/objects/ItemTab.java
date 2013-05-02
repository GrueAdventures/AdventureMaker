package objects;

import java.util.Vector;
import util.annotations.*;

//Wrapper class for EditableItem+Vector<Item>
@StructurePattern("Bean Pattern")
public class ItemTab {
	
	private EditableItem item;
	private Vector<Item> items;
	
	public ItemTab(){
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
	
	@Row(1) @Column(1) @Explanation("Input an Item id to remove it from the list.")@Label("Remove Item")
	public void removeItem(int i){
		if((i>items.size())||(i<=0)){
			System.out.println("Please enter a number within the range.");
			return;
		}
		i=i-1;
		items.remove(items.get(i));
	}
	
	@Row(1) @Column(2)	@Explanation("Enter list number of an Item to edit it.")@Label("Edit Item")
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
