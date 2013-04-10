package objects;

public class TakeEvent {
	Item item;
	
	public TakeEvent(Item takeItem){
		item = takeItem;		
	}
	
	public Item getItem(){
		return item;
	}
}
