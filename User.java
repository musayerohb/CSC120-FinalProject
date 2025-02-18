import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

/**
 * Initializes User class.
 */
public class User {

    public ArrayList<String> inventory;
    public String currentLocation;
    public Scanner userInput = new Scanner(System.in);
    public Hashtable <String, String> usableItems;

    /**
     * The constructor for the User class. Creates an instance of the user class with a hashtable of items the player can use.
     */
    public User() {
        this.inventory = new ArrayList<String>();
        this.currentLocation = "Village";
        this.usableItems = new Hashtable<String, String>();

        usableItems.put("shell", "You throw the blue shell at the bandits. They instantly recognize the item and begin to run away. But you cannot outrun a blue shell. It approaches them and drops down before exploding, sending them blasting off into the sky.");
        usableItems.put("spatula", "You pull out the spatula, and next thing you know, you're cooking up a delicious Krabby Patty! You hand them to the bandits, who are initially skeptical. After taking a single bite, the two of them are flabbergasted by how delicious it is and decide to let you leave peacefully.");
        usableItems.put("flag", "You take out the flag and begin haphazardly waving it around. One of the bandits seems to recognize the flag and says, 'Wait, are you a Smithie? My great great great grandfather went to UMass! I could never rob a fellow Five College student. Please, forgive us.' The bandits move to the side to let you pass.");
        usableItems.put("hammer", "You nervously glance at the hammer but decide to try using it. You groan as you lift the hammer up. The bandits seem to stifle a laugh as you visibly struggle. Suddenly, a loud boom is heard as lightning strikes the hammer. The bandits are terrified and run away. You slowly and carefully put down the hammer and walk away slowly.");
        usableItems.put("car", "You throw the car at the bandits. It smacks one of them on the head. They are furious at first but then realize that the car is from the show 'Supernatural'. It turns out they are huge fans, and you manage to sneak past them as they begin to talk about the show to each other.");
        usableItems.put("ring", "In a moment of desperation, you take out the ring and place it on your finger. Not a second later you pass out, overwhelmed by the power. Eventually you wake up and the ring is gone, along with the rest of your belongings. A small note is in front of you. It reads: 'Maybe it isn't the best idea to put on a magical ring you know nothing about. Get robbed! Sincerely, the Bandit Bros.'");
        usableItems.put("sword", "You take out the rusty sword, and immediately use it on one of the bandits. It breaks immediately on impact, but the bandits are stunned enough that you throw what's left of the sword and run away before they can do anything else.");
        usableItems.put("plant", "You take out the plant (how did you fit that in your pocket?) and watch it suddenly come to life! It immediately lunges towards the first bandit and bites him. He screams, and they're too distracted to see you running away with the ring.");
        usableItems.put("paper", "You take out the paper, unsure what to really do with it. In a moment of sudden inspiration, you throw the paper and run away as fast as you can. The bandits are so confused that they don't even bother chasing after you.");
        usableItems.put("papers", "You take out the paper, unsure what to really do with it. In a moment of sudden inspiration, you throw the paper and run away as fast as you can. The bandits are so confused that they don't even bother chasing after you.");
        usableItems.put("pen", "You take out the pen and begin to write a series of numbers, letters, and small designs on some paper. The bandits are confused and slowly approach you. You hold out your drawing. It's a fake currency you just made up, which you're offering in exchange for letting you keep the ring. Amazingly, they take it and stare at this interesting new method of payment as you quietly walk away with the ring.");
        usableItems.put("candle", "You take out the unlit candle. You don't have a way to light it, but you notice that it appears to be scented. You walk up to the bandits and invite them to smell the candle. They take it and smell it, noticing that the smell is very nice. You sneak away with the ring as they continue to sniff the candle, totally distracted.");
    }


