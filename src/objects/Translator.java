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
				"    },\r\n" +
				"    {\r\n" + 
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
				"    },\r\n" +
				"    {\r\n" + 
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
				"        },\r\n" +
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
				"    },\r\n" +
				"    {\r\n" + 
				"        \"prompt\": [\r\n" + 
				"            {\r\n" + 
				"                \"ambience\": \"sound://music/music1\",\r\n" + 
				"                \"narration\": \"sound://speech/menu\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"ctrl\",\r\n" + 
				"        \"id\": \"boot\",\r\n" + 
				"        \"options\": [\r\n" + 
				"            {\r\n" + 
				"                \"visual\": {\r\n" + 
				"                    \"name\": \"Load Game\"\r\n" + 
				"                },\r\n" + 
				"                \"aural\": {\r\n" + 
				"                    \"name\": \"sound://speech/loadGame\"\r\n" + 
				"                },\r\n" + 
				"                \"id\": \"load\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"visual\": {\r\n" + 
				"                    \"name\": \"New Game\"\r\n" + 
				"                },\r\n" + 
				"                \"aural\": {\r\n" + 
				"                    \"name\": \"sound://speech/newGame\"\r\n" + 
				"                },\r\n" + 
				"                \"id\": \"new\"\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"prompt\": [\r\n" + 
				"            {\r\n" + 
				"                \"description\": \"Select a save slot to load.\",\r\n" + 
				"                \"narration\": \"sound://speech/selectLoad\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"ctrl\",\r\n" + 
				"        \"id\": \"load\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"prompt\": [\r\n" + 
				"            {\r\n" + 
				"                \"description\": \"Choose a slot to save your game.\",\r\n" + 
				"                \"narration\": \"sound://speech/saveSlot\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"ctrl\",\r\n" + 
				"        \"id\": \"save\",\r\n" + 
				"        \"success\": [\r\n" + 
				"            {\r\n" + 
				"                \"description\": \"Your game was successfully saved.\",\r\n" + 
				"                \"narration\": \"sound://speech/saveSuccessful\"\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"type\": \"ctrl\",\r\n" + 
				"        \"id\": \"slots\",\r\n" + 
				"        \"options\": [\r\n" + 
				"            {\r\n" + 
				"                \"visual\": {\r\n" + 
				"                    \"name\": \"Slot 1\"\r\n" + 
				"                },\r\n" + 
				"                \"aural\": {\r\n" + 
				"                    \"name\": \"sound://speech/slot1\"\r\n" + 
				"                },\r\n" + 
				"                \"id\": \"slot1\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"visual\": {\r\n" + 
				"                    \"name\": \"Slot 2\"\r\n" + 
				"                },\r\n" + 
				"                \"aural\": {\r\n" + 
				"                    \"name\": \"sound://speech/slot2\"\r\n" + 
				"                },\r\n" + 
				"                \"id\": \"slot2\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"visual\": {\r\n" + 
				"                    \"name\": \"Slot 3\"\r\n" + 
				"                },\r\n" + 
				"                \"aural\": {\r\n" + 
				"                    \"name\": \"sound://speech/slot3\"\r\n" + 
				"                },\r\n" + 
				"                \"id\": \"slot3\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"visual\": {\r\n" + 
				"                    \"name\": \"Slot 4\"\r\n" + 
				"                },\r\n" + 
				"                \"aural\": {\r\n" + 
				"                    \"name\": \"sound://speech/slot4\"\r\n" + 
				"                },\r\n" + 
				"                \"id\": \"slot4\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"visual\": {\r\n" + 
				"                    \"name\": \"Slot 5\"\r\n" + 
				"                },\r\n" + 
				"                \"aural\": {\r\n" + 
				"                    \"name\": \"sound://speech/slot5\"\r\n" + 
				"                },\r\n" + 
				"                \"id\": \"slot5\"\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"report\": [\r\n" + 
				"            {\r\n" + 
				"                \"narration\": \"sound://speech/gameOver\",\r\n" + 
				"                \"title\": \"Game Over\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"ctrl\",\r\n" + 
				"        \"id\": \"lose\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"report\": [\r\n" + 
				"            {\r\n" + 
				"                \"title\": \"You Win\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"ctrl\",\r\n" + 
				"        \"id\": \"win\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"prompt\": [\r\n" + 
				"            {\r\n" + 
				"                \"narration\": \"sound://speech/menu\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"ctrl\",\r\n" + 
				"        \"id\": \"explore\",\r\n" + 
				"        \"options\": [\r\n" + 
				"            {\r\n" + 
				"                \"visual\": {\r\n" + 
				"                    \"name\": \"Examine\"\r\n" + 
				"                },\r\n" + 
				"                \"aural\": {\r\n" + 
				"                    \"name\": \"sound://speech/examine\"\r\n" + 
				"                },\r\n" + 
				"                \"id\": \"dim/controllers/explore/examine\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"visual\": {\r\n" + 
				"                    \"name\": \"Move\"\r\n" + 
				"                },\r\n" + 
				"                \"aural\": {\r\n" + 
				"                    \"name\": \"sound://speech/move\"\r\n" + 
				"                },\r\n" + 
				"                \"id\": \"dim/controllers/explore/move\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"visual\": {\r\n" + 
				"                    \"name\": \"Use\"\r\n" + 
				"                },\r\n" + 
				"                \"aural\": {\r\n" + 
				"                    \"name\": \"sound://speech/useItem\"\r\n" + 
				"                },\r\n" + 
				"                \"id\": \"dim/controllers/explore/use\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"visual\": {\r\n" + 
				"                    \"name\": \"Take\"\r\n" + 
				"                },\r\n" + 
				"                \"aural\": {\r\n" + 
				"                    \"name\": \"sound://speech/takeItem\"\r\n" + 
				"                },\r\n" + 
				"                \"id\": \"dim/controllers/explore/take\"\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"prompt\": [\r\n" + 
				"            {\r\n" + 
				"                \"description\": \"What would you like to examine?\",\r\n" + 
				"                \"narration\": \"sound://speech/whatToExamine\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"ctrl\",\r\n" + 
				"        \"id\": \"examine\",\r\n" + 
				"        \"impossible\": [\r\n" + 
				"            {\r\n" + 
				"                \"description\": \"There's nothing here.\",\r\n" + 
				"                \"narration\": \"sound://speech/nothingHere\"\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"prompt\": [\r\n" + 
				"            {\r\n" + 
				"                \"description\": \"Where do you want to move?\",\r\n" + 
				"                \"narration\": \"sound://speech/whereToMove\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"ctrl\",\r\n" + 
				"        \"id\": \"move\",\r\n" + 
				"        \"impossible\": [\r\n" + 
				"            {\r\n" + 
				"                \"description\": \"You can't move anywhere.\",\r\n" + 
				"                \"narration\": \"sound://speech/cantMoveAnywhere\"\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"prompt\": [\r\n" + 
				"            {\r\n" + 
				"                \"description\": \"What item will you take?\",\r\n" + 
				"                \"narration\": \"sound://speech/whatToTake\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"ctrl\",\r\n" + 
				"        \"id\": \"take\",\r\n" + 
				"        \"impossible\": [\r\n" + 
				"            {\r\n" + 
				"                \"description\": \"You can't take anything here.\",\r\n" + 
				"                \"narration\": \"sound://speech/cantTakeAnything\"\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"nothingUseable\": [\r\n" + 
				"            {\r\n" + 
				"                \"description\": \"You have nothing to use.\",\r\n" + 
				"                \"narration\": \"sound://speech/nothingToUse\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"prompt\": [\r\n" + 
				"            {\r\n" + 
				"                \"description\": \"What item will you use?\",\r\n" + 
				"                \"narration\": \"sound://speech/whatItemWillYouUse\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"noInteraction\": [\r\n" + 
				"            {\r\n" + 
				"                \"description\": \"Nothing happened.\",\r\n" + 
				"                \"narration\": \"sound://speech/nothingHappened\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"noAction\": [\r\n" + 
				"            {\r\n" + 
				"                \"description\": \"Nothing happened.\",\r\n" + 
				"                \"narration\": \"sound://speech/nothingHappened\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"promptInteract\": [\r\n" + 
				"            {\r\n" + 
				"                \"description\": \"Use this on what?\",\r\n" + 
				"                \"narration\": \"sound://speech/useThisOnWhat\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"ctrl\",\r\n" + 
				"        \"id\": \"use\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"report\": [\r\n" + 
				"            {\r\n" + 
				"                \"description\": \"{{args.1.visual.description}}\",\r\n" + 
				"                \"narration\": \"{{{args.1.aural.description}}}\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"on\": [\r\n" + 
				"            \"examine\",\r\n" + 
				"            \"*\"\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"event\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"report\": [\r\n" + 
				"            {\r\n" + 
				"                \"ambience\": \"{{{args.1.aural.backdrop}}}\",\r\n" + 
				"                \"narration\": \"{{{args.1.aural.name}}}\",\r\n" + 
				"                \"description\": \"{{args.1.visual.description}}\",\r\n" + 
				"                \"backdrop\": \"{{args.1.visual.backdrop}}\",\r\n" + 
				"                \"title\": \"{{args.1.visual.name}}\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"narration\": \"{{{args.1.aural.description}}}\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"on\": [\r\n" + 
				"            \"move\",\r\n" + 
				"            \"*\"\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"event\",\r\n" + 
				"        \"exec\": [\r\n" + 
				"            {\r\n" + 
				"                \"action\": \"set\",\r\n" + 
				"                \"args\": [\r\n" + 
				"                    \"player.scene\",\r\n" + 
				"                    \"{{args.1.id}}\"\r\n" + 
				"                ]\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"report\": [\r\n" + 
				"            {\r\n" + 
				"                \"description\": \"You have taken the {{args.1.visual.name}}.\",\r\n" + 
				"                \"narration\": \"sound://speech/youHaveTakenThe\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"narration\": \"{{{args.1.aural.name}}}\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"on\": [\r\n" + 
				"            \"take\",\r\n" + 
				"            \"*\"\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"event\",\r\n" + 
				"        \"exec\": [\r\n" + 
				"            {\r\n" + 
				"                \"action\": \"append\",\r\n" + 
				"                \"args\": [\r\n" + 
				"                    \"player.items\",\r\n" + 
				"                    \"{{args.1.id}}\"\r\n" + 
				"                ]\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"action\": \"append\",\r\n" + 
				"                \"args\": [\r\n" + 
				"                    \"item.{{args.1.id}}.properties\",\r\n" + 
				"                    \"useable\"\r\n" + 
				"                ]\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    }," +
				"    {\r\n" + 
				"        \"comment\": \"save\",\r\n" + 
				"        \"on\": [\r\n" + 
				"            \"use\",\r\n" + 
				"            \"journal\"\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"event\",\r\n" + 
				"        \"exec\": [\r\n" + 
				"            {\r\n" + 
				"                \"action\": \"activate\",\r\n" + 
				"                \"args\": [\r\n" + 
				"                    \"dim/controllers/meta/save\"\r\n" + 
				"                ]\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    }, ");
	}
	
	public void moveEventTranslate(PrintWriter writer, MoveEvent event){
		writer.println("    {\r\n" +
				"        \"priority\": -1,\r\n" + 
				"        \"on\": [\r\n" + 
				"            \"move\",\r\n" + 
				"            \""+event.getScene().getId()+"\"\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"event\",\r\n" + 
				"        \"exec\": [\r\n" + 
				"            {\r\n" + 
				"                \"action\": \"set\",\r\n" + 
				"                \"args\": [\r\n" + 
				"                    \"scene."+event.getScene().getId()+".visual.description\",\r\n" + 
				"                    \""+event.getVisMoveDesc()+"\"\r\n" + 
				"                ]\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"action\": \"set\",\r\n" + 
				"                \"args\": [\r\n" + 
				"                    \"scene."+event.getScene().getId()+".aural.description\",\r\n" + 
				"                    \""+event.getAurMoveDesc()+"\"\r\n" + 
				"                ]\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },");
	}
	
	public void takeEventTranslate(PrintWriter writer, TakeEvent event){
		writer.println("    {\r\n" + 
				"        \"on\": [\r\n" + 
				"            \"take\",\r\n" + 
				"            \""+event.getItem().getId()+"\"\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"event\",\r\n" + 
				"        \"exec\": [\r\n" + 
				"            {\r\n" + 
				"                \"action\": \"append\",\r\n" + 
				"                \"args\": [\r\n" + 
				"                    \"item."+"lock"+".properties\",\r\n" + 
				"                    \"useable\"\r\n" + 
				"                ]\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    }, ");
	}
	
	public void itemTranslate(PrintWriter writer, Item item){
		writer.println("    {\r\n" + 
				"        \"visual\": {\r\n" + 
				"            \"name\": \""+item.getVisualName()+"\",\r\n" + 
				"            \"description\": \""+item.getVisualDescription()+"\"\r\n" + 
				"        },\r\n" + 
				"        \"aural\": {\r\n" + 
				"            \"name\": \""+item.getAuralName()+"\",\r\n" + 
				"            \"description\": \""+item.getAuralDescription()+"\"\r\n" + 
				"        },\r\n" + 
				"        \"type\": \"item\",\r\n" + 
				"        \"id\": \""+item.getId()+"\",\r\n");
		writer.printf("        \"properties\": [");
		
		Iterator<String> propItr = item.getProperties().iterator();
		if(propItr.hasNext()) writer.printf("\n");
		else writer.printf("]\n");
		while(propItr.hasNext()){
			writer.printf("        \""+propItr.next()+"\"");
			if(propItr.hasNext()) writer.printf(",");
			writer.printf("\n");
			if(!propItr.hasNext()) writer.printf("        ]\n");
		}
		writer.println("    },");
	}
	
	public void useEventTranslate(PrintWriter writer, UseEvent event){
		writer.println("    {\r\n" + 
				"        \"comment\": \""+event.getComment()+"\",\r\n" + 
				"        \"on\": [\r\n" + 
				"            \"use\",\r\n" + 
				"            \""+event.getUsed().getId()+"\",\r\n" + 
				"            \""+event.getUpon().getId()+"\"\r\n" + 
				"        ],\r\n" + 
				"        \"report\": [\r\n" + 
				"            {\r\n" + 
				"                \"description\": \""+event.getReportDescription()+"\",\r\n" + 
				"                \"narration\": \""+event.getReportNarration()+"\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"event\",\r\n" + 
				"        \"exec\": [\r\n" + 
				"            {\r\n" + 
				"                \"action\": \"append\",\r\n" + 
				"                \"args\": [\r\n" + 
				"                    \"scene."+event.getUponScene().getId()+".adjoins\",\r\n" + 
				"                    \""+event.getAdjoinScene().getId()+"\"\r\n" + 
				"                ]\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"action\": \"remove\",\r\n" + 
				"                \"args\": [\r\n" + 
				"                    \"player.items\",\r\n" + 
				"                    \""+event.getUsed().getId()+"\"\r\n" + 
				"                ]\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"action\": \"remove\",\r\n" + 
				"                \"args\": [\r\n" + 
				"                    \"scene."+event.getUponScene().getId()+".items\",\r\n" + 
				"                    \""+event.getUpon().getId()+"\"\r\n" + 
				"                ]\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    }");
	}

	public void sceneTranslate(PrintWriter writer, Scene scene){
		writer.printf("    {\r\n" + 
				"        \"items\": [");
		
		Iterator<String> itemsItr = scene.getItems().iterator();
		if (itemsItr.hasNext()) writer.printf("\n");
		while(itemsItr.hasNext()){
			writer.printf("        \""+itemsItr.next()+"\"");
			if(itemsItr.hasNext()) writer.printf(",");
			writer.printf("\n");	
		}
		
		writer.printf("        ],\n");
		
		writer.printf("        \"adjoins\": [");
		
		Iterator<String> adjoinItr = scene.getAdjoins().iterator();
		if (adjoinItr.hasNext())  writer.printf("\n");
		while (adjoinItr.hasNext()){
			writer.printf("        \""+adjoinItr.next()+"\"");
			if(adjoinItr.hasNext()) writer.printf(",");
			writer.printf("\n");
		}
		writer.printf("],\n");
		
		writer.println("        \"visual\": {\r\n" + 
				"            \"name\": \""+scene.getVisualName()+"\",\r\n" + 
				"            \"description\": \""+scene.getVisualDescription()+"\"\r\n" + 
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

	public void saveTranslate(PrintWriter writer) {
		writer.println("    {\r\n" + 
				"        \"comment\": \"save\",\r\n" + 
				"        \"on\": [\r\n" + 
				"            \"use\",\r\n" + 
				"            \"journal\"\r\n" + 
				"        ],\r\n" + 
				"        \"type\": \"event\",\r\n" + 
				"        \"exec\": [\r\n" + 
				"            {\r\n" + 
				"                \"action\": \"activate\",\r\n" + 
				"                \"args\": [\r\n" + 
				"                    \"dim/controllers/meta/save\"\r\n" + 
				"                ]\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    }, ");
		
	}

}
