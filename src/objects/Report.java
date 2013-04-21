package objects;

import util.annotations.Explanation;
import util.annotations.Column;
import util.annotations.Row;
import util.annotations.StructurePattern;

@StructurePattern("Bean Pattern")
public class Report {
	
	private String title;
	private String description;
	private String backdrop;
	private String narration;
	private String sound;
	private String ambience;
	
	public Report(){
		title = "";
		description = "";
		backdrop = "";
		narration = "";
		sound = "";
		ambience = "";
	}
	
	@Row(0) @Column(0) @Explanation("The title of the report")
	public String getTitle() {
		return title;
	}
	
	@Row(0) @Column(1)
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Row(1) @Column(0) @Explanation("Description of what happened which shows on screen")
	public String getDescription(){
		return description;
	}
	
	@Row(1) @Column(1)
	public void setDescription(String description){
		this.description = description;
	}
	
	@Row(2) @Column(0) @Explanation("Relative path to image file for the backdrop of the Scene")
	public String getBackdrop() {
		return backdrop;
	}
	
	@Row(2) @Column(1)
	public void setBackdrop(String backdrop) {
		this.backdrop = backdrop;
	}

	@Row(3) @Column(0) @Explanation("Relative path to sound file which has the Description of what happened in the report")
	public String getNarration(){
		return narration;
	}
	
	@Row(3) @Column(1)
	public void setNarration(String narration){
		this.narration = narration;
	}
	
	@Row(4) @Column(0) @Explanation("Relative path to sound file which will play when the report occurs")
	public String getSound() {
		return sound;
	}

	@Row(4) @Column(1)
	public void setSound(String sound) {
		this.sound = sound;
	}

	@Row(5) @Column(0) @Explanation("Relative path to sound file which will be played as background on a loop")
	public String getAmbience() {
		return ambience;
	}

	@Row(5) @Column(1)
	public void setAmbience(String ambience) {
		this.ambience = ambience;
	}
	
}