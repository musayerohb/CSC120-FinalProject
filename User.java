import java.util.Scanner;
import java.util.ArrayList;
import java.util.Hashtable;

public class User {

    public int reputation;
    public int health;
    public ArrayList<String> inventory;
    public String currentLocation;
    public Scanner userInput = new Scanner(System.in); //uhh,, i remove this and the code breaks in other places. Why? 

    public User() {
        this.reputation = 0;
        this.health = 10;
        this.inventory = new ArrayList<String>();
        this.currentLocation = "Village";

    }

    //For functionality
    public String checkLocation() {
        return currentLocation;
    }

    public int changeReputation(int amount) {
        return this.reputation = this.reputation + amount;
    
    }

    // public void checkCommandEntered(String userPlay) {

    // };

    //Player Commands
    public void lookUnder() {
       Hashtable<String, String> lookable_items = new Hashtable<String, String>();
       lookable_items.put("carpet", "You look under the carpet.");
       lookable_items.put("table", "You look under the table.");

    }
    
    public void open() {
        //check if user is in the room where the object is first.
        //room has a list of objects based on descriptions
        //grabs object 'key' value, which is the description of whats inside the object, and prints it out.
        //checks where ring is through a boolean statement after each 'open' interaction.
        Hashtable<String, String> openable_items = new Hashtable<String, String>();
        openable_items.put("cabinet", "You open the cabinet.");
        openable_items.put("door", "You open the door.");
        openable_items.put("drawer", "You open the drawer.");
        openable_items.put("cabinets", "You open the cabinets.");
        openable_items.put("doors", "You open the doors.");
        openable_items.put("drawers", "You open the drawers.");
        openable_items.put("barrel", "You open the barrel.");
        openable_items.put("barrels", "You open the barrels.");
    }

    public void lookAround(House House) {
        if (this.currentLocation.equals("Living Room")) {
            House.rooms.get("Living Room");
        } 
        else if (this.currentLocation.equals("Kitchen")) {
            House.rooms.get("Kitchen");
        }
        else if (this.currentLocation.equals("Basement")) {
            House.rooms.get("Basement");
        }
        else if (this.currentLocation.equals("Study")) {
            House.rooms.get("Study");  
        }
        else if (this.currentLocation.equals("Bedroom")) {
            House.rooms.get("Bedroom");    
        }
    }
    
    public void take() {
        
    }
    

    //Game functions
    public void startGame(String userChoice) {
        if (userChoice.equals("Yes") || userChoice.equals("yes")) {
            System.out.println("Game has begun!");
        }
        else if (userChoice.equals("No") || userChoice.equals("no")) {
            System.out.println("Oh, well that stinks. Bye then.");
            return;
        }
        else {
            System.out.println("Invalid choice.");
        }
    }

    public void playGame(House House) {
        String userPlay = userInput.nextLine();

        //System.out.println(userPlay);
        userPlay.toLowerCase();
        String[] userPlayList = userPlay.split(" ");
        
            for (int i = 0; i < userPlayList.length; i++){
                int nextWord = i+1;
                if (userPlayList[i].equals("look")) {
                    if (userPlayList[nextWord].equals("around")) {
                        lookAround(House);
                    }
                    else if (userPlayList[nextWord].equals("under")) {
                        lookUnder();
                    }

                }
            };

        
        if (userPlay.contains("lookaround")) {
            lookAround(House);
        }
        else if (userPlay.contains("open")) {
            open();
        }
        else if (userPlay.contains("look under")) {
            lookUnder();
        };
    }


    
    


    public static void main(String[] args) {
        User user = new User();
        Scanner userInput = new Scanner(System.in);
        Villager villager = new Villager(); 
        House House = new House();


        System.out.println("Welcome to (TITLE TBD)!");
        System.out.println("Ready to start your adventure? Enter 'yes' or 'no' to begin!");
        user.startGame(userInput.nextLine());

        villager.Villager_conversation(userInput, user);
        user.playGame(House);
        


    }



}
