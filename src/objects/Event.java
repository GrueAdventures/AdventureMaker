package objects;

import java.util.Vector;

public class Event implements ObjectInterface{
	//TODO: Populate this class
	private String type;
	private String id;
	
	private Vector<String> on;
	private Vector<Exec> exec;
	private Vector<Report> report;
	
	public Event(String id, Vector<String> on, Vector<Exec> exec, Vector<Report> report){
		type = "event";
		this.id = id;
		this.on = on;
		this.exec = exec;
		this.report = report;
	}

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Vector<String> getOn() {
		return on;
	}

	public void setOn(Vector<String> on) {
		this.on = on;
	}

	public Vector<Exec> getExec() {
		return exec;
	}

	public void setExec(Vector<Exec> exec) {
		this.exec = exec;
	}

	public Vector<Report> getReport() {
		return report;
	}

	public void setReport(Vector<Report> report) {
		this.report = report;
	}
	

}
