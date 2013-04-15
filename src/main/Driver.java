package main;

import java.awt.Color;

import bus.uigen.ObjectEditor;
import bus.uigen.attributes.AttributeNames;
import objects.*;

public class Driver {
	public static void main(String[] args){
		
		ObjectEditor.setPropertyAttribute(World.class, "Items", AttributeNames.SCROLLED, true);
		ObjectEditor.setPropertyAttribute(World.class, "Items", AttributeNames.CONTAINER_WIDTH, 1000);
		ObjectEditor.setPropertyAttribute(World.class, "Items", AttributeNames.CONTAINER_HEIGHT, 100);
		
		ObjectEditor.setPropertyAttribute(World.class, "Scenes", AttributeNames.SCROLLED, true);
		ObjectEditor.setPropertyAttribute(World.class, "Scenes", AttributeNames.CONTAINER_WIDTH, 1000);
		ObjectEditor.setPropertyAttribute(World.class, "Scenes", AttributeNames.CONTAINER_HEIGHT, 100);
		
		ObjectEditor.setPropertyAttribute(World.class, "Events", AttributeNames.SCROLLED, true);
		ObjectEditor.setPropertyAttribute(World.class, "Events", AttributeNames.CONTAINER_WIDTH, 1000);
		ObjectEditor.setPropertyAttribute(World.class, "Events", AttributeNames.CONTAINER_HEIGHT, 100);
		
		ObjectEditor.setPropertyAttribute(EditableItem.class, "Save", AttributeNames.SHOW_BUTTON, true);
		//ObjectEditor.setDefaultAttribute(AttributeNames.COMPONENT_BACKGROUND, Color.BLUE);
		
		ObjectEditor.edit(new World());
		
	}

}
