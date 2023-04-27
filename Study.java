import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Study {
    public Hashtable<String, String> openableItems;
    public Hashtable<String, String> grabbableItems;
    public Hashtable<String, String> lookableItems;
    public ArrayList<String> adjacentRooms;

    public Study() {
        Hashtable<String, String> openable_items = new Hashtable<String, String>();
        ArrayList<String> adjacentRooms = new ArrayList<>(Arrays.asList("Bedroom"));

    }
}