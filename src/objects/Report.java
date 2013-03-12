package objects;

public class Report {
	
	private String title;
	private String description;
	private String backdrop;
	private String narration;
	private String sound;
	private String ambience;
	
	public Report(String desc, String narr){
		description = desc;
		narration = narr;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String getBackdrop() {
		return backdrop;
	}

	public void setBackdrop(String backdrop) {
		this.backdrop = backdrop;
	}

	public String getNarration(){
		return narration;
	}
	
	public void setNarration(String narration){
		this.narration = narration;
	}
	
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getAmbience() {
		return ambience;
	}

	public void setAmbience(String ambience) {
		this.ambience = ambience;
	}
	

}
