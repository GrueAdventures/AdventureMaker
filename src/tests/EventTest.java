package tests;

import static org.junit.Assert.*;
import objects.*;
import java.util.Vector;

import org.junit.Test;

public class EventTest {

	@Test
	public void testEvent() {
		Event event = new Event("testEvent", new Vector<String>(), new Vector<Exec>(), new Vector<Report>());
		assertTrue(event.getId().equals("testEvent")
				&&event.getType().equals("event")
				&&event.getOn().isEmpty()
				&&event.getExec().isEmpty()
				&&event.getReport().isEmpty());
	}
	
	@Test
	public void testAddReport(){
		Event event = new Event("testEvent", new Vector<String>(), new Vector<Exec>(), new Vector<Report>());
		
		event.addReport(new Report("Description of report", "Narration of report"));
		assertTrue(!event.getReport().isEmpty());
		assertTrue(event.getReport().get(0).getDescription().equals("Description of report"));
		
		event.addReport(new Report("Description of report2", "Narration of report2"));
		assertTrue(!event.getReport().isEmpty());
		assertTrue(event.getReport().get(0).getDescription().equals("Description of report"));
		assertTrue(event.getReport().get(1).getDescription().equals("Description of report2"));
	}
	
	@Test
	public void testRemoveReport(){
		Event event = new Event("testEvent", new Vector<String>(), new Vector<Exec>(), new Vector<Report>());
		
		event.addReport(new Report("Description of report", "Narration of report"));
		event.addReport(new Report("Description of report2", "Narration of report2"));
		event.addReport(new Report("Description of report3", "Narration of report3"));
		
		assertTrue(!event.getReport().isEmpty());
		assertTrue(event.getReport().size() == 3);
		assertTrue(event.getReport().get(1).getDescription().equals("Description of report2"));
		
		event.removeReport(1);
		assertTrue(!event.getReport().isEmpty());
		assertTrue(event.getReport().size() == 2);
		assertTrue(event.getReport().get(1).getDescription().equals("Description of report3"));
	}
	
	@Test
	public void testAddExec(){
		Event event = new Event("testEvent", new Vector<String>(), new Vector<Exec>(), new Vector<Report>());
		
		event.addExec(new Exec("Action to execute", new Vector<String>()));
		assertTrue(!event.getExec().isEmpty());
		assertTrue(event.getExec().get(0).getAction().equals("Action to execute"));
		
		event.addExec(new Exec("Action to execute2", new Vector<String>()));
		assertTrue(!event.getExec().isEmpty());
		assertTrue(event.getExec().get(0).getAction().equals("Action to execute"));
		assertTrue(event.getExec().get(1).getAction().equals("Action to execute2"));
	}
	
	@Test
	public void testRemoveExec(){
		Event event = new Event("testEvent", new Vector<String>(), new Vector<Exec>(), new Vector<Report>());
		
		event.addExec(new Exec("Action to execute", new Vector<String>()));
		event.addExec(new Exec("Action to execute2", new Vector<String>()));
		event.addExec(new Exec("Action to execute3", new Vector<String>()));
		
		assertTrue(!event.getExec().isEmpty());
		assertTrue(event.getExec().size() == 3);
		assertTrue(event.getExec().get(0).getAction().equals("Action to execute"));
		
		event.removeExec(1);
		assertTrue(!event.getExec().isEmpty());
		assertTrue(event.getExec().size() == 2);
		assertTrue(event.getExec().get(1).getAction().equals("Action to execute3"));
		
	}
	
	@Test
	public void testAddOn(){
		Event event = new Event("testEvent", new Vector<String>(), new Vector<Exec>(), new Vector<Report>());
		
		event.addOn("Condition");
		assertTrue(!event.getOn().isEmpty());
		assertTrue(event.getOn().get(0).equals("Condition"));
		
		event.addOn("Condition2");
		assertTrue(!event.getOn().isEmpty());
		assertTrue(event.getOn().get(0).equals("Condition"));
		assertTrue(event.getOn().get(1).equals("Condition2"));
	}
	
	@Test
	public void testRemoveOn(){
		Event event = new Event("testEvent", new Vector<String>(), new Vector<Exec>(), new Vector<Report>());
		
		event.addOn("Condition");
		event.addOn("Condition2");
		event.addOn("Condition3");
		
		assertTrue(!event.getOn().isEmpty());
		assertTrue(event.getOn().size() == 3);
		assertTrue(event.getOn().get(1).equals("Condition2"));
		
		event.removeExec(1);
		assertTrue(!event.getOn().isEmpty());
		assertTrue(event.getOn().size() == 2);
		assertTrue(event.getOn().get(1).equals("Condition3"));
	}
	
}
