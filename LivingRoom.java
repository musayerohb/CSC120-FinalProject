import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class LivingRoom {
    public Hashtable<String, String> openableItems;
    public Hashtable<String, String> grabbableItems;
    public Hashtable<String, String> lookableItems;
    public ArrayList<String> adjacentRooms;

    public LivingRoom() {
        Hashtable<String, String> openableItems = new Hashtable<String, String>();
        Hashtable<String, String> grabbableItems = new Hashtable<String, String>();
        Hashtable<String, String> lookableItems = new Hashtable<String, String>();        
        ArrayList<String> adjacentRooms = new ArrayList<>(Arrays.asList("Bedroom", "Kitchen"));
        openableItems.put("door", "You open the door.");

    }
}
