import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Initializes Kitchen class while extending methods from House class.
 */
public class Study extends House {
    
    public Hashtable<String, String> openableItems;
    public Hashtable<String, String> grabbableItems;
    public Hashtable<String, String> lookableItems;
    public ArrayList<String> adjacentRooms;

    /**
     * The constructor for the LivingRoom class. Creates an instance of the class with three hashtables of items one can open, look under, and/or grab in the room. The keys of the hashtables are the item names, and the values describe what happens when one opens, looks under, and/or grabs the item. 
     */
    public Study() {
        this.openableItems = new Hashtable<String, String>();
        this.lookableItems = new Hashtable<String, String>();
        this.grabbableItems = new Hashtable<String, String>();

        lookableItems.put("desk", "You look under the desk to find some scattered papers and a pen.");
        lookableItems.put("bookshelf", "You look under the bookshelf. You see a bunch of bottle caps covered in dust. They seem pretty useless.");

        openableItems.put("drawer", "You open the drawer. There's a large hammer inside. As you try to grab it, you hear thunder outside. Is it supposed to rain soon? You cautiously let go.");
        openableItems.put("drawers", "You open the drawers. There's a large hammer inside one of them. As you try to grab it, you hear thunder outside. Is it supposed to rain soon? You cautiously let go.");
        openableItems.put("desk", "You open the desk. Inside, there's a small book with the title, 'Coding Text-based Adventure Games for Dummies'. You don't bother considering what a book about coding is doing in a medieval world and choose to just accept the joke and move on.");
        openableItems.put("door", "You open the door.");
        
        grabbableItems.put("papers", "Um, don't know why you'd need that, but yeah, you grab the papers and put them in your inventory.");
        grabbableItems.put("paper", "Um, don't know why you'd need that, but yeah, you grab the papers and put them in your inventory.");
        grabbableItems.put("pen", "Just in case you need to write on something later, you grab the pen and put it in your inventory.");
        grabbableItems.put("hammer", "Agsinst your better judgement, you pick up the hammer and put it in your inventory. You silently pray that it doesn't electrocute you.");
    }
    
}