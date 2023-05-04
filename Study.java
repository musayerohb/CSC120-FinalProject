import java.util.ArrayList;
import java.util.Hashtable;

public class Study extends House {
    public Hashtable<String, String> openableItems;
    public Hashtable<String, String> grabbableItems;
    public Hashtable<String, String> lookableItems;
    public ArrayList<String> adjacentRooms;

    public Study() {
        this.openableItems = new Hashtable<String, String>();
        this.lookableItems = new Hashtable<String, String>();
        this.grabbableItems = new Hashtable<String, String>();
        lookableItems.put("desk", "\nYou look under the desk to find some scattered papers and a pen.");
        lookableItems.put("bookshelf", "\nYou look under the bookshelf. You see a bunch of bottle caps covered in dust. They seem pretty useless.");
        openableItems.put("drawer", "\nYou open the drawer. There's a large hammer inside. As you try to grab it, you hear thunder outside. Is it supposed to rain soon? You cautiously let go.");
        openableItems.put("drawers", "\nYou open the drawers. There's a large hammer inside one of them. As you try to grab it, you hear thunder outside. Is it supposed to rain soon? You cautiously let go.");
        openableItems.put("desk", "\nYou open the desk. Inside, there's a small book with the title, 'Coding Text-based Adventure Games for Dummies'. You don't bother considering what a book about coding is doing in a medieval world and choose to just accept the joke and move on.");
        openableItems.put("door", "\nYou open the door.");
        openableItems.put("papers", "\nUm, don't know why you'd need that, but yeah, you grab the papers and put them in your inventory.");
        openableItems.put("paper", "\nUm, don't know why you'd need that, but yeah, you grab the papers and put them in your inventory.");
        openableItems.put("pen", "\nJust in case you need to write on something later, you grab the pen and put it in your inventory.");
        grabbableItems.put("hammer", "\nAgsinst your better judgement, you pick up the hammer and put it inside your inventory. You silently pray that it doesn't electrocute you.");
    }
    
}