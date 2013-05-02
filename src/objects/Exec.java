package objects;

import util.annotations.*;

@StructurePattern("Bean Pattern")
public class Exec {
	
	private ActionType action;
	private String arg1;
	private String arg2;
	
	public Exec(){
		action = ActionType.append;
		arg1 = "";
		arg2 = "";
	}
	
	@Row(0) @Column(0) @Explanation("Pick the type of action")
	public ActionType getAction(){
		return action;
	}

	@Row(0) @Column(1)
	public void setAction(ActionType aType){
		action = aType;
	}
	
	@Row(1) @Column(0) @Explanation("Do the action on")
	public String getArg1(){
		return arg1;
	}
	
	@Row(1) @Column(1)
	public void setArg1(String a1){
		arg1 = a1;
	}
	
	@Row(2) @Column(0) @Explanation("Set to")
	public String getArg2(){
		return arg2;
	}
	
	@Row(2) @Column(1)
	public void setArg2(String a2){
		arg2 = a2;
	}
//	
//	@Row(2) @Column(0)
//	public void addArg(String ar){
//		//Check to make sure scene does not already contain the item
//		if(!args.){
//			args.);
//		}
//		else
//			return;
//	}
	
//	public void setArgs(Vector<String> arg){
//		args = arg;
//	}

}
