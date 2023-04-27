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
            rooms.put("Kitchen", "When you look around, you see a wooden table in the center of the room. Four wooden stools surround it. There is a small pot sitting over an open fire against the wall directly in front of you - the villager appears to be making soup. Wooden cabinets line the walls.");
            rooms.put("Study", "When you look around, you see an ornate wooden desk pressed against the wall. Next to it, there is a large bookshelf with small drawers at the bottom of it.");
            rooms.put("Bedroom", "When you look around, you see a well-made bed with furry blankets on top. There's sunlight filtering through a window overlooking the village.");
            rooms.put("Living Room", "When you look around, you see two couches and a large sofa. There is a large carpet on the floor in the center of the room.");
            rooms.put("Basement", "When you look around, you see 3 barrels standing up. The floor is bare and the room is dark and lit up by some candles on the walls.");
    }
    
    // Thinking about this one. Because what if it picks the basement as a room and then the 2nd floor?
    // public int pick_floor() {
    //     Random ring_floor = new Random();
    //     return ring_floor.nextInt(nFloors);
    // }
            
    public String pick_room() {
     Random random = new Random();

     int picked_room = random.nextInt(this.rooms.size());
     String ring_room = this.rooms.get(picked_room);
     return ring_room;

    }
    
    public static void main(String[] args) {
        House villagerHouse = new House();
        System.out.println(villagerHouse.rooms.toString());
        System.out.println(villagerHouse.pick_room());
    }
}
