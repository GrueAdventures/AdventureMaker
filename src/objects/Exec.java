package objects;

public class Exec {
	private String action;
	//TODO: Replace array with SOMETHING else 
	private String[] args;
	
	public Exec(String act, String[] arg){
		action = act;
		args = arg;
	}
	
	public String getAction(){
		return action;
	}

	public void setAction(String act){
		action = act;
	}

	public String[] getArgs(){
		return args;
	}

	public void setArgs(String[] arg){
		args = arg;
	}

}
