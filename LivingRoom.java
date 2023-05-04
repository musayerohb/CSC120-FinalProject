import java.util.ArrayList;
import java.util.Hashtable;

public class LivingRoom extends House {
    public Hashtable<String, String> openableItems;
    public Hashtable<String, String> grabbableItems;
    public Hashtable<String, String> lookableItems;
    public ArrayList<String> adjacentRooms;

    public LivingRoom() {
        this.openableItems = new Hashtable<String, String>();
        this.lookableItems = new Hashtable<String, String>();
        this.grabbableItems = new Hashtable<String, String>();

        openableItems.put("door", "\nYou open the door.");
        lookableItems.put("couch", "\nYou look under both couches. Under the first couch closest to you is some lint and dust. Under the second couch is rusty old ratchet, and more lint and dust. The ratchet looks pretty past its time.");
        lookableItems.put("sofa", "\nYou look under the sofa to find dust, and a long sword. The sword looks rusty and a little bent out of shape. Definitely super old.");
        lookableItems.put("sofas", "\nYou look under the sofa to find dust, and a long sword. The sword looks rusty and a little bent out of shape. Definitely super old.");
        lookableItems.put("plant", "\nYou pick up the plant in the corner. There's nothing but flooring underneath it. You put it back down"); 
        lookableItems.put("carpet", "\nYou look under the carpet. There's a small navy blue flag with a yellow diamond. The diamond has the letters 'SC' on it. What a strange emblem for a kingdom.");
        grabbableItems.put("flag", "\nYou take the flag and put it inside your inventory.");
    }

}
    //We need to generalize this later so we don't have to rewrite it over and again.

        
    
    


