package main;

import java.awt.Color;
import java.awt.List;
import java.lang.reflect.Method;
import java.util.Vector;

import bus.uigen.ObjectEditor;
import bus.uigen.attributes.AttributeNames;
import objects.*;


public class Driver {
	public static void main(String[] args){
		
		final int fieldLength = 175;
		
		
//		ObjectEditor.setPropertyAttribute(ItemTab.class, "Items", AttributeNames.SCROLLED, true);
//		ObjectEditor.setPropertyAttribute(ItemTab.class, "Items", AttributeNames.CONTAINER_WIDTH, 1200);
//		ObjectEditor.setPropertyAttribute(ItemTab.class, "Items", AttributeNames.CONTAINER_HEIGHT, 100);
//		ObjectEditor.setPropertyAttribute(ItemTab.class, "Items", AttributeNames.CONTAINER_WIDTH, 1000);
		
//		ObjectEditor.setPropertyAttribute(SceneTab.class, "Scenes", AttributeNames.SCROLLED, true);
//		ObjectEditor.setPropertyAttribute(SceneTab.class, "Scenes", AttributeNames.CONTAINER_WIDTH, 1000);
//		ObjectEditor.setPropertyAttribute(SceneTab.class, "Scenes", AttributeNames.CONTAINER_HEIGHT, 100);
//		
//		ObjectEditor.setPropertyAttribute(EditableScene.class, "Items", AttributeNames.SCROLLED, true);
//		ObjectEditor.setPropertyAttribute(EditableScene.class, "Items", AttributeNames.CONTAINER_WIDTH, 150);
//		ObjectEditor.setPropertyAttribute(EditableScene.class, "Items", AttributeNames.CONTAINER_HEIGHT, 100);
		
//		ObjectEditor.setPropertyAttribute(World.class, "Events", AttributeNames.SCROLLED, true);
//		ObjectEditor.setPropertyAttribute(World.class, "Events", AttributeNames.CONTAINER_WIDTH, 1000);
//		ObjectEditor.setPropertyAttribute(World.class, "Events", AttributeNames.CONTAINER_HEIGHT, 100);
//		
//		ObjectEditor.setPropertyAttribute(EditableScene.class, "Adjoins", AttributeNames.SCROLLED, true);
//		ObjectEditor.setPropertyAttribute(EditableScene.class, "Adjoins", AttributeNames.CONTAINER_WIDTH, 400);
//		ObjectEditor.setPropertyAttribute(EditableScene.class, "Items", AttributeNames.CONTAINER_WIDTH, 400);
//		
//		ObjectEditor.setPropertyAttribute(EditableItem.class, "Save", AttributeNames.SHOW_BUTTON, true);
//		ObjectEditor.setDefaultAttribute(AttributeNames.CONTAINER_BACKGROUND, Color.BLUE);
//		
		ObjectEditor.setPropertyAttribute(EditableItem.class, "visualDescription", AttributeNames.COMPONENT_WIDTH, fieldLength);
		ObjectEditor.setPropertyAttribute(EditableItem.class, "visualDescription", AttributeNames.COMPONENT_HEIGHT, 150);
		ObjectEditor.setPropertyAttribute(EditableItem.class, "visualDescription",  AttributeNames.SCROLLED, true);
		
		ObjectEditor.setPropertyAttribute(EditableScene.class, "visualDescription", AttributeNames.COMPONENT_WIDTH, fieldLength);
		ObjectEditor.setPropertyAttribute(EditableScene.class, "visualDescription", AttributeNames.COMPONENT_HEIGHT, 150);
		ObjectEditor.setPropertyAttribute(EditableScene.class, "visualDescription",  AttributeNames.SCROLLED, true);
		
		ObjectEditor.setPropertyAttribute(EditableReport.class, "Description", AttributeNames.COMPONENT_WIDTH, fieldLength);
		ObjectEditor.setPropertyAttribute(EditableReport.class, "Description", AttributeNames.COMPONENT_HEIGHT, 70);
		ObjectEditor.setPropertyAttribute(EditableReport.class, "Description",  AttributeNames.SCROLLED, true);
		
		//Initializing size of text boxes in EditableItem
		ObjectEditor.setPropertyAttribute(EditableItem.class, "visualName", AttributeNames.COMPONENT_WIDTH, fieldLength);
		ObjectEditor.setPropertyAttribute(EditableItem.class, "Id", AttributeNames.COMPONENT_WIDTH, fieldLength);
		ObjectEditor.setPropertyAttribute(EditableItem.class, "auralName", AttributeNames.COMPONENT_WIDTH, fieldLength);
		ObjectEditor.setPropertyAttribute(EditableItem.class, "auralDescription", AttributeNames.COMPONENT_WIDTH, fieldLength);
		
		//Initializing size of text boxes in EditableScene
		ObjectEditor.setPropertyAttribute(EditableScene.class, "Id", AttributeNames.COMPONENT_WIDTH, fieldLength);
		ObjectEditor.setPropertyAttribute(EditableScene.class, "visualName", AttributeNames.COMPONENT_WIDTH, fieldLength);
		ObjectEditor.setPropertyAttribute(EditableScene.class, "visualBackdrop", AttributeNames.COMPONENT_WIDTH, fieldLength);
		ObjectEditor.setPropertyAttribute(EditableScene.class, "auralName", AttributeNames.COMPONENT_WIDTH, fieldLength);
		ObjectEditor.setPropertyAttribute(EditableScene.class, "auralDescription", AttributeNames.COMPONENT_WIDTH, fieldLength);
		ObjectEditor.setPropertyAttribute(EditableScene.class, "auralBackdrop", AttributeNames.COMPONENT_WIDTH, fieldLength);

		//Initializing size of text boxes in EditableReport
		ObjectEditor.setPropertyAttribute(EditableReport.class, "Title", AttributeNames.COMPONENT_WIDTH, fieldLength);
		ObjectEditor.setPropertyAttribute(EditableReport.class, "Backdrop", AttributeNames.COMPONENT_WIDTH, fieldLength);
		ObjectEditor.setPropertyAttribute(EditableReport.class, "Narration", AttributeNames.COMPONENT_WIDTH, fieldLength);
		ObjectEditor.setPropertyAttribute(EditableReport.class, "Sound", AttributeNames.COMPONENT_WIDTH, fieldLength);
		ObjectEditor.setPropertyAttribute(EditableReport.class, "Ambience", AttributeNames.COMPONENT_WIDTH, fieldLength);
		
		
		establishParameterNames();
		
//		ObjectEditor.edit(new World());
		ObjectEditor.tabEdit(new World());
//	ObjectEditor.edit(new Vector<String>());
		
//		implement Serializable
//		util.misc.Common.deepCopy(orig);
	}
	
