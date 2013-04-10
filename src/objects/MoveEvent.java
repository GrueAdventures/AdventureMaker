package objects;

public class MoveEvent {
	Scene scene;
	String visMoveDescription;
	String aurMoveDescription;
	
	public MoveEvent(Scene scene){
		this.scene = scene;
	}
	
	public MoveEvent (Scene scene, String visDescription, String aurDescription){
		this.scene = scene;
		visMoveDescription = visDescription;
		aurMoveDescription = aurDescription;
	}
	
	public Scene getScene(){
		return scene;
	}
	
	public String getVisMoveDesc(){
		return visMoveDescription;
	}
	
	public String getAurMoveDesc(){
		return aurMoveDescription;
	}
	
	public void setScene(Scene scene){
		this.scene = scene;
	}
	
	public void setVisMoveDesc(String description){
		visMoveDescription = description;
	}
	
	public void setAurMoveDesc(String description){
		aurMoveDescription = description;
	}
}
