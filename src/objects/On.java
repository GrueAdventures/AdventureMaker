package objects;

import util.annotations.Column;
import util.annotations.Explanation;
import util.annotations.Row;
import util.annotations.StructurePattern;

@StructurePattern("Bean Pattern")
public class On {
	
	private EventType type;
	private String arg1;
	private String arg2;
	
	public On(){
		type = EventType.SelectOne;
		arg1 = "";
		arg2 = "";
	}

	@Row(0) @Column(0) @Explanation("Event type")
	public EventType getType(){
		return type;
	}

	@Row(0) @Column(1)
	public void setType(EventType eType){
		type = eType;
	}

	@Row(1) @Column(0) @Explanation("Scene or Item to preform event on")
	public String getArg1(){
		return arg1;
	}
	
	@Row(1) @Column(1)
	public void setArg1(String a1){
		arg1 = a1;
	}
	
	@Row(2) @Column(0) @Explanation("Secondary Item to use Item on")
	public String getArg2(){
		return arg2;
	}
	
	@Row(2) @Column(1)
	public void setArg2(String a2){
		arg2 = a2;
	}
	
}
