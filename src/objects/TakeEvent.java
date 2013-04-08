package objects;

public class TakeEvent {
	String itemId;
	
	public TakeEvent(String takeItem){
		itemId = takeItem;		
	}
	
	public String getItem(){
		return itemId;
	}
}
