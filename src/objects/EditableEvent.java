package objects;

import java.util.Vector;
import util.annotations.*;

@StructurePattern("Bean Pattern")
public class EditableEvent extends Event{ 

	public EditableEvent(){
		type = "event";
		id = "";
		execs = new Vector<Exec>();
		report = new EditableReport();
		on = new EditableOn();
	}
	
	@Row(0) @Column(1)
	public void setId(String id) {
		this.id = id;
	}
	
	@Row(2) @Column(0) @Explanation("")
	public Vector<Exec> getExecs() {
		return execs;
	}
	
	@Row(3) @Column(0)
	public void addExec(){
		Exec ex = new Exec();
		//Check to make sure scene does not already contain the item
		if(!execs.contains(ex)){
			execs.add(ex);
		}
		else
			System.out.println(this.id+" already contains "+ex);
	}
	
	@Row(3) @Column(1) @Label("Remove Exec")
	public void removeExec(int i){
		if((i>execs.size())||(i<=0)){
			System.out.println("Please enter a number within the range.");
			return;
		}
		i=i-1;
		execs.remove(execs.get(i));
	}
	
	@Visible(false)
	public void editOn(EditableOn eOn){
		on.setType(eOn.getType());
		on.setArg1(eOn.getArg1());
		on.setArg2(eOn.getArg2());
	}
}
