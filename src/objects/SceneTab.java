package objects;

import java.util.Vector;

import util.annotations.Column;
import util.annotations.Row;
import util.annotations.StructurePattern;

//Wrapper class for EditableScene+Vector<Scene>
@StructurePattern("Bean Pattern")
public class SceneTab {
	private EditableScene scene;
	private Vector<Scene> scenes;
	
	public SceneTab(){
		scene = new EditableScene();
		scenes = new Vector<Scene>();
	}
	
	@Row(0) @Column(0)
	public EditableScene getScene(){
		return scene;
	}
	
	@Row(2) @Column(0)
	public Vector<Scene> getScenes(){
		return scenes;
	}
	
	@Row(1) @Column(0)
	public void addScene(){
		Scene toBeAdded = new Scene(scene.getId(), scene.getVisualName(), scene.getVisualDescription(), scene.getVisualBackdrop(),
				scene.getAuralName(), scene.getAuralDescription(), scene.getAuralBackdrop(), scene.getItems(), scene.getAdjoins(),
				scene.getController());
		//Check to make sure world does not already contain the scene
		if(!scenes.contains(toBeAdded)){
			scenes.add(toBeAdded);
		}
		else
			System.out.println("World already contains "+toBeAdded.getId());
	}
	
	@Row(1) @Column(1)
	public void removeScene(String id){
		int i=0;
		if(i==scenes.size()){
			System.out.println("Scene "+id+" was not found.");
			return;
		}
		//Search for first occurrence of "scene" and removes it from vector. We are guaranteed a single occurrence of
		//a scene by addScene(Scene)
		while(!scenes.get(i).getId().equalsIgnoreCase(id)){
			i++;
			if(i==scenes.size()){
				System.out.println("Scene "+id+" was not found.");
				return;
			}
		}
		scenes.remove(scenes.get(i));
	}
	
	@Row(1) @Column(2)
	public void editScene(int i){
		
		if(i<=0){
			System.out.println("Must enter a positive value!");
			return;
		}
		
		if(i>scenes.size()){
			System.out.println("Value is out of range!");
			return;
		}
		
		Scene sc = scenes.get(i-1);
		scenes.remove(scenes.get(i-1));
		scene.setId(sc.getId());
		scene.setVisualName(sc.getVisualName());
		scene.setVisualDescription(sc.getVisualDescription());
		scene.setVisualBackdrop(sc.getVisualBackdrop());
		scene.setAuralName(sc.getAuralName());
		scene.setAuralDescription(sc.getAuralDescription());
		scene.setAuralBackdrop(sc.getAuralBackdrop());
		
		scene.getItems().clear();
		for(int k=0; k<sc.getItems().size(); k++){
			scene.getItems().add(sc.getItems().get(k));
		}
		
		scene.getAdjoins().clear();
		for(int k=0; k<sc.getAdjoins().size(); k++){
			scene.getAdjoins().add(sc.getAdjoins().get(k));
		}
		
	}
}
