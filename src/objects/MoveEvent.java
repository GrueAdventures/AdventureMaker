package objects;

public class MoveEvent {
	String sceneId;
	String moveDescription;
	
	public MoveEvent(String scene){
		sceneId = scene;
	}
	
	public MoveEvent (String scene, String description){
		sceneId = scene;
		moveDescription = description;
	}
	
	public String getSceneId(){
		return sceneId;
	}
	
	public String getMoveDesc(){
		return moveDescription;
	}
	
	public void setSceneId(String scene){
		sceneId = scene;
	}
	
	public void setMoveDesc(String description){
		moveDescription = description;
	}
}
