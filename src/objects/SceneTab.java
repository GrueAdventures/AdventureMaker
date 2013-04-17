package objects;

import java.util.Vector;

//Wrapper class for EditableScene+Vector<Scene>
public class SceneTab {
	private EditableScene scene;
	private Vector<Scene> scenes;
	
	public SceneTab(){
		scene = new EditableScene();
		scenes = new Vector<Scene>();
	}
	
	public EditableScene getScene(){
		return scene;
	}
	
	public Vector<Scene> getScenes(){
		return scenes;
	}
}
