package objects;

public abstract class AbstractObject {
	String id;
	String type;
	
	public String getId(){
		return id;
	}
	
	public boolean equals(Object o){
		return (getId().equals(((AbstractObject) o).getId()));
	}

	public boolean equals(String o){
		return getId().equals(o);
	}
}
