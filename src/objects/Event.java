package objects;

public class Event {
	//TODO: Populate this class
	private String type;
	private String id;
	
	private String[] on;
	private Exec[] exec;
	private Report[] report;
	
	public Event(String id, String[] on, Exec[] exec, Report[] report){
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

	public String[] getOn() {
		return on;
	}

	public void setOn(String[] on) {
		this.on = on;
	}

	public Exec[] getExec() {
		return exec;
	}

	public void setExec(Exec[] exec) {
		this.exec = exec;
	}

	public Report[] getReport() {
		return report;
	}

	public void setReport(Report[] report) {
		this.report = report;
	}
	

}
