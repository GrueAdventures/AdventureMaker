package objects;

import java.util.Vector;

//Wrapper class for EditableItem+Vector<Item>
public class ItemTab {
	
	private EditableItem item;
	private Vector<Item> items;
	
	public ItemTab(){
		item = new EditableItem();
		items = new Vector<Item>();
	}
	
	public EditableItem getItem(){
		return item;
	}
	
	public Vector<Item> getItems(){
		return items;
	}

}
