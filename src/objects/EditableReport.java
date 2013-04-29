package objects;

import java.awt.TextArea;
import util.annotations.*;

public class EditableReport extends Report{
	
	@Row(0) @Column(1)
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Row(1) @Column(1) @PreferredWidgetClass(TextArea.class)
	public void setDescription(String description){
		this.description = description;
	}

	@Row(2) @Column(1)
	public void setBackdrop(String backdrop) {
		this.backdrop = backdrop;
	}
	
	@Row(3) @Column(1)
	public void setNarration(String narration){
		this.narration = narration;
	}
	
	@Row(4) @Column(1)
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	@Row(5) @Column(1)
	public void setAmbience(String ambience) {
		this.ambience = ambience;
	}
}