    /**
     * Allows the user to look underneath different items depending on the room and if they are listed in the lookableItems hashtable.
     * @param wordsList An arrayList containing the item that the player wants to look under. 
     * @param LivingRoom An instance of the LivingRoom class.
     * @param Basement An instance of the Basement class.
     * @param Study An instance of the Study class.
     * @param Kitchen An instance of the Kitchen class.
     * @param Bedroom An instance of the Bedroom class.
     */    
    public void lookUnder(ArrayList<String> wordsList, LivingRoom LivingRoom, Basement Basement, Study Study, Kitchen Kitchen, Bedroom Bedroom) {
        int i = 0;
        if (wordsList.isEmpty()) {
            System.out.println("\nYou haven't entered in an item to look under. Type 'look under' and then the item you want to look under to complete this command.\n");
            return;
        }
        else if (this.currentLocation.equals("Living Room")) {
            if (LivingRoom.lookableItems.containsKey(wordsList.get(i))) {
                System.out.println("\n" + LivingRoom.lookableItems.get(wordsList.get(i)) + "\n");
            }
            else { 
                System.out.println("\nThis item doesn't exist in the room or if it does, you cannot perform this action on it.\n");
            }
        }
        
        if (this.currentLocation.equals("Kitchen")) {
            if (Kitchen.lookableItems.containsKey(wordsList.get(i))) {
                System.out.println("\n" + Kitchen.lookableItems.get(wordsList.get(i)) + "\n");
            }
            else { 
                System.out.println("\nThis item doesn't exist in the room or if it does, you cannot perform this action on it.\n");
            }
        }
   
        if (this.currentLocation.equals("Study")) {
            if (Study.lookableItems.containsKey(wordsList.get(i))) {
                System.out.println("\n" + Study.lookableItems.get(wordsList.get(i)) + "\n");
            }
            else { 
                System.out.println("\nThis item doesn't exist in the room or if it does, you cannot perform this action on it.\n");
            }
        }

        if (this.currentLocation.equals("Bedroom")) {
            if (Bedroom.lookableItems.containsKey(wordsList.get(i))) {
                System.out.println("\n" + Bedroom.lookableItems.get(wordsList.get(i)) + "\n");
            }
            else { 
                System.out.println("\nThis item doesn't exist in the room or if it does, you cannot perform this action on it.\n");
            }
        }
        
        if (this.currentLocation.equals("Basement")) {
            if (Basement.lookableItems.containsKey(wordsList.get(i))) {
                System.out.println("\n" + Basement.lookableItems.get(wordsList.get(i)) + "\n");
            }
            else { 
                System.out.println("\nThis item doesn't exist in the room or if it does, you cannot perform this action on it.\n");
            }
        }
    }

    /**
     * Allows the user to open different items depending on the room and if they are listed in the openableItems hashtable.
     * @param House An instance of the House class. 
     * @param wordsList An arrayList containing the item that the player wants to open. 
     * @param LivingRoom An instance of the LivingRoom class.
     * @param Basement An instance of the Basement class.
     * @param Study An instance of the Study class.
     * @param Kitchen An instance of the Kitchen class.
     * @param Bedroom An instance of the Bedroom class.
     */
    public void open(House House, ArrayList<String> wordsList, LivingRoom LivingRoom, Basement Basement, Study Study, Kitchen Kitchen, Bedroom Bedroom) {
        int i = 0;
        if (wordsList.isEmpty()) {
            System.out.println("\nYou haven't entered in an item to open. Type 'look under' and then the item you want to open to complete this command.\n");
            return;
        }
        
        if (this.currentLocation.equals("Living Room")) {
            if (wordsList.get(i).equals("door")) {
                House.moveThroughDoor(this);
                return;
            }
            else if (LivingRoom.openableItems.containsKey(wordsList.get(i))) {
                System.out.println("\n" + LivingRoom.openableItems.get(wordsList.get(i)) + "\n");
            }
            else { 
                System.out.println("\nThis item doesn't exist in the room or if it does, you cannot perform this action on it.\n");
            }
        }

        if (this.currentLocation.equals("Kitchen")) {
            if (wordsList.get(i).equals("door")) {
                House.moveThroughDoor(this);
                return;
            }
            else if (Kitchen.openableItems.containsKey(wordsList.get(i))) {
                System.out.println("\n" + Kitchen.openableItems.get(wordsList.get(i)) + "\n");
            }
            else { 
                System.out.println("\nThis item doesn't exist in the room or if it does, you cannot perform this action on it.\n");
            }
            
        }

        if (this.currentLocation.equals("Study")) {
            if (wordsList.get(i).equals("door")) {
                House.moveThroughDoor(this);
                return;
            }
            else if (Study.openableItems.containsKey(wordsList.get(i))) {
                System.out.println("\n" + Study.openableItems.get(wordsList.get(i)) + "\n");
            }
            else { 
                System.out.println("\nThis item doesn't exist in the room or if it does, you cannot perform this action on it.\n");
            }
        }

        if (this.currentLocation.equals("Bedroom")) {
            if (wordsList.get(i).equals("door")) {
                House.moveThroughDoor(this);
                return;
            }
            else if (Bedroom.openableItems.containsKey(wordsList.get(i))) {
                System.out.println("\n" + Bedroom.openableItems.get(wordsList.get(i)) + "\n");
            }
            else { 
                System.out.println("\nThis item doesn't exist in the room or if it does, you cannot perform this action on it.\n");
            }
        }
        
        if (this.currentLocation.equals("Basement")) {
            if (wordsList.get(i).equals("door")) {
                House.moveThroughDoor(this);
                return;
            }
            else if (Basement.openableItems.containsKey(wordsList.get(i))) {
                System.out.println("\n" + Basement.openableItems.get(wordsList.get(i)) + "\n");
            }
            else { 
                System.out.println("\nThis item doesn't exist in the room or if it does, you cannot perform this action on it.\n");
            }
        }
        
        if (wordsList.isEmpty()) {
            System.out.println("\nYou haven't entered in an item to open. Type 'open' and then the item you want to open to complete this command.\n");
        }
    }
    
