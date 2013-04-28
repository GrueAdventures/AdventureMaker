package objects;

import java.util.Vector;

import util.annotations.Column;
import util.annotations.Explanation;
import util.annotations.Row;
import util.annotations.StructurePattern;

@StructurePattern("Bean Pattern")
public class EditableEvent extends Event{ 

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
}
