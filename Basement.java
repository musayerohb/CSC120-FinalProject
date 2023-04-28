import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Basement {

    public Hashtable<String, String> openableItems;
    public Hashtable<String, String> grabbableItems;
    public Hashtable<String, String> lookableItems;
    public ArrayList<String> adjacentRooms;

    public Basement() {
        this.openableItems = new Hashtable<String, String>();
        this.lookableItems = new Hashtable<String, String>();
        this.grabbableItems = new Hashtable<String, String>();
        ArrayList<String> adjacentRooms = new ArrayList<>(Arrays.asList("Basement"));
        openableItems.put("cabinet", "You open the cabinet.");
        openableItems.put("door", "You open the door.");
        openableItems.put("barrel", "You open the barrel.");
        openableItems.put("barrels", "You open the barrels.");
        grabbableItems.put("candle", "You take a candle from the wall.");

    }
    
    //We need to generalize this later so we don't have to rewrite it over and again.
    public void moveThroughDoor(User user) {
        if (this.adjacentRooms.size() > 1) {
            System.out.println("The door to the Bedroom or to the Kitchen? (Type 'Bedroom' or 'Kitchen' to choose.)");
            String userSelect = user.userInput.nextLine();
            if (userSelect.equals("Bedroom")) {
                System.out.println("You walk into the Bedroom.");
                user.currentLocation = "Bedroom";
            }
            else if (userSelect.equals("Kitchen")) {
                System.out.println("You walk into the Kitchen.");
                user.currentLocation = "Kitchen";
            }

        }
    }
    
}
