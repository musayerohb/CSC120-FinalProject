import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Bedroom extends House {
    public Hashtable<String, String> openableItems;
    public Hashtable<String, String> grabbableItems;
    public Hashtable<String, String> lookableItems;
    public ArrayList<String> adjacentRooms;

    public Bedroom() {
        this.openableItems = new Hashtable<String, String>();
        this.lookableItems = new Hashtable<String, String>();
        this.grabbableItems = new Hashtable<String, String>();
        this.adjacentRooms = new ArrayList<>(Arrays.asList("Study"));

        openableItems.put("door", "You open the door.");
        openableItems.put("window", "\nYou open the window and see the town below you. There's a man way down the street yelling about his cabbages.");
        
        lookableItems.put("blanket", "\nYou look under the blankets to find the villager's plush pig.");
        lookableItems.put("blankets", "\nYou look under the blankets to find the villager's plush pig.");
        lookableItems.put("furry blanket", "\nYou look under the blankets to find the villager's plush pig.");
        lookableItems.put("furry blankets", "\nYou look under the blankets to find the villager's plush pig.");
        lookableItems.put("bed", "\nYou bend down and look under the bed. It's dark, but you can make out a small toy car lying on its side. Somehow, you can identify the model of the car: a 1967 Chevrolet Impala. You wonder where you've seen this car before.");

        grabbableItems.put("plush pig", "\nYou grab the plush pig and put it inside your inventory.");
        grabbableItems.put("plushie", "\nYou grab the plushie and put in inside your inventory.");
        grabbableItems.put("car", "\nYou grab the car and put it into your inventory.");
    }
        
}
