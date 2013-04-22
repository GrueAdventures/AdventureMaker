package objects;

import util.annotations.StructurePattern;

@StructurePattern("Bean Pattern")
public class GameInfoTab {
	
	private String gameName;
	private String startingScene;
	private String auralName;
	private String auralBackdrop;
	
	public GameInfoTab(){
		gameName = "";
		startingScene = "";
		auralName = "";
		auralBackdrop = "";
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getStartingScene() {
		return startingScene;
	}

	public void setStartingScene(String startingScene) {
		this.startingScene = startingScene;
	}

	public String getAuralName() {
		return auralName;
	}

	public void setAuralName(String auralName) {
		this.auralName = auralName;
	}

	public String getAuralBackdrop() {
		return auralBackdrop;
	}

	public void setAuralBackdrop(String auralBackdrop) {
		this.auralBackdrop = auralBackdrop;
	}
	
	
}
