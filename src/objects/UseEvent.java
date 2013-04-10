//needs to be cleaned.  This code is spaghetti

package objects;

public class UseEvent {
	private Item used;
	private Item upon;
	private Scene uponScene;
	private Scene adjoinScene;
	private String comment;
	private String reportDescription;
	private String reportNarration;
	
	public UseEvent(String comment, Item using, Item on, String desc, String narr){
		this.comment = comment;
		used = using;
		upon = on;
		reportDescription = desc;
		reportNarration = narr;
	}
	
	public UseEvent(String comment, Item using, Item on){
		this.comment = comment;
		used = using;
		upon = on;
		reportDescription = "";
		reportNarration = "";
	}

	
	public Scene getAdjoinScene() {
		return adjoinScene;
	}

	public void setAdjoinScene(Scene adjoinScene) {
		this.adjoinScene = adjoinScene;
	}

	public Scene getUponScene() {
		return uponScene;
	}

	public void setUponScene(Scene uponScene) {
		this.uponScene = uponScene;
	}

	public Item getUsed() {
		return used;
	}

	public void setUsed(Item used) {
		this.used = used;
	}

	public Item getUpon() {
		return upon;
	}

	public void setUpon(Item upon) {
		this.upon = upon;
	}

	public String getReportDescription() {
		return reportDescription;
	}

	public void setReportDescription(String reportDescription) {
		this.reportDescription = reportDescription;
	}

	public String getReportNarration() {
		return reportNarration;
	}

	public void setReportNarration(String reportNarration) {
		this.reportNarration = reportNarration;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
	
	
}
