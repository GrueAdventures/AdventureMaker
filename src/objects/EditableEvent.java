package objects;

import util.annotations.Column;
import util.annotations.Row;

public class EditableEvent extends Event{ 

	@Row(0) @Column(1)
	public void setId(String id) {
		this.id = id;
	}
	
	@Row(1) @Column(1)
	public void setEventType(EventType eType){
		eventType = eType;
		checkType();
	}

	//Changes visibility of fields in GUI : DOES NOT WORK. VISIBILITY CANNOT BE CHANGED DURING RUNTIME.
	private void checkType(){
		switch(eventType){
			case SelectOne:
				move = false;
				take = false;
				use = false;
				useOn = false;
				break;
				
			case Move:
				move = true;
				take = false;
				use = false;
				useOn = false;
				break;
				
			case Take:
				move = false;
				take = true;
				use = false;
				useOn = false;
				break;
				
			case Use:
				move = false;
				take = false;
				use = true;
				useOn = false;
				break;
				
			case UseOn:
				move = false;
				take = false;
				use = false;
				useOn = true;
				break;
				
			default:
				move = false;
				take = false;
				use = false;
				useOn = false;
				break;
		}
	}
}
