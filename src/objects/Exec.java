package objects;

import java.util.Vector;

public class Exec {
	
	private String action;
	private Vector<String> args;
	
	public Exec(String act, Vector<String> arg){
		action = act;
		args = arg;
	}
	
	public String getAction(){
		return action;
	}

	public void setAction(String act){
		action = act;
	}

	public Vector<String> getArgs(){
		return args;
	}

	public void setArgs(Vector<String> arg){
		args = arg;
	}

}
