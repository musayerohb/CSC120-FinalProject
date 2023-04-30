import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
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
    public void lookUnder(ArrayList<String> wordsList, LivingRoom LivingRoom, Basement Basement, Study Study, Kitchen Kitchen, Bedroom Bedroom) {
        int i = 0;

        if (this.currentLocation.equals("Living Room")) {
            if (LivingRoom.lookableItems.containsKey(wordsList.get(i))) {
                System.out.println(LivingRoom.lookableItems.get(wordsList.get(i)));
            }
            else { 
                System.out.println("This item doesn't exist in the room.");
            }
        }
    
        if (this.currentLocation.equals("Kitchen")) {
            if (Kitchen.lookableItems.containsKey(wordsList.get(i))) {
                System.out.println(Kitchen.lookableItems.get(wordsList.get(i)));
            }
            else { 
                System.out.println("This item doesn't exist in the room.");
                }
            }
   
        if (this.currentLocation.equals("Study")) {
            if (Study.lookableItems.containsKey(wordsList.get(i))) {
                System.out.println(Study.lookableItems.get(wordsList.get(i)));
            }
            else { 
                System.out.println("This item doesn't exist in the room.");
                }
            }

        if (this.currentLocation.equals("Bedroom")) {
            if (Bedroom.lookableItems.containsKey(wordsList.get(i))) {
                System.out.println(Bedroom.lookableItems.get(wordsList.get(i)));
            }
            else { 
                System.out.println("This item doesn't exist in the room.");
                }
            }
        
        if (this.currentLocation.equals("Basement")) {
            if (Basement.lookableItems.containsKey(wordsList.get(i))) {
                System.out.println(Basement.lookableItems.get(wordsList.get(i)));
            }
            else { 
                System.out.println("This item doesn't exist in the room.");
                }
            }
        }

    
    public void open(House House, ArrayList<String> wordsList, LivingRoom LivingRoom, Basement Basement, Study Study, Kitchen Kitchen, Bedroom Bedroom) {
        //check if user is in the room where the object is first.
        //room has a list of objects based on descriptions.
        //grabs object 'key' value, which is the description of whats inside the object, and prints it out.
        //checks where ring is through a boolean statement after each 'open' interaction.

        int i = 0;
        if (this.currentLocation.equals("Living Room")) {
            if (wordsList.get(i).equals("door")) {
                House.moveThroughDoor(this);
                return;
            }
            else if (LivingRoom.openableItems.containsKey(wordsList.get(i))) {
                System.out.println(LivingRoom.openableItems.get(wordsList.get(i)));
            }
            else { 
                System.out.println("This item doesn't exist in the room.");
            }
        }
    
        if (this.currentLocation.equals("Kitchen")) {
            if (wordsList.get(i).equals("door")) {
                House.moveThroughDoor(this);
                return;
            }
            else if (Kitchen.openableItems.containsKey(wordsList.get(i))) {
                System.out.println(Kitchen.openableItems.get(wordsList.get(i)));
            }
            else { 
                System.out.println("This item doesn't exist in the room.");
                }
            }
   
        if (this.currentLocation.equals("Study")) {
            if (wordsList.get(i).equals("door")) {
                House.moveThroughDoor(this);
                return;
            }
            else if (Study.openableItems.containsKey(wordsList.get(i))) {
                System.out.println(Study.openableItems.get(wordsList.get(i)));
            }
            else { 
                System.out.println("This item doesn't exist in the room.");
                }
            }

        if (this.currentLocation.equals("Bedroom")) {
            if (wordsList.get(i).equals("door")) {
                House.moveThroughDoor(this);
                return;
            }
            else if (Bedroom.openableItems.containsKey(wordsList.get(i))) {
                System.out.println(Bedroom.openableItems.get(wordsList.get(i)));
            }
            else { 
                System.out.println("This item doesn't exist in the room.");
                }
            }
        
        if (this.currentLocation.equals("Basement")) {
            if (wordsList.get(i).equals("door")) {
                House.moveThroughDoor(this);
                return;
            }
            else if (Basement.openableItems.containsKey(wordsList.get(i))) {
                System.out.println(Basement.openableItems.get(wordsList.get(i)));
            }
            else { 
                System.out.println("This item doesn't exist in the room.");
                }
            }
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
    
    public void take(ArrayList<String> wordsList, LivingRoom LivingRoom, Basement Basement, Study Study, Kitchen Kitchen, Bedroom Bedroom) {
        int i = 0;
        if (this.currentLocation.equals("Living Room")) {
            if (LivingRoom.grabbableItems.containsKey(wordsList.get(i))) {
                System.out.println(LivingRoom.grabbableItems.get(wordsList.get(i)));
                this.inventory.add(wordsList.get(i));
            }
            else { 
                System.out.println("This item doesn't exist in the room.");
            }
        }
        
        if (this.currentLocation.equals("Kitchen")) {
            if (Kitchen.grabbableItems.containsKey(wordsList.get(i))) {
                System.out.println(Kitchen.grabbableItems.get(wordsList.get(i)));
                this.inventory.add(wordsList.get(i));
            }
            else { 
                System.out.println("This item doesn't exist in the room.");
            }
        }

        if (this.currentLocation.equals("Study")) {
            if (Study.grabbableItems.containsKey(wordsList.get(i))) {
                System.out.println(Study.grabbableItems.get(wordsList.get(i)));
                this.inventory.add(wordsList.get(i));
            }
            else { 
                System.out.println("This item doesn't exist in the room.");
            }
        }

        if (this.currentLocation.equals("Bedroom")) {
            if (Basement.grabbableItems.containsKey(wordsList.get(i))) {
                System.out.println(Bedroom.grabbableItems.get(wordsList.get(i)));
                this.inventory.add(wordsList.get(i));
            }
            else { 
                System.out.println("This item doesn't exist in the room.");
            }
        }
        
        if (this.currentLocation.equals("Basement")) {
            if (Basement.grabbableItems.containsKey(wordsList.get(i))) {
                System.out.println(Basement.grabbableItems.get(wordsList.get(i)));
                this.inventory.add(wordsList.get(i));
            }
            else {
                System.out.println("This item doesn't exist in the room.");
            }
        }
        

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
            
            userPlay.toLowerCase();
            String[] words = userPlay.split(" ");

            ArrayList<String> wordsList = new ArrayList<String>(Arrays.asList(words));
            System.out.println(wordsList.toString());

            if (words[0].equals("look")) {
                if (words[1].equals("around")) {
                    lookAround(House);
                }
                else if (words[1].equals("under")) {
                    wordsList.remove("look");
                    wordsList.remove("under");
                    System.out.println(wordsList.toString());

                    lookUnder(wordsList, LivingRoom, Basement, Study, Kitchen, Bedroom);
                    //System.out.println(lookUnder("couch"));
                }
                else {
                    System.out.println("Invalid command, you can only 'look under' objects or 'look around' the room.");
                }
            }
            
            else if (words[0].equals("open")) {
                wordsList.remove("open");
                open(House, wordsList, LivingRoom, Basement, Study, Kitchen, Bedroom);
            }

            else if (words[0].equals("grab") || words[0].equals("take")) {
                wordsList.remove("grab");
                wordsList.remove("take");
                take(wordsList, LivingRoom, Basement, Study, Kitchen, Bedroom);
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
