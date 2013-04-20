package objects;


import util.annotations.Column;
import util.annotations.Explanation;
import util.annotations.Row;
import util.annotations.StructurePattern;

@StructurePattern("Bean Pattern")
public class EditableItem extends Item{
	
	@Row(0) @Column(1) @Explanation("Id of Item")
	public void setId(String id){
		this.id = id;
	}

	@Row(1) @Column(1)
	public void setVisualName(String visualName) {
		this.visualName = visualName;
	}

	@Row(2) @Column(1)
	public void setVisualDescription(String visualDescription) {
		this.visualDescription = visualDescription;
	}

	@Row(3) @Column(1)
	public void setAuralName(String auralName) {
		this.auralName = auralName;
	}

	@Row(4) @Column(1)
	public void setAuralDescription(String auralDescription) {
		this.auralDescription = auralDescription;
	}

	@Row(5) @Column(1)
	public void setUseable(boolean useable){
		this.useable = useable;
	}
	
	@Row(6) @Column(1)
	public void setTakeable(boolean takeable){
		this.takeable = takeable;
	}
//	
//	@Row(7)	@Column(8)
//	public void save(){
//		System.out.println("Added");
//	}
//	
//	@Row(7) @Column(1)
//	public void load(){
//		System.out.println("Loaded");
//	}
	
}
