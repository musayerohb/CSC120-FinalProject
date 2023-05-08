import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Hashtable;

/**
 * Initializes House class.
 */
public class House {
    
    public Hashtable<String, String> rooms;
    public String ringRoom;

    /**
     * The constructor for the House class. Creates an instance of the class with a variable that stores where the ring is located, and hashtable of the all the rooms in the house: the keys being the names of the rooms and the description being what the room looks like and contains. 
     */
    public House() {
        this.rooms = new Hashtable<String, String>();
            rooms.put("Kitchen", "When you look around, you see a wooden table in the center of the room. Four wooden stools surround it. There is a small pot sitting over an open fire against the wall to your right - the villager appears to be making soup. Wooden cabinets line the wall next to the table. There are two doors, one leading back to the living room and one to the basement.");
            rooms.put("Study", "When you look around, you see an ornate wooden desk pressed against the wall. Next to it, there is a large bookshelf with small drawers at the bottom of it. There's a door leading you back to the Bedroom.");
            rooms.put("Bedroom", "When you look around, you see a well-made bed with furry blankets on top. There's sunlight filtering through a window overlooking the village, and a door leading to the study or back downstairs to the living room.");
            rooms.put("Living Room", "When you look around, you see two small couches and one large sofa. There is a large carpet on the floor in the center of the room. There's a small plant tucked in the corner... it has a mouth.. and are those teeth? It looks pretty harmless though. There's also two doors, one leading upstairs to the bedroom and one to the kitchen.");
            rooms.put("Basement", "When you look around, you see 3 barrels standing up. There's also a large trunk pressed against the back wall. The floor is bare and the room is dark and lit up by some candles on the walls. There's a door leading back upstairs to the kitchen.");
        this.ringRoom = null;
    }
    
    /**
     * Selects what room the ring will be in. 
     */
    public void pickRoom() {
     Random random = new Random();
     ArrayList<String> listOfRooms = new ArrayList<>(Arrays.asList("Kitchen", "Study", "Bedroom", "Living Room", "Basement"));
     int picked_room = random.nextInt(listOfRooms.size());
     this.ringRoom = listOfRooms.get(picked_room);

    }

    /**
     * Places the ring in one of the rooms (selected by pickRoom()), by changing the hashtable values of the object the user can find the ring in/under in the room and adding the ring to the grabbableItems hashtable of said room.
     * @param LivingRoom An instance of the LivingRoom class
     * @param Kitchen An instance of the Kitchen class
     * @param Basement An instance of the Basement class
     * @param Bedroom An instance of the Bedroom class
     * @param Study An instance of the Study class
     */
    public void placeInRoom(LivingRoom LivingRoom, Kitchen Kitchen, Basement Basement, Bedroom Bedroom, Study Study) {
        if (this.ringRoom.equals("Living Room")) {
            LivingRoom.lookableItems.put("carpet", "You look under the carpet. There's a small navy blue flag with a yellow diamond. The diamond has the letters 'SC' on it. What a strange emblem for a kingdom. You lift the flag and you notice it was covering a small ring.");
            LivingRoom.grabbableItems.put("ring", "You grab the ring and put it in your inventory.");
        }
        else if (this.ringRoom.equals("Kitchen")) {
            Kitchen.openableItems.put("cabinet", "You open the cabinet. There's some plates and cups, as well as a spatula placed in front of them. You can make out some writing on the handle: 'I'm Ready! I'm Ready! I'm Ready!' Ready for what? As you ponder this question, you glance next to the spatula and spot a small ring.");
            Kitchen.openableItems.put("cabinets", "You open the cabinets. There's some plates and cups in most of them. In one of them, a spatula sits in front of some plates. You can make out some writing on the handle: 'I'm Ready! I'm Ready! I'm Ready!' Ready for what? As you ponder this question, you glance next to the spatula and spot a small ring.");
            Kitchen.grabbableItems.put("ring", "You grab the ring and put it in your inventory.");
        }
        else if (this.ringRoom.equals("Basement")) {
            Basement.openableItems.put("trunk", "You open the trunk. It's filled with random objects ranging from a red mushroom with red spots to a green turtle shell. You shiver as you spot a blue shell with small wings and spikes and you're not sure why. As you look deeper in the trunk, you spot a small ring.");
            Basement.grabbableItems.put("ring", "You grab the ring and put it in your inventory.");
        }
        else if (this.ringRoom.equals("Bedroom")) {
            Bedroom.lookableItems.put("bed", "You bend down and look under the bed. It's dark, but you can make out a small toy car lying on its side. Somehow, you can identify the model of the car: a 1967 Chevrolet Impala. You wonder where you've seen this car before. Next to it, you spot a small ring.");
            Bedroom.grabbableItems.put("ring", "You grab the ring and put it in your inventory.");
        }
        else if (this.ringRoom.equals("Study")) {
            Study.openableItems.put("drawer", "You open the drawer. There's a large hammer inside. As you try to grab it, you hear thunder outside. Is it supposed to rain soon? You catiously let go and search the rest of the drawer. After some searching, you spot a small ring.");
            Study.openableItems.put("drawers", "You open the drawers. There's a large hammer inside one of them. As you try to grab it, you hear thunder outside. Is it supposed to rain soon? You cautiously let go and search the rest of the drawers. After some searching, you spot a small ring.");
            Study.grabbableItems.put("ring", "You grab the ring and put it in your inventory.");
        }
    }
    
