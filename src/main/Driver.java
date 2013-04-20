package main;

import java.awt.Color;
import java.awt.List;
import java.util.Vector;

import bus.uigen.ObjectEditor;
import bus.uigen.attributes.AttributeNames;
import objects.*;

public class Driver {
	public static void main(String[] args){
//		
		ObjectEditor.setPropertyAttribute(ItemTab.class, "Items", AttributeNames.SCROLLED, true);
		ObjectEditor.setPropertyAttribute(ItemTab.class, "Items", AttributeNames.CONTAINER_WIDTH, 1000);
		ObjectEditor.setPropertyAttribute(ItemTab.class, "Items", AttributeNames.CONTAINER_HEIGHT, 100);
//		
//		ObjectEditor.setPropertyAttribute(SceneTab.class, "Scenes", AttributeNames.SCROLLED, true);
//		ObjectEditor.setPropertyAttribute(SceneTab.class, "Scenes", AttributeNames.CONTAINER_WIDTH, 1000);
//		ObjectEditor.setPropertyAttribute(SceneTab.class, "Scenes", AttributeNames.CONTAINER_HEIGHT, 100);
//		
//		ObjectEditor.setPropertyAttribute(World.class, "Events", AttributeNames.SCROLLED, true);
//		ObjectEditor.setPropertyAttribute(World.class, "Events", AttributeNames.CONTAINER_WIDTH, 1000);
//		ObjectEditor.setPropertyAttribute(World.class, "Events", AttributeNames.CONTAINER_HEIGHT, 100);
//		
//		ObjectEditor.setPropertyAttribute(EditableScene.class, "Adjoins", AttributeNames.SCROLLED, true);
//		ObjectEditor.setPropertyAttribute(EditableScene.class, "Adjoins", AttributeNames.CONTAINER_WIDTH, 400);
//		ObjectEditor.setPropertyAttribute(EditableScene.class, "Items", AttributeNames.CONTAINER_WIDTH, 400);
//		
////		ObjectEditor.setPropertyAttribute(EditableItem.class, "Save", AttributeNames.SHOW_BUTTON, true);
////		ObjectEditor.setDefaultAttribute(AttributeNames.CONTAINER_BACKGROUND, Color.BLUE);
//		
		ObjectEditor.tabEdit(new World());
		
//		ObjectEditor.edit(new Vector<String>());
		
	}

}
