import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Bedroom {
    public Hashtable<String, String> openableItems;
    public Hashtable<String, String> grabbableItems;
    public Hashtable<String, String> lookableItems;
    public ArrayList<String> adjacentRooms;

    public Bedroom() {
        this.openableItems = new Hashtable<String, String>();
        this.grabbableItems = new Hashtable<String, String>();
        this.lookableItems = new Hashtable<String, String>();
        this.adjacentRooms = new ArrayList<>(Arrays.asList("Study"));

        openableItems.put("window", "You open the window and see the town below you. There's a man way down the street yelling about his cabbages.");
        
        lookableItems.put("blanket", "You look under the blankets to find the villager's plush pig.");
        lookableItems.put("blankets", "You look under the blankets to find the villager's plush pig.");
        lookableItems.put("furry blanket", "You look under the blankets to find the villager's plush pig.");
        lookableItems.put("furry blankets", "You look under the blankets to find the villager's plush pig.");

        grabbableItems.put("plush pig", "You grab the plush pig and put it inside your inventory.");
        grabbableItems.put("plushie", "You grab the plushie and put in inside");
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