    /**
     * Allows the user to look around a room, depending on where they are in the house.
     * @param House An instance of the House class.
     */
    public void lookAround(House House) {
        if (this.currentLocation.equals("Living Room")) {
            System.out.println("\n" + House.rooms.get("Living Room") + "\n");
        } 
        else if (this.currentLocation.equals("Kitchen")) {
            System.out.println("\n" + House.rooms.get("Kitchen") + "\n");
        }
        else if (this.currentLocation.equals("Basement")) {
            System.out.println("\n" + House.rooms.get("Basement") + "\n");
        }
        else if (this.currentLocation.equals("Study")) {
            System.out.println("\n" + House.rooms.get("Study") + "\n");
        }
        else if (this.currentLocation.equals("Bedroom")) {
            System.out.println("\n" + House.rooms.get("Bedroom") + "\n");  
        }
    }
    
    /**
     * Allows the player to take different items and add them to their inventory depending on the room and if they are listed in the grabbableItems hashtable.
     * @param wordsList An arrayList containing the item that the player wants to put in their inventory. 
     * @param LivingRoom An instance of the LivingRoom class.
     * @param Basement An instance of the Basement class.
     * @param Study An instance of the Study class. 
     * @param Kitchen An instance of the Kitchen class.
     * @param Bedroom An instance of the Bedroom class.
     */
    public void take(ArrayList<String> wordsList, LivingRoom LivingRoom, Basement Basement, Study Study, Kitchen Kitchen, Bedroom Bedroom) {
        int i = 0;
        if (wordsList.isEmpty()) {
            System.out.println("\nYou haven't entered in an item to take. Type 'take' and then the item you want to take to complete this command.\n");
            return;
        }

        if (this.currentLocation.equals("Living Room")) {
            if (LivingRoom.grabbableItems.containsKey(wordsList.get(i))) {
                System.out.println("\n" + LivingRoom.grabbableItems.get(wordsList.get(i)) + "\n");
                this.inventory.add(wordsList.get(i));
            }
            else { 
                System.out.println("This item doesn't exist in the room or if it does, you cannot perform this action on it.");
            }
        }
        
        if (this.currentLocation.equals("Kitchen")) {
            if (Kitchen.grabbableItems.containsKey(wordsList.get(i))) {
                System.out.println("\n" + Kitchen.grabbableItems.get(wordsList.get(i)) + "\n");
                this.inventory.add(wordsList.get(i));
            }
            else { 
                System.out.println("\nThis item doesn't exist in the room or if it does, you cannot perform this action on it.\n");
            }
        }

        if (this.currentLocation.equals("Study")) {
            if (Study.grabbableItems.containsKey(wordsList.get(i))) {
                System.out.println("\n" + Study.grabbableItems.get(wordsList.get(i)) + "\n");
                this.inventory.add(wordsList.get(i));
            }
            else { 
                System.out.println("\nThis item doesn't exist in the room or if it does, you cannot perform this action on it.\n");
            }
        }

        if (this.currentLocation.equals("Bedroom")) {
            if (Bedroom.grabbableItems.containsKey(wordsList.get(i))) {
                System.out.println("\n" + Bedroom.grabbableItems.get(wordsList.get(i)) + "\n");
                this.inventory.add(wordsList.get(i));
            }
            else { 
                System.out.println("\nThis item doesn't exist in the room or if it does, you cannot perform this action on it.\n");
            }
        }
        
        if (this.currentLocation.equals("Basement")) {
            if (Basement.grabbableItems.containsKey(wordsList.get(i))) {
                System.out.println("\n" + Basement.grabbableItems.get(wordsList.get(i)) + "\n");
                this.inventory.add(wordsList.get(i));
            }
            else {
                System.out.println("\nThis item doesn't exist in the room or if it does, you cannot perform this action on it.\n");
            }
        }
        
        if (wordsList.isEmpty()) {
        System.out.println("\nYou haven't entered in an item to take. Type 'take' or 'grab' and then the item you want to add to your inventory to complete this command.");
        }
    }

