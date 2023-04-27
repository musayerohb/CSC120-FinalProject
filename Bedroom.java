import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Bedroom {
    public Hashtable<String, String> openableItems;
    public Hashtable<String, String> grabbableItems;
    public Hashtable<String, String> lookableItems;
    public ArrayList<String> adjacentRooms;

    public Bedroom() {
        Hashtable<String, String> openable_items = new Hashtable<String, String>();
        Hashtable<String, String> grabbableItems = new Hashtable<String, String>();
        Hashtable<String, String> lookableItems = new Hashtable<String, String>();     
        ArrayList<String> adjacentRooms = new ArrayList<>(Arrays.asList("Study"));

        openable_items.put("window", "You open the window.");

    }
}
