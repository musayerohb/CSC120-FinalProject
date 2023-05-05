import java.util.Hashtable;

/**
 * Initializes Bedroom class while extending methods from House class.
 */
public class Bedroom extends House {
    
    public Hashtable<String, String> openableItems;
    public Hashtable<String, String> grabbableItems;
    public Hashtable<String, String> lookableItems;

    /**
     * Creates an instance for the Bedroom class, with three hashtables of items one can open, look under, and/or grab in the room. The keys of the hashtables are the item names, and the values describe what happens when one opens, looks under, and/or grabs the item. 
     */
    public Bedroom() {
        this.openableItems = new Hashtable<String, String>();
        this.lookableItems = new Hashtable<String, String>();
        this.grabbableItems = new Hashtable<String, String>();

        openableItems.put("door", "You open the door.");
        openableItems.put("window", "You open the window and see the town below you. There's a man way down the street yelling about his cabbages.");
        
        lookableItems.put("blanket", "You look under the blankets to find the villager's plush pig.");
        lookableItems.put("blankets", "You look under the blankets to find the villager's plush pig.");
        lookableItems.put("furry blanket", "You look under the blankets to find the villager's plush pig.");
        lookableItems.put("furry blankets", "You look under the blankets to find the villager's plush pig.");
        lookableItems.put("bed", "You bend down and look under the bed. It's dark, but you can make out a small toy car lying on its side. Somehow, you can identify the model of the car: a 1967 Chevrolet Impala. You wonder where you've seen this car before.");

        grabbableItems.put("plush pig", "You grab the plush pig and put it in your inventory.");
        grabbableItems.put("plushie", "You grab the plushie and put in in your inventory.");
        grabbableItems.put("car", "You grab the car and put it into your inventory.");
    }
        
}