	//DO NOT OPEN!!!!
	private static void establishParameterNames(){
		Class[] parameterTypes = {Integer.TYPE};
		try {
			Method addMethod = ItemTab.class.getMethod("removeItem", parameterTypes);
			String[] parameterNames = {"Enter number id of Item you want to remove."};
			ObjectEditor.registerParameterNames(addMethod, parameterNames);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Method addMethod = ItemTab.class.getMethod("editItem", parameterTypes);
			String[] parameterNames = {"Enter number id of Item you want to edit."};
			ObjectEditor.registerParameterNames(addMethod, parameterNames);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Method addMethod = SceneTab.class.getMethod("removeScene", parameterTypes);
			String[] parameterNames = {"Enter number id of Scene you want to remove."};
			ObjectEditor.registerParameterNames(addMethod, parameterNames);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Method addMethod = SceneTab.class.getMethod("editScene", parameterTypes);
			String[] parameterNames = {"Enter number id of Scene you want to edit."};
			ObjectEditor.registerParameterNames(addMethod, parameterNames);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Method addMethod = EventTab.class.getMethod("removeEvent", parameterTypes);
			String[] parameterNames = {"Enter number id of Event you want to remove."};
			ObjectEditor.registerParameterNames(addMethod, parameterNames);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Method addMethod = EventTab.class.getMethod("editEvent", parameterTypes);
			String[] parameterNames = {"Enter number id of Event you want to edit."};
			ObjectEditor.registerParameterNames(addMethod, parameterNames);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Method addMethod = EditableScene.class.getMethod("removeScene", parameterTypes);
			String[] parameterNames = {"Enter number id of Scene you want to remove."};
			ObjectEditor.registerParameterNames(addMethod, parameterNames);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Method addMethod = EditableScene.class.getMethod("removeItem", parameterTypes);
			String[] parameterNames = {"Enter number id of Item you want to remove."};
			ObjectEditor.registerParameterNames(addMethod, parameterNames);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Method addMethod = EditableEvent.class.getMethod("removeExec", parameterTypes);
			String[] parameterNames = {"Enter number id of Exec you want to remove."};
			ObjectEditor.registerParameterNames(addMethod, parameterNames);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
