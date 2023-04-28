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
    // checks first what room the player is in for the correct hashtable
    // for loop to run through user response
    // if i is an item in the lookable items list, break the loop and print out the hashtable value of that item.
    // if it isn't an item in the list, it returns a print statement saying something like "You can't look under there."
    public void lookUnder(String[] words, LivingRoom LivingRoom, Basement Basement, Study Study, Kitchen Kitchen, Bedroom Bedroom) {
        int i = 0;
        if (this.currentLocation.equals("Living Room")) {
            for (i = 0; i < words.length; i++) {
                if (LivingRoom.lookableItems.contains(words[i])) {
                    break;
                }
                else {
                    boolean commandContainsItem = false;
                    System.out.println("");
                }
            }
            System.out.println(LivingRoom.lookableItems.get(words[i]));
        }
        
        else if (this.currentLocation.equals("Kitchen")) {
            for (i = 0; i < words.length; i++) {
                if (Kitchen.lookableItems.contains(i)) {
                    System.out.println(Kitchen.lookableItems.get(words[i]));
                }
                else {
                    System.out.println("This item cannot be looked at!");
                }
            }    
        }                 

        else if (this.currentLocation.equals("Study")) {
            for (i = 0; i < words.length; i++) {
                if (Study.lookableItems.contains(words[i])) {
                    System.out.println(Study.lookableItems.get(i));
                }
            }    
        }  

        else if (this.currentLocation.equals("Bedroom")) {
            for (i = 0; i < words.length; i++) {
                if (Bedroom.lookableItems.contains(i)) {
                    System.out.println(Bedroom.lookableItems.get(words[i]));
                }
                else {
                    System.out.println("This item cannot be looked at!");
                }
            }    
        }  
        
        if (this.currentLocation.equals("Basement")) {
            for (i = 0; i < words.length; i++) {
                if (Basement.lookableItems.contains(words[i])) {
                    System.out.println(Basement.lookableItems.get(i));
                }
                else {
                    System.out.println("This item cannot be looked at!");
                }
            }    
        }          

    }
    
    public void open() {
        //check if user is in the room where the object is first.
        //room has a list of objects based on descriptions.
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
            System.out.println(House.rooms.get("Living Room"));
        } 
        else if (this.currentLocation.equals("Kitchen")) {
            System.out.println(House.rooms.get("Kitchen"));
        }
        else if (this.currentLocation.equals("Basement")) {
            System.out.println(House.rooms.get("Basement"));
        }
        else if (this.currentLocation.equals("Study")) {
            System.out.println(House.rooms.get("Study"));
        }
        else if (this.currentLocation.equals("Bedroom")) {
            System.out.println(House.rooms.get("Bedroom"));  
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

    public void playGame(House House, LivingRoom LivingRoom, Basement Basement, Study Study, Kitchen Kitchen, Bedroom Bedroom) {
        while (true) {
            String userPlay = userInput.nextLine();

            //System.out.println(userPlay);
            userPlay.toLowerCase();
            String[] words = userPlay.split(" ");

            if (words[0].equals("look")) {
                if (words[1].equals("around")) {
                    lookAround(House);
                }
                else if (words[1].equals("under")) {
                    lookUnder(words, LivingRoom, Basement, Study, Kitchen, Bedroom);
                }
            }
        }
        
        // if (userPlay.contains("lookaround")) {
        //     lookAround(House);
        // }
        // else if (userPlay.contains("open")) {
        //     open();
        // }
        // else if (userPlay.contains("look under")) {
        //     lookUnder();
        // };
    }


    
    


    public static void main(String[] args) {
        User user = new User();
        Scanner userInput = new Scanner(System.in);
        Villager villager = new Villager(); 
        House House = new House();
        LivingRoom LivingRoom = new LivingRoom();
        Study Study = new Study();
        Kitchen Kitchen = new Kitchen();
        Bedroom Bedroom = new Bedroom();
        Basement Basement = new Basement();


        System.out.println("Welcome to (TITLE TBD)!");
        System.out.println("Ready to start your adventure? Enter 'yes' or 'no' to begin!");
        user.startGame(userInput.nextLine());

        villager.Villager_conversation(userInput, user);
        user.playGame(House, LivingRoom, Basement, Study, Kitchen, Bedroom);
        


    }



}
