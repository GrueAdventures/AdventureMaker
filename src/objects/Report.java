package objects;

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
	
	@Row(0) @Column(0)
	public String getTitle() {
		return title;
	}
	
	@Row(0) @Column(1)
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Row(1) @Column(0)
	public String getDescription(){
		return description;
	}
	
	@Row(1) @Column(1)
	public void setDescription(String description){
		this.description = description;
	}
	
	@Row(2) @Column(0)
	public String getBackdrop() {
		return backdrop;
	}
	
	@Row(2) @Column(1)
	public void setBackdrop(String backdrop) {
		this.backdrop = backdrop;
	}

	@Row(3) @Column(0)
	public String getNarration(){
		return narration;
	}
	
	@Row(3) @Column(1)
	public void setNarration(String narration){
		this.narration = narration;
	}
	
	@Row(4) @Column(0)
	public String getSound() {
		return sound;
	}

	@Row(4) @Column(1)
	public void setSound(String sound) {
		this.sound = sound;
	}

	@Row(5) @Column(0)
	public String getAmbience() {
		return ambience;
	}

	@Row(5) @Column(1)
	public void setAmbience(String ambience) {
		this.ambience = ambience;
	}
	
}