    /**
     * Prints out all of the possible commands that the player can use in the house.
     */
    public void showOptions() {
        System.out.println("\n Here is a list of commands you can use to look for the ring:");
        System.out.println("'look around' - It's in the name! Lets you look around and see what there is to interact with in the room you're currently in.");
        System.out.println("'look under <object>' - Allows you to look underneath the object if possible.");
        System.out.println("'open <object>' - Allows you to open the object if possible. Use this command to move between the rooms of the house!");
        System.out.println("'take <object>' or 'grab <object>' - Allows you to pick up the object and put it in your inventory, if possible.");
        System.out.println("'view inventory'  - Opens your inventory to see what you've picked up.");
        System.out.println("'show options' - Shows this list again.\n");
    }
    

    //Game functionality
    /**
     * Asks the user if they would like to start the game upon running the program.
     * @param userChoice The player's input as to whether or not they want to start the game. If 'yes', game loads, if 'no', game ends.
     * @param userInput An instance of the Scanner class that takes in the player's input from the terminal.
     * @param Villager An instance of the Villager class.
     */
    public void startGame(String userChoice, Scanner userInput, Villager Villager) {
        while (!userChoice.equals("Yes") || (!userChoice.equals("yes"))) {
            if (userChoice.equals("Yes") || userChoice.equals("yes")) {
                System.out.println("Game has begun!\n");
                Villager.Villager_conversation(userInput, this);
                break;
            }
            else if (userChoice.equals("No") || userChoice.equals("no")) {
                throw new RuntimeException ("Oh, well that stinks. Bye then.\n");
            }
            else {
                System.out.println("Invalid choice, please try again.");
                userChoice = "";
                userChoice = userInput.nextLine();
            }
        }
        return;
    }

