import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Kitchen extends House {
    public Hashtable<String, String> openableItems;
    public Hashtable<String, String> grabbableItems;
    public Hashtable<String, String> lookableItems;
    public ArrayList<String> adjacentRooms;

    public Kitchen() {
        this.openableItems = new Hashtable<String, String>();
        this.lookableItems = new Hashtable<String, String>();
        this.grabbableItems = new Hashtable<String, String>();    
        this.adjacentRooms = new ArrayList<>(Arrays.asList("Living Room", "Basement"));
        openableItems.put("door", "You open the door.");
        lookableItems.put("table", "You look under the table.");
        lookableItems.put("stool", "You look under the stool.");
        lookableItems.put("pot", "You look under the pot.");
        openableItems.put("cabinet", "You open the cabinet.");


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