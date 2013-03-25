/*Item bag is for storing (ID, item) pairs.  This is for translating ID strings 
 * to actual objects.  This will come in handy for the player class where we are
 * constantly adding and removing objects.
 * 
 * What I want is a global ItemBag so that whenever we make a new item, the ID 
 * and item are stored as a pair (and the reverse for removal)
 * 
 * We may be able to consolidate this into another class.  Item should probably be a
 * subclass if Item
 */

package objects;

import java.util.HashMap;

public class ItemBag {
	public HashMap<String, Item> IDItemPairs;

	public void addPair(String string, Item testItem1) {
		// TODO Auto-generated method stub
		
	}

	public Item getItem(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removePair(String string) {
		// TODO Auto-generated method stub
		
	}
}
