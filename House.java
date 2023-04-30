import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Hashtable;

public class House {
    public int nFloors;
    protected int activeFloor = 1;
    public Hashtable<String, String> rooms;

    public House() {
        this.nFloors = 2;
        this.activeFloor = 10;
        this.rooms = new Hashtable<String, String>();
            rooms.put("Kitchen", "When you look around, you see a wooden table in the center of the room. Four wooden stools surround it. There is a small pot sitting over an open fire against the wall directly in front of you - the villager appears to be making soup. Wooden cabinets line the walls. There are two doors, one leading back to the living Room and one to the basement.");
            rooms.put("Study", "When you look around, you see an ornate wooden desk pressed against the wall. Next to it, there is a large bookshelf with small drawers at the bottom of it. There's a door leading you back to the Bedroom.");
            rooms.put("Bedroom", "When you look around, you see a well-made bed with furry blankets on top. There's sunlight filtering through a window overlooking the village, and a door leading to the study or back downstairs to the living room.");
            rooms.put("Living Room", "When you look around, you see two couches and a large sofa. There is a large carpet on the floor in the center of the room. There's two doors, one leading upstairs to the bedroom and one to the kitchen.");
            rooms.put("Basement", "When you look around, you see 3 barrels standing up. The floor is bare and the room is dark and lit up by some candles on the walls. There's a door leading back upstairs to the kitchen.");
    }
            
    public String pick_room() {
     Random random = new Random();

     int picked_room = random.nextInt(this.rooms.size());
     String ring_room = this.rooms.get(picked_room);
     return ring_room;

    }

    // public void moveThroughDoor(User user) {
    //     if (this.adjacentRooms.size() > 1 && user.currentLocation.equals("Living Room")) {
    //         System.out.println("The door to the Bedroom or to the Kitchen? (Type 'Bedroom' or 'Kitchen' to choose.)");
    //         String userSelect = user.userInput.nextLine();
    //         if (userSelect.equals("Bedroom")) {
    //             System.out.println("You walk into the Bedroom.");
    //             user.currentLocation = "Bedroom";
    //         }
    //         else if (userSelect.equals("Kitchen")) {
    //             System.out.println("You walk into the Kitchen.");
    //             user.currentLocation = "Kitchen";
    //         }
    //     }
    //     else {
    //             if (this.adjacentRooms.size() > 1 && user.currentLocation.equals("Kitchen")) {
    //                 String userSelect = user.userInput.nextLine();
    //                 if (userSelect.equals("Living Room")) {
    //                     System.out.println("You walk into the Living Room.");
    //                     user.currentLocation = "Living Room";
    //                 }
    //                 else if (userSelect.equals("Basement")) {
    //                     System.out.println("You walk into the Basement.");
    //                     user.currentLocation = "Basement";
    //                 }
    //             }
    //             else {
    //                 System.out.println("Sorry, that isn't a room you can move into.");
    //             }
    //     }
    // }

    
    //We have to fix this just to make sure player is actually moving to the correct rooms.
    public void moveThroughDoor(User user) {
        if (user.currentLocation.equals("Living Room")) {
            System.out.println("The door to the Bedroom or to the Kitchen? (Type 'Bedroom' or 'Kitchen' to choose.)");
            String userSelect = user.userInput.nextLine();

            if (userSelect.equals("Bedroom")) {
                System.out.println("You go through the door to the Bedroom.");
                user.currentLocation = "Bedroom";
                return;
            }
            else if (userSelect.equals("Kitchen")) {
                System.out.println("You walk into the Kitchen.");
                user.currentLocation = "Kitchen";
                return;
            }
        }

        else if (user.currentLocation.equals("Kitchen")) {
            System.out.println("The door to the Living Room or the Basement? (Type 'Living Room' or 'Basement' to choose.)");
            String userSelect = user.userInput.nextLine();

            if (userSelect.equals("Living Room")) {
                System.out.println("You go through the door to the Living Room.");
                user.currentLocation = "Living Room";
                return;
            }
            else if (userSelect.equals("Basement")) {
                System.out.println("You walk into the Basement.");
                user.currentLocation = "Basement";
                return;
            }
        }

        else if (user.currentLocation.equals("Basement")) {
            System.out.println("You open the door. You are now in the Kitchen.");
            user.currentLocation = "Kitchen";
            return;
        }
        
        else if (user.currentLocation.equals("Bedroom")) {
            System.out.println("The door to the Living Room or to the Study? (Type 'Living Room' or 'Study' to choose.)");
            user.currentLocation = "Bedroom";
            return;
        }
        
        else if (user.currentLocation.equals("Study")) {
            System.out.println("You open the door. You are now in the Bedroom.");
            user.currentLocation = "Study";
            return;
        }

    }

}
