package main;
import objects.*;
import bus.uigen.*;
import java.util.Vector;

public class Main {
	public static void main(String[] args){
		ObjectEditor.edit(new Item("testItem", "Test Item", "This is an item", "", "", new Vector<String>()));
	}

}
