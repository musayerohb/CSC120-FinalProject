import java.util.Scanner;

public class Villager {

    /**
     * Starts the second stage of the game where the player is given a list of commands to help them look for the lost ring in the house.
     * @param userInput The scanner that will obtain input from the player in the terminal.
     * @param user An instance of the class representing the player. 
     * @return The user's current location.
     */
    public String startQuest(Scanner userInput, User user) {
        System.out.println(("\n'There is a special ring I lost in my house, and I can't seem to find it! Could you please help me?'\n"));
        
        System.out.println("How do you respond? Type one of the three letters:");
        System.out.println("a. 'Of course!'");
        System.out.println("b. 'No.'");
        System.out.println("c. '...'\n");
        String userSelect = userInput.nextLine();

        if (userSelect.equals("A") || userSelect.equals("a")) {
            System.out.println("\n'Thank you! Feel free to start looking around whenever you're ready.'");
            System.out.println("The villager steps aside and you walk into the house. You're standing in the living room.\n");
            System.out.println("Search the house for the ring the villager lost! \n");
            System.out.println("Here is a list of commands you can use to look for the ring:");
            System.out.println("'look around' - It's in the name! Lets you look around and see what there is to interact with in the room you're currently in.");
            System.out.println("'look under <object>' - Allows you to look underneath the object if possible.");
            System.out.println("'open <object>' - Allows you to open the object if possible. Use this command to move between the rooms of the house!");
            System.out.println("'take <object>' or 'grab <object>' - Allows you to pick up the object and put it in your inventory, if possible.");
            System.out.println("'view inventory'  - Opens your inventory to see what you've picked up.");
            System.out.println("'show options' - Shows this list again.\n");
            user.currentLocation = "Living Room";
        }

        else if (userSelect.equals("B") || userSelect.equals("b")) {
            System.out.println("\n'Oh. Okay. Have a great day then, I guess.'");
            System.out.println("The villager closes the door.");
            System.out.println("\nQuest failed! You rejected the quest.");
        }

        else if (userSelect.equals("C") || userSelect.equals("c")) {
            System.out.println("\nThe villager stares at you and slowly closes the door.");
            System.out.println("\nQuest failed! The villager was too weirded out by your silence to give you a quest.");
        }
        return user.currentLocation;
    }

