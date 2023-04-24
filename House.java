import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class House {
    public int nFloors;
    protected int activeFloor = 1;
    public ArrayList<String> rooms;

    public House() {
        this.nFloors = 2;
        this.activeFloor = 10;
        this.rooms = new ArrayList<String>(Arrays.asList("Kitchen", "Study", "Bedroom", "Living Room", "Basement"));
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
