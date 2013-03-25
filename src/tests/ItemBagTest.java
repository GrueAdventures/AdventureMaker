package tests;

import static org.junit.Assert.*;

import objects.Item;
import objects.ItemBag;

import org.junit.Test;

public class ItemBagTest {

	@Test
	public void addPairTest() {
		/*Testing for adding a String, Item pair
		 * 
		 */
		ItemBag testBag = new ItemBag();
		Item testItem1 = new Item("testItem1");
		testBag.addPair("testItem1", testItem1);

		fail("Not yet implemented");
	}
	
	@Test
	public void removePairTest(){
		/*Removing a pair
		 * 
		 */
		
		ItemBag testBag = new ItemBag();
		Item testItem1 = new Item("testItem1");
		testBag.addPair("testItem1", testItem1);
		testBag.removePair("testItem1");
	}
	

	@Test
	public void getItemTest(){
		/*Test for retrieving an Item from its ID
		 * 
		 */
		ItemBag testBag = new ItemBag();
		Item testItem1 = new Item("testItem1");
		testBag.addPair("testItem11", testItem1);
		
		Item testItem2 = testBag.getItem("testItem1");
		fail("Not yet implemented");
		
		
		
	}

}
