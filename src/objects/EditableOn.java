package objects;

import util.annotations.Column;
import util.annotations.Row;

public class EditableOn extends On {
	
	public EditableOn(){
		type = EventType.SelectOne;
		arg1 = "";
		arg2 = "";
	}

	@Row(0) @Column(1)
	public void setType(EventType eType){
		type = eType;
	}

	@Row(1) @Column(1)
	public void setArg1(String a1){
		arg1 = a1;
	}
	
	@Row(2) @Column(1)
	public void setArg2(String a2){
		arg2 = a2;
	}
}
