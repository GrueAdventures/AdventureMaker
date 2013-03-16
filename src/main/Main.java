package main;
import objects.*;
import bus.uigen.*;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String input;
		while(true){
			System.out.println("Please enter type of item to create:");
			input = in.next();
			if(input.equalsIgnoreCase("Item")){
				ObjectEditor.edit(new Item("", "", "", "", "", new Vector<String>()));
			}
			else if(input.equalsIgnoreCase("Scene")){
				ObjectEditor.edit(new Scene("", "", "", "", "", "", ""));
			}
			else if(input.equalsIgnoreCase("Event")){
				ObjectEditor.edit(new Event("", new Vector<String>(), new Vector<Exec>(), new Vector<Report>()));
			}
			else{
				System.out.println("Value entered is not a valid keyword.");
			}
		}
	}
}
