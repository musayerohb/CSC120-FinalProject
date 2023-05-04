import java.util.ArrayList;
import java.util.Hashtable;

public class Basement extends House {

    public Hashtable<String, String> openableItems;
    public Hashtable<String, String> grabbableItems;
    public Hashtable<String, String> lookableItems;
    public ArrayList<String> adjacentRooms;

    public Basement() {
        this.openableItems = new Hashtable<String, String>();
        this.lookableItems = new Hashtable<String, String>();
        this.grabbableItems = new Hashtable<String, String>();
        openableItems.put("door", "You open the door.");
        openableItems.put("barrel", "You open the barrel. There is a small plushie which appers to be of a monkey wearing a red tie with the letters 'DK' on it. It's very adorable!");
        openableItems.put("barrels", "You open the barrels. There is a small plushie which appers to be of a gorilla wearing a red tie with the letters 'DK' on it. It's very adorable!");
        openableItems.put("trunk", "You open the trunk. It's filled with random objects ranging from a red mushroom with red spots to a green turtle shell. You shiver as you spot a blue shell with small wings and spikes and you're not sure why.");
        grabbableItems.put("candle", "You take a candle from the wall. You blow it out before putting it inside your inventory so your pants don't catch on fire.");
        grabbableItems.put("shell", "You take the blue shell from the trunk. You feel bad for whoever ends up on the recieving end of this thing. You put it inside your inventory.");
    }
    
}
