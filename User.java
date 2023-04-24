import java.util.Scanner;
import java.util.ArrayList;

public class User {

    public int reputation;
    public int health;
    public ArrayList<String> inventory;

    public User() {
        this.reputation = 0;
        this.health = 10;
        this.inventory = new ArrayList<String>();
    }


    public void look_under() {
        
    }
    
    public void open() {
        
        
    }
    public void look_around() {

    }
    
    public void take() {
        
    }
    
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

    public void changeReputation() {
    }

    
    


    public static void main(String[] args) {
        User user = new User();
        Scanner userInput = new Scanner(System.in);
        Villager villager = new Villager(); 


        System.out.println("Welcome to (TITLE TBD)!");
        System.out.println("Ready to start your adventure? Enter 'yes' or 'no' to begin!");
        user.startGame(userInput.nextLine());
        
        villager.Villager_conversation(userInput);


    }



}
