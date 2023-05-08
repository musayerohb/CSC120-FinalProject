import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Initializes LivingRoom class while extending methods from House class.
 */
public class LivingRoom extends House {
    
    public Hashtable<String, String> openableItems;
    public Hashtable<String, String> grabbableItems;
    public Hashtable<String, String> lookableItems;
    public ArrayList<String> adjacentRooms;

    /**
     * The constructor for the LivingRoom class. Creates an instance of the class with three hashtables of items one can open, look under, and/or grab in the room. The keys of the hashtables are the item names, and the values describe what happens when one opens, looks under, and/or grabs the item. 
     */
    public LivingRoom() {
        this.openableItems = new Hashtable<String, String>();
        this.lookableItems = new Hashtable<String, String>();
        this.grabbableItems = new Hashtable<String, String>();

        openableItems.put("door", "You open the door.");
        lookableItems.put("couch", "You look under both couches. Under the first couch closest to you is some lint and dust. Under the second couch is...you guessed it, more lint and dust.");
        lookableItems.put("couches", "You look under both couches. Under the first couch closest to you is some lint and dust. Under the second couch is...you guessed it, more lint and dust.");
        lookableItems.put("sofa", "You look under the sofa to find dust, and a sword. It looks rusty and a little bent out of shape. Definitely super old.");
        lookableItems.put("plant", "You pick up the plant in the corner. There's nothing but flooring underneath it. You put it back down."); 
        lookableItems.put("carpet", "You look under the carpet. There's a small navy blue flag with a yellow diamond. The diamond has the letters 'SC' on it. What a strange emblem for a kingdom.");
        grabbableItems.put("flag", "You take the flag and put it in your inventory.");
        grabbableItems.put("sword", "You take the sword and put it in your inventory.");
        grabbableItems.put("plant", "You take the plant and put it in your inventory.");
    }

}
        
    
    


