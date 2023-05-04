import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Hashtable;

public class House {
    public Hashtable<String, String> rooms;
    public String ring_room;

    public House() {
        this.rooms = new Hashtable<String, String>();
            rooms.put("Kitchen", "When you look around, you see a wooden table in the center of the room. Four wooden stools surround it. There is a small pot sitting over an open fire against the wall directly in front of you - the villager appears to be making soup. Wooden cabinets line the walls. There are two doors, one leading back to the living room and one to the basement.");
            rooms.put("Study", "When you look around, you see an ornate wooden desk pressed against the wall. Next to it, there is a large bookshelf with small drawers at the bottom of it. There's a door leading you back to the Bedroom.");
            rooms.put("Bedroom", "When you look around, you see a well-made bed with furry blankets on top. There's sunlight filtering through a window overlooking the village, and a door leading to the study or back downstairs to the living room.");
            rooms.put("Living Room", "When you look around, you see two couches and a large sofa. There is a large carpet on the floor in the center of the room. There's a small plant tucked in the corner... it has a mouth.. and are those teeth? It looks pretty harmless though. There's also two doors, one leading upstairs to the bedroom and one to the kitchen.");
            rooms.put("Basement", "When you look around, you see 3 barrels standing up. There's a large trunk on the left side of the room. The floor is bare and the room is dark and lit up by some candles on the walls. There's a door leading back upstairs to the kitchen.");
        this.ring_room = null;
    }
    
    //this part isn't working...
    public void pickRoom() {
     Random random = new Random();
     ArrayList<String> listOfRooms = new ArrayList<>(Arrays.asList("Kitchen", "Study", "Bedroom", "Living Room", "Basement"));
     int picked_room = random.nextInt(listOfRooms.size());
     this.ring_room = listOfRooms.get(picked_room);
     //ring_room = picked_room;
     //System.out.println(picked_room);
     //System.out.println(this.rooms.getKey(picked_room));
     //this.ring_room = this.rooms.get(picked_room);

    }

    public void placeInRoom(LivingRoom LivingRoom, Kitchen Kitchen, Basement Basement, Bedroom Bedroom, Study Study) {
        if (this.ring_room.equals("Living Room")) {
            LivingRoom.lookableItems.put("carpet", "You look under the carpet. There's a small navy blue flag with a yellow diamond. The diamond has the letters 'SC' on it. What a strange emblem for a kingdom. You lift the flag and you notice it was covering a small ring.");
            LivingRoom.grabbableItems.put("ring", "You grab the ring and put it in your inventory.");
        }
        else if (this.ring_room.equals("Kitchen")) {
            Kitchen.openableItems.put("cabinet", "You open the cabinet. There's some plates and cups, as well as a spatula placed in front of them. You can make out some writing on the handle: 'I'm Ready! I'm Ready! I'm Ready!' Ready for what? As you ponder this question, you glance next to the spatula and spot a small ring.");
            Kitchen.openableItems.put("cabinets", "You open the cabinets. There's some plates and cups in most of them. In one of them, a spatula sits in front of some plates. You can make out some writing on the handle: 'I'm Ready! I'm Ready! I'm Ready!' Ready for what? As you ponder this question, you glance next to the spatula and spot a small ring.");
            Kitchen.grabbableItems.put("ring", "You grab the ring and put it in your inventory.");
        }
        else if (this.ring_room.equals("Basement")) {
            Basement.openableItems.put("trunk", "You open the trunk. It's filled with random objects ranging from a red mushroom with red spots to a green turtle shell. You shiver as you spot a blue shell with small wings and spikes and you're not sure why. As you look deeper in the trunk, you spot a small ring.");
            Basement.grabbableItems.put("ring", "You grab the ring and put it in your inventory.");
        }
        else if (this.ring_room.equals("Bedroom")) {
            Bedroom.lookableItems.put("bed", "You bend down and look under the bed. It's dark, but you can make out a small toy car lying on its side. Somehow, you can identify the model of the car: a 1967 Chevrolet Impala. You wonder where you've seen this car before. Next to it, you spot a small ring.");
            Bedroom.grabbableItems.put("ring", "You grab the ring and put it in your inventory.");
        }
        else if (this.ring_room.equals("Study")) {
            Study.openableItems.put("drawer", "You open the drawer. There's a large hammer inside. As you try to grab it, you hear thunder outside. Is it supposed to rain soon? You catiously let go and search the rest of the drawer. After some searching, you spot a small ring.");
            Study.openableItems.put("drawers", "You open the drawers. There's a large hammer inside one of them. As you try to grab it, you hear thunder outside. Is it supposed to rain soon? You cautiously let go and search the rest of the drawers. After some searching, you spot a small ring.");
            Study.grabbableItems.put("ring", "You grab the ring and put it in your inventory.");
        }
    }
    

    public void moveThroughDoor(User user) {
        if (user.currentLocation.equals("Living Room")) {
            System.out.println("\nThe door to the Bedroom or to the Kitchen? (Type 'Bedroom' or 'Kitchen' to choose.)");
            String userSelect = user.userInput.nextLine();

            if (userSelect.equals("Bedroom")) {
                System.out.println("\nYou go through the door to the Bedroom.");
                user.currentLocation = "Bedroom";
                return;
            }
            else if (userSelect.equals("Kitchen")) {
                System.out.println("\nYou walk into the Kitchen.");
                user.currentLocation = "Kitchen";
                return;
            }
            else {
                System.out.println("\nInvalid room. Open the door again and type which room you want to enter exactly as the prompt says.\n");
            }
        }

        else if (user.currentLocation.equals("Kitchen")) {
            System.out.println("\nThe door to the Living Room or the Basement? (Type 'Living Room' or 'Basement' to choose.)\n");
            String userSelect = user.userInput.nextLine();

            if (userSelect.equals("Living Room")) {
                System.out.println("\nYou go through the door to the Living Room.");
                user.currentLocation = "Living Room";
                return;
            }
            else if (userSelect.equals("Basement")) {
                System.out.println("\nYou walk into the Basement.");
                user.currentLocation = "Basement";
                return;
            }
            else {
                System.out.println("\nInvalid room. Open the door again and type which room you want to enter exactly as the prompt says.\n");
            }
        }

        else if (user.currentLocation.equals("Basement")) {
            System.out.println("\nYou open the door. You are now in the Kitchen.");
            user.currentLocation = "Kitchen";
            return;
        }
        
        else if (user.currentLocation.equals("Bedroom")) {
            System.out.println("\nThe door to the Living Room or to the Study? (Type 'Living Room' or 'Study' to choose.)");
            String userSelect = user.userInput.nextLine();

            if (userSelect.equals("Living Room")) {
                System.out.println("\nYou go through the door to the Living Room.");
                user.currentLocation = "Living Room";
                return;
            }
            else if (userSelect.equals("Study")) {
                System.out.println("\nYou walk into the Study.");
                user.currentLocation = "Study";
                return;
            }
            else {
                System.out.println("\nInvalid room. Open the door again and type which room you want to enter exactly as the prompt says.\n");
            }
        }
        
        else if (user.currentLocation.equals("Study")) {
            System.out.println("\nYou open the door. You are now in the Bedroom.");
            user.currentLocation = "Bedroom";
            return;
        }

    }

}
