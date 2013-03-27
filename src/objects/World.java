package objects;

import java.util.Vector;

public class World {
	private Vector<ObjectInterface> world;
	
	public World(){
		this.world = new Vector<ObjectInterface>();
	}
	
	public void addObject(ObjectInterface object){
		if(!world.contains(object)){
			world.add(object);
		}
		else
			System.out.println("Object is already in the world");
	}
	
	//Implement this
	public void removeObject(ObjectInterface object){
		
	}
	

}
