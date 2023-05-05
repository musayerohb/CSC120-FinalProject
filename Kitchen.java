import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

/**
 * Initializes Kitchen class while extending methods from House class.
 */
public class Kitchen extends House {
    
    public Hashtable<String, String> openableItems;
    public Hashtable<String, String> grabbableItems;
    public Hashtable<String, String> lookableItems;
    public ArrayList<String> adjacentRooms;

    /**
     * The constructor for the Kitchen class. Creates an instance of the class with three hashtables of items one can open, look under, and/or grab in the room. The keys of the hashtables are the item names, and the values describe what happens when one opens, looks under, and/or grabs the item. 
     */
    public Kitchen() {
        this.openableItems = new Hashtable<String, String>();
        this.lookableItems = new Hashtable<String, String>();
        this.grabbableItems = new Hashtable<String, String>();    
        this.adjacentRooms = new ArrayList<>(Arrays.asList("Living Room", "Basement"));
        
        openableItems.put("door", "You open the door.");
        openableItems.put("cabinet", "You open the cabinet. There's some plates and cups, as well as a spatula placed in front of them. You can make out some writing on the handle: 'I'm Ready! I'm Ready! I'm Ready!' Ready for what? You take time to ponder the question.");
        openableItems.put("cabinets", "You open the cabinets. There's some plates and cups in most of them. In one of them, a spatula sits in front of some plates. You can make out some writing on the handle: 'I'm Ready! I'm Ready! I'm Ready!' Ready for what? You take time to ponder the question.");
        openableItems.put("container", "You open the container. It reeks! Definitely nothing useful in there.");
        lookableItems.put("table", "You look under the table. There's a plastic green container lying on the ground, with remnants of food inside. You silently judge the person who left there it instead of returning it to where it belongs.");
        lookableItems.put("stool", "You look under the stool. There is nothing of note.");
        lookableItems.put("stools", "You look under the stools. There is nothing of note.");
        lookableItems.put("pot", "You look under the pot. You spot a weed...of the plant variety. The kind in fields. Flower fields. Get your head out of the gutter!");
        grabbableItems.put("spatula", "You pick up the spatula and put it in your inventory.");
    }
    
}