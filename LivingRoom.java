import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class LivingRoom {
    public Hashtable<String, String> openableItems;
    public Hashtable<String, String> grabbableItems;
    public Hashtable<String, String> lookableItems;
    public ArrayList<String> adjacentRooms;

    public LivingRoom() {
        this.openableItems = new Hashtable<String, String>();
        this.grabbableItems = new Hashtable<String, String>();
        this.lookableItems = new Hashtable<String, String>();           
        ArrayList<String> adjacentRooms = new ArrayList<String>(Arrays.asList("Bedroom", "Kitchen"));

        openableItems.put("door", "You open the door.");
        
        lookableItems.put("couch", "You look under both couches. Under the first couch closest to you is some lint and dust.");
        lookableItems.put("sofa", "You look under the sofa to find dust, and a long sword. The sword looks rusty and a little bent out of shape. Definitely super old.");
        lookableItems.put("sofas", "You look under the sofa to find dust, and a long sword. The sword looks rusty and a little bent out of shape. Definitely super old.");
    
    
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