    /**
     * Operates the dialogue tree for the first stage of the game, the conversation with the villager. 
     * @param userInput The scanner that will obtain input from the player in the terminal.
     * @param user An instance of the class representing the player. 
     */
    public void Villager_conversation(Scanner userInput, User user) {
        System.out.println("\nThe player is a local resident doing tasks to help the people of the village. They knock on the door to a cottage and are greeted by a humble villager.");
        System.out.println("'Hello there! How are you?'\n");
        
        System.out.println("How do you respond? Type one of the three letters:");
        System.out.println("a. 'I am jolly as ever.'");
        System.out.println("b. 'I was in a good mood until I saw your face.'");
        System.out.println("c. '...'\n");
        String userSelect = userInput.nextLine();

        //A
        if (userSelect.equals("a") || userSelect.equals("A")) {
            System.out.println("\n'Well that's lovely to hear! Tell me, do you have a keen eye?'\n");
            
            System.out.println("How do you respond? Type one of the three letters:");
            System.out.println("a. 'I'd say so. Why?'");
            System.out.println("b. 'Who's asking?'");
            System.out.println("c. '...'\n");
            userSelect = userInput.nextLine();
              
                //A, A
                if (userSelect.equals("a") || userSelect.equals("A")) {
                    this.startQuest(userInput, user);
                }

                //A, B
                else if (userSelect.equals("b") || userSelect.equals("B")) {
                    System.out.println("\n'I am...do you have a hearing problem?'");
                    System.out.println("'Anyways, I hope your sight is not as bad, because I need your help.'\n");
                    this.startQuest(userInput, user);
                }

                //A, C
                else if (userSelect.equals("C") || userSelect.equals("c")) {
                    System.out.println("\n'Well, you look like it, so listen here.'\n");
                    this.startQuest(userInput, user);
                } 
        }

        //B
        else if (userSelect.equals("b") || userSelect.equals("B")) {
            System.out.println("\n'That's just rude. You're no looker yourself but you don't see me blurting it out.'\n");
            
            System.out.println("How do you respond? Type one of the three letters:");
            System.out.println("a. 'You just did. Do you want my help or not?'");
            System.out.println("b. 'Sorry, I didn't mean it.'");
            System.out.println("c. '...'\n");
            userSelect = userInput.nextLine();

            //B, A
            if (userSelect.equals("a") || userSelect.equals("A")) {
                System.out.println("\nThe villager grumbles. 'Unfortunately, I do.'");
                this.startQuest(userInput, user);
            }
            
            //B, B
            else if (userSelect.equals("b") || userSelect.equals("B")) {
                System.out.println("\n'Oh, well, thank you for apologizing. Now tell me, do you have a keen eye?'\n");
                
                System.out.println("How do you respond? Type one of the three letters:");
                System.out.println("a. 'I'd say so. Why?'");
                System.out.println("b. 'Who's asking?'");
                System.out.println("c. '...'\n");
                userSelect = userInput.nextLine();

                    //B, B, A
                    if (userSelect.equals("a") || userSelect.equals("A")) {
                        this.startQuest(userInput, user);
                    }

                    //B, B, B
                    else if (userSelect.equals("b") || userSelect.equals("B")) {
                        System.out.println("\n'I am...do you have a hearing problem?'");
                        System.out.println("'Anyways, I hope your sight is not as bad, because I need your help.'\n");
                        this.startQuest(userInput, user);
                    }
                    
                    //B, B, C 
                    else if (userSelect.equals("c") || userSelect.equals("C")) {
                        System.out.println("\n'Well, you look like it, so listen here.'\n");
                        this.startQuest(userInput, user);
                    }
            }

            //B, C
            else if (userSelect.equals("c") || userSelect.equals("C")) {
                System.out.println("\n'...Yeah, that was a bit much, apologies. Anyways, tell, me do you have a keen eye?'\n");
                     
                System.out.println("\nHow do you respond? Type one of the three letters:");
                System.out.println("a. 'I'd say so. Why?'");
                System.out.println("b. 'Who's asking?'");
                System.out.println("c. '...'\n");
                userSelect = userInput.nextLine();

                    //B, C, A
                    if (userSelect.equals("a") || userSelect.equals("A")) {
                        this.startQuest(userInput, user);
                    }

                    //B, C, B
                    else if (userSelect.equals("b") || userSelect.equals("B")) {
                            System.out.println("\n'I am...do you have a hearing problem?'");
                            System.out.println("'Anyways, I hope your sight is not as bad, because I need your help.'\n");
                            this.startQuest(userInput, user);
                    }
                    
                    //B, C, C
                    else if (userSelect.equals("c") || userSelect.equals("C")) {
                        System.out.println("\nThe villager stares at you and slowly closes the door. They were too weirded out by your silence to give you a quest.\n");
                        System.out.println("\nQuest failed! The villager was too weirded out by your silence to give you a quest.");
                        return;
                    }
            }
        }

        //C
        else if (userSelect.equals("c") || userSelect.equals("C")) {
            System.out.println("\n'Uh...I'll take that as a so-so. Tell me, do you have a keen eye?'\n");
           
            System.out.println("How do you respond? Type one of the three letters:");
            System.out.println("a. 'I'd say so. Why?'");
            System.out.println("b. 'Who's asking?'");
            System.out.println("c. '...'\n");
            userSelect = userInput.nextLine();
            
            //C, A
            if (userSelect.equals("a") || userSelect.equals("A")) {
                    this.startQuest(userInput, user);
            }

            //C, B
            else if (userSelect.equals("b") || userSelect.equals("B")) {
                    System.out.println("\n'I am...do you have a hearing problem?'");
                    System.out.println("'Anyways, I hope your sight is not as bad, because I need your help.'\n");
                    this.startQuest(userInput, user);
            }

            //C, C
            else if (userSelect.equals("c") || userSelect.equals("C")) {
                System.out.println("The villager stares at you and slowly closes the door. They were too weirded out by your silence to give you a quest.\n");
                System.out.println("Quest failed! The villager was too weirded out by your silence to give you a quest.");

            }
        }

    }
}