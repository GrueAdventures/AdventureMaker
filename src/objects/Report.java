package objects;

import util.annotations.*;

@StructurePattern("Bean Pattern")
public class Report {
	
	protected String title;
	protected String description;
	protected String backdrop;
	protected String narration;
	protected String sound;
	protected String ambience;
	
	public Report(){
		title = "";
		description = "";
		backdrop = "";
		narration = "";
		sound = "";
		ambience = "";
	}
	
	public Report(String title, String desc, String back, String narr, String sound, String amb){
		this.title = title;
		description = desc;
		backdrop = back;
		narration = narr;
		this.sound = sound;
		ambience = amb;
	}
	
	@Row(0) @Column(0) @Explanation("The title of the report")
	public String getTitle() {
		return title;
	}
	
	@Row(1) @Column(0) @Explanation("Description of what happened which shows on screen")
	public String getDescription(){
		return description;
	}
	
	@Row(2) @Column(0) @Explanation("Relative path to image file for the backdrop of the Scene")
	public String getBackdrop() {
		return backdrop;
	}

	@Row(3) @Column(0) @Explanation("Relative path to sound file which has the Description of what happened in the report")
	public String getNarration(){
		return narration;
	}
	
	@Row(4) @Column(0) @Explanation("Relative path to sound file which will play when the report occurs")
	public String getSound() {
		return sound;
	}
	
	@Row(5) @Column(0) @Explanation("Relative path to sound file which will be played as background on a loop")
	public String getAmbience() {
		return ambience;
	}
	
	public void resetReport(){
		title = "";
		description = "";
		backdrop = "";
		narration = "";
		sound = "";
		ambience = "";
	}
	
}