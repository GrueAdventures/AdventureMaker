package objects;

import util.annotations.*;

@StructurePattern("Bean Pattern")
public class On {
	
	protected EventType type;
	protected String arg1;
	protected String arg2;
	
	public On(){
		type = EventType.SelectOne;
		arg1 = "";
		arg2 = "";
	}
	
	public On(EventType eType, String a1, String a2){
		type = eType;
		arg1 = a1;
		arg2 = a2;
	}

	@Row(0) @Column(0) @Explanation("Event type")
	public EventType getType(){
		return type;
	}
	
//	@Visible(false)
	public void setType(EventType eType){
		type = eType;
	}

	@Row(1) @Column(0) @Explanation("Scene or Item to perform event on")
	public String getArg1(){
		return arg1;
	}
	
//	@Visible(false)
	public void setArg1(String a1){
		arg1 = a1;
	}
	
	@Row(2) @Column(0) @Explanation("Secondary Item to use Item on")
	public String getArg2(){
		return arg2;
	}
	
//	@Visible(false)
	public void setArg2(String a2){
		arg2 = a2;
	}
	
	public void resetOn(){
		type = EventType.SelectOne;
		arg1 = "";
		arg2 = "";
	}
	
}
