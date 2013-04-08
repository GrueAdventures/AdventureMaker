package objects;

import java.io.PrintWriter;
import java.util.Iterator;

public class Translator {
	
	public void initialize(PrintWriter writer){
		
		writer.println("    {\r\n" + 
				"        \"items\": [],\r\n" + 
				"        \"type\": \"player\",\r\n" + 
				"        \"id\": \"player\",\r\n" + 
				"        \"scene\": \"boot\"\r\n" + 
				"    }, ");
		writer.println("{\r\n" + 
				"        \"items\": [],\r\n" + 
				"        \"controller\": \"dim/controllers/meta/boot\",\r\n" + 
				"        \"adjoins\": [],\r\n" + 
				"        \"visual\": {\r\n" + 
				"            \"name\": \"Test World\"\r\n" +  //Need to add name of the game
				"        },\r\n" + 
				"        \"aural\": {\r\n" + 
				"            \"name\": \"\",\r\n" + 
				"            \"backdrop\": \"\"\r\n" + 
				"        },\r\n" + 
				"        \"type\": \"scene\",\r\n" + 
				"        \"id\": \"boot\"\r\n" + 
				"    }, ");
		writer.println("    {\r\n" + 
				"        \"scene\": \"testRoom\",\r\n" + //Needs to reflect gameInfo
				"        \"channels\": {\r\n" + 
				"            \"sound\": {\r\n" + 
				"                \"type\": \"aural\",\r\n" + 
				"                \"gain\": 0.7\r\n" + 
				"            },\r\n" + 
				"            \"description\": {\r\n" + 
				"                \"type\": \"visual\"\r\n" + 
				"            },\r\n" + 
				"            \"title\": {\r\n" + 
				"                \"type\": \"visual\"\r\n" + 
				"            },\r\n" + 
				"            \"narration\": {\r\n" + 
				"                \"type\": \"aural\",\r\n" + 
				"                \"gain\": 0.9\r\n" + 
				"            },\r\n" + 
				"            \"ambience\": {\r\n" + 
				"                \"swapstop\": true,\r\n" + 
				"                \"crossfade\": true,\r\n" + 
				"                \"type\": \"aural\",\r\n" + 
				"                \"gain\": 0.15,\r\n" + 
				"                \"loop\": true\r\n" + 
				"            },\r\n" + 
				"            \"backdrop\": {\r\n" + 
				"                \"type\": \"visual\"\r\n" + 
				"            }\r\n" + 
				"        }, " +
				"        \"controller\": \"dim/controllers/explore/explore\",\r\n" + 
				"        \"type\": \"default\",\r\n" + 
				"        \"id\": \"default\",\r\n" + 
				"        \"objectReport\": {\r\n" + 
				"            \"user.activate\": [\r\n" + 
				"                {\r\n" + 
				"                    \"visual.name\": \"title\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"user.select\": [\r\n" + 
				"                {\r\n" + 
				"                    \"aural.name\": \"narration\",\r\n" + 
				"                    \"aural.sound\": \"sound\",\r\n" + 
				"                    \"visual.name\": \"title\"\r\n" + 
				"                }\r\n" + 
				"            ]\r\n" + 
				"        }\r\n" + 
				"    }," +
		        "controller\": \"dim/controllers/explore/explore\",\r\n" + 
				"        \"type\": \"default\",\r\n" + 
				"        \"id\": \"default\",\r\n" + 
				"        \"objectReport\": {\r\n" + 
				"            \"user.activate\": [\r\n" + 
				"                {\r\n" + 
				"                    \"visual.name\": \"title\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"user.select\": [\r\n" + 
				"                {\r\n" + 
				"                    \"aural.name\": \"narration\",\r\n" + 
				"                    \"aural.sound\": \"sound\",\r\n" + 
				"                    \"visual.name\": \"title\"\r\n" + 
				"                }\r\n" + 
				"            ]\r\n" + 
				"        }\r\n" + 
				"    }, ");
	}

	public void sceneTranslate(PrintWriter writer, Scene scene){
		writer.printf("    {\r\n" + 
				"        \"items\": [");
		
		Iterator<Item> itemsItr = scene.getItems().iterator();
		if (itemsItr.hasNext()) writer.printf("\n");
		while(itemsItr.hasNext()){
			writer.printf("        "+itemsItr.next().getId());
			if(itemsItr.hasNext()) writer.printf(",");
			writer.printf("\n");	
		}
		
		writer.printf("        ],\n");
		
		writer.printf("        \"adjoins\": [");
		
		Iterator<Scene> adjoinItr = scene.getAdjoins().iterator();
		if (adjoinItr.hasNext())  writer.printf("\n");
		while (adjoinItr.hasNext()){
			writer.printf("        "+adjoinItr.next().getId());
			if(adjoinItr.hasNext()) writer.printf(",");
			writer.printf("\n");
		}
		writer.printf("],\n");
		
		writer.println("        \"visual\": {\r\n" + 
				"            \"name\": \""+scene.getVisualName()+"\",\r\n" + 
				"            \"description\": \""+scene.getVisualDescription()+"\\nThere is a lock on the door.\"\r\n" + 
				"        },\r\n" + 
				"        \"aural\": {\r\n" + 
				"            \"name\": \""+scene.getAuralName()+"\",\r\n" + 
				"            \"backdrop\": \""+scene.getAuralBackdrop()+"\",\r\n" + 
				"            \"description\": \""+scene.getAuralDescription()+"\"\r\n" + 
				"        },\r\n" + 
				"        \"type\": \""+scene.getType()+"\",\r\n" + 
				"        \"id\": \""+scene.getId()+"\"\r\n" + 
				"    }, ");
	}

}