    /**
     * Sets the user's current location to the room they choose to move to from a predetermined selection of rooms adjacent to the one they're already in. Called whenever the user opens a door.
     * @param user This is keeping track of the player's current location. 
     */
    public void moveThroughDoor(User user) {
        if (user.currentLocation.equals("Living Room")) {
            System.out.println("\nThe door to the Bedroom or to the Kitchen? (Type 'Bedroom' or 'Kitchen' to choose.)");
            String userSelect = user.userInput.nextLine().toLowerCase();

            if (userSelect.equals("bedroom")) {
                System.out.println("\nYou go through the door to the bedroom.\n");
                user.currentLocation = "Bedroom";
                return;
            }
            else if (userSelect.equals("kitchen")) {
                System.out.println("\nYou walk into the kitchen.\n");
                user.currentLocation = "Kitchen";
                return;
            }
            else {
                System.out.println("\nInvalid room. Open the door again and type which room you want to enter exactly as the prompt says.\n");
            }
        }

        else if (user.currentLocation.equals("Kitchen")) {
            System.out.println("\nThe door to the Living Room or the Basement? (Type 'Living Room' or 'Basement' to choose.)");
            String userSelect = user.userInput.nextLine().toLowerCase();

            if (userSelect.equals("living room")) {
                System.out.println("\nYou go through the door to the Living Room.\n");
                user.currentLocation = "Living Room";
                return;
            }
            else if (userSelect.equals("basement")) {
                System.out.println("\nYou walk into the basement.\n");
                user.currentLocation = "Basement";
                return;
            }
            else {
                System.out.println("\nInvalid room. Open the door again and type which room you want to enter exactly as the prompt says.\n");
            }
        }

        else if (user.currentLocation.equals("Basement")) {
            System.out.println("\nYou open the door. You are now in the Kitchen.\n");
            user.currentLocation = "Kitchen";
            return;
        }
        
        else if (user.currentLocation.equals("Bedroom")) {
            System.out.println("\nThe door to the Living Room or to the Study? (Type 'Living Room' or 'Study' to choose.)");
            String userSelect = user.userInput.nextLine().toLowerCase();

            if (userSelect.equals("living room")) {
                System.out.println("\nYou go through the door to the Living Room.\n");
                user.currentLocation = "Living Room";
                return;
            }
            else if (userSelect.equals("study")) {
                System.out.println("\nYou walk into the Study.\n");
                user.currentLocation = "Study";
                return;
            }
            else {
                System.out.println("\nInvalid room. Open the door again and type which room you want to enter exactly as the prompt says.\n");
            }
        }
        
        else if (user.currentLocation.equals("Study")) {
            System.out.println("\nYou open the door. You are now in the bedroom.\n");
            user.currentLocation = "Bedroom";
            return;
        }
    }
}
