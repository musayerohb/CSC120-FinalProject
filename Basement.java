import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;



public class Basement {

    public Hashtable<String, String> openableItems;
    public Hashtable<String, String> grabbableItems;
    public Hashtable<String, String> lookableItems;
    public ArrayList<String> adjacentRooms;

    public Basement() {
        Hashtable<String, String> openable_items = new Hashtable<String, String>();
        ArrayList<String> adjacentRooms = new ArrayList<>(Arrays.asList("Basement"));
        openable_items.put("cabinet", "You open the cabinet.");
        openable_items.put("door", "You open the door.");
        // basement_openable_items.put("drawer", "You open the drawer.");
        // basement_openable_items.put("cabinets", "You open the cabinets.");
        // basement_openable_items.put("doors", "You open the doors.");
        // basement_openable_items.put("drawers", "You open the drawers.");
        // basement_openable_items.put("barrel", "You open the barrel.");
        // basement_openable_items.put("barrels", "You open the barrels.");
    }
    
}
