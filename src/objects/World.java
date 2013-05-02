package objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Iterator;

import util.annotations.Column;
import util.annotations.PropertyNames;
import util.annotations.Row;
import util.annotations.StructurePattern;

@StructurePattern("Bean Pattern")
@PropertyNames({"item", "scene", "event", "gameInfo"})
public class World {
	private ItemTab itemTab;
	private SceneTab sceneTab;
	private EventTab eventTab;
	private GameInfoTab gameInfoTab;
//	private Vector<Ctrl> ctrls;
	
	private Translator translator = new Translator();
	
	public World(){
		itemTab = new ItemTab();
		sceneTab = new SceneTab();
		eventTab = new EventTab();
		gameInfoTab = new GameInfoTab();
//		ctrls = new Vector<Ctrl>();
	}
	
	@Row(0) @Column(0)
	public ItemTab getItem(){
		return itemTab;
	}
	
	@Row(0) @Column(1)
	public SceneTab getScene(){
		return sceneTab;
	}
	
	@Row(0) @Column(2)
	public EventTab getEvent(){
		return eventTab;
	}

	@Row(0) @Column(3)
	public GameInfoTab getGameInfo(){
		return gameInfoTab;
	}
	
	public void translate() throws FileNotFoundException{
		File file = new File("world.json");
		PrintWriter writer = new PrintWriter(file);

		translator.initialize(writer, gameInfoTab);
		Iterator<Item> itemItr = itemTab.getItems().iterator();
		if(itemItr.hasNext()){
			writer.printf(",\r\n");
		}
		while(itemItr.hasNext()){
			translator.itemTranslate(writer, itemItr.next());
			if(itemItr.hasNext()){
				writer.printf(",\r\n");
			}
		}
		
		Iterator<Scene> sceneItr = sceneTab.getScenes().iterator();
		if(sceneItr.hasNext()){
			writer.printf(",\r\n");
		}
		while(sceneItr.hasNext()){
			translator.sceneTranslate(writer, sceneItr.next());
			if(sceneItr.hasNext()){
				writer.printf(",\r\n");
			}
		}
		
		Iterator<Event> eventItr = eventTab.getEvents().iterator();
		if(eventItr.hasNext()){
			writer.printf(",\r\n");
		}
		while(eventItr.hasNext()){
			translator.eventTranslate(writer, eventItr.next());
			if(eventItr.hasNext()){
				writer.printf(",\r\n");
			}
		}
		
		writer.printf("\r\n]");
		writer.close();
	}
	
}