    /**
     * Allows the player to use commands based on their input in the terminal.
     * @param House An instance of the House class.
     * @param LivingRoom An instance of the LivingRoom class.
     * @param Basement An instance of the Basement class.
     * @param Study An instance of the Study class.
     * @param Kitchen An instance of the Kitchen class.
     * @param Bedroom An instance of the Bedroom class.
     */
    public void playGame(House House, LivingRoom LivingRoom, Basement Basement, Study Study, Kitchen Kitchen, Bedroom Bedroom) {
        while (true) {
            //Check if it's time to end the game or move onto the next stage.
            if (this.inventory.contains("ring")) {
                System.out.println("\nYou did it! You found the ring.\n");
                System.out.println("Before you can figure out what to do next, the ring's blue gem starts glowing. Turns out, it's a magical ring with unknown powers...\n");
                System.out.println("Do you still want to return it... or do you want to take it for yourself? Type 'Return it' or 'Take it' to choose.\n");
                
                String userSelect = userInput.nextLine().toLowerCase();

                if (userSelect.equals("return it")) {
                    System.out.println("\nYou leave the house to find the villager waiting outside with a hopeful look on their face. You hand the ring back to them and rewarded with way more gold than you were expecting!");
                    System.out.println("\nYou go on to buy a cozy house in the village, and you're known as someone who's really kind and helpful. You walk off into the sunset, the wind blowing behind you majestically.");
                    System.out.println("~ The End! ~ \n");
                    System.out.println("...But what if you tried something else? Feel free to play again and take other paths!");
                    return;
                }
                else if (userSelect.equals("take it")) {
                    break;
                    //Starts next stage of the game outside this while loop.
                }
            }

            //Plays first stage of the game
            String userPlay = userInput.nextLine().toLowerCase();
        
            String[] words = userPlay.split(" ");
            ArrayList<String> wordsList = new ArrayList<String>(Arrays.asList(words));
            if (wordsList.contains("the")) {
                wordsList.remove("the");
            }

            //Checks if a command was called
            if (words[0].equals("look")) {
                if (words[1].equals("around")) {
                    lookAround(House);
                }
                else if (words[1].equals("under")) {
                    wordsList.remove("look");
                    wordsList.remove("under");
                    lookUnder(wordsList, LivingRoom, Basement, Study, Kitchen, Bedroom);
                }
                else {
                    System.out.println("Invalid command. Refer to the list of valids commands if you're lost! \n");
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
            else if (words[0].equals("view")) {
                System.out.println(this.inventory.toString() + "\n");
            }
            else if (words[0].equals("show")) {
                showOptions();
            }
            else {
                System.out.println("Invalid command. Refer to the list of valids commands if you're lost! \n");
            }
            
        }
        String userPlay = "";
        combat(userPlay);
    }

    /**
     * Starts a new stage of the game where the player has to try to get past bandits. Unlocks the 'use' ability for the player to be able to use any item from their inventory to fight the bandits and trigger an ending.
     * @param userPlay The user's chosen commands.
     */
    public void combat(String userPlay) {
        System.out.println("You decided to take the ring!\n");
        System.out.println("To avoid letting the villager see you with the ring, you escape through the back window. You've only taken a few steps from the house when you suddenly encounter two bandits. The first one grabs a knife from his back pocket and steps menacingly towards you.");
        System.out.println("'We knew about that ring first! Give it here... or else.'\n");
        System.out.println("[NEW OPTION UNLOCKED: type 'use' and the exact name of the item in your inventory to use that item!]\n");
        
        while (true) {
            userPlay = userInput.nextLine().toLowerCase();
            
            String[] words = userPlay.split(" ");
            ArrayList<String> wordsList = new ArrayList<String>(Arrays.asList(words));
            if (wordsList.contains("the")) {
                wordsList.remove("the");
            }

            //Checks if user has called a valid command.
            if (words[0].equals("view")) {
                System.out.println(this.inventory.toString());
            }
            else if (words[0].equals("use")) {
                if (wordsList.size() == 1) {
                    System.out.println("\nYou haven't entered in an item to use. Type 'use' and then the item you want to use to complete this command.\n");
                    continue;
                }
                if (this.inventory.contains(wordsList.get(1)) && this.usableItems.containsKey(wordsList.get(1))) {
                    if (wordsList.get(1).equals("ring")) {
                        System.out.println("\nOh no! You were robbed and lost the ring and the rest of your items. Looks like today's just not your day.");
                        System.out.println("~ The End! ~ \n");
                        System.out.println("...But what if you tried something else? Feel free to play again and take other paths!");    
                    }
                    else {
                        System.out.println("\n" + this.usableItems.get(wordsList.get(1)));
                        System.out.println("\nCongratulations! You got past the bandits unscathed and obtained the magic ring! Your adventure is over.");
                        System.out.println("~ The End! ~ \n");
                        System.out.println("...But what if you tried something else? Feel free to play again and take other paths!");       
                    }
                } 
                else if (this.inventory.contains(wordsList.get(1))) { 
                    System.out.println("\nOh, sorry buddy, this item is pretty useless in this situation...\n");
                }
                else {
                    System.out.println("\nYou can't use an item you don't have!\n");
                }
            }
            else {
                System.out.println("\nInvalid command. Remember, you can only view your inventory and use items in this situation! Type view inventory or use <object> to do either of these things. \n");
            }
        }
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

        House.pickRoom();
        House.placeInRoom(LivingRoom, Kitchen, Basement, Bedroom, Study);

        System.out.println("Welcome to Lord of the One Ring!\n");
        System.out.println("Ready to start your adventure? Enter 'yes' or 'no' to begin!");
        user.startGame(userInput.nextLine(), userInput, villager);
        
        user.playGame(House, LivingRoom, Basement, Study, Kitchen, Bedroom);
    }
}