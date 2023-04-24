import java.util.Scanner;

public class Villager {

    public void startQuest(Scanner userInput) {
        System.out.println(("'There is a special ring I lost in my house, and I can't seem to find it! Could you please help me?'"));
        
        System.out.println("How do you respond?");
        System.out.println("a. 'Of course!'");
        System.out.println("b. 'No.'");
        System.out.println("c. '...'");
        String userSelect = userInput.nextLine();

        if (userSelect.equals("A") || userSelect.equals("a")) {
            System.out.println("'Thank you! Feel free to start looking around whenever you're ready.'");
            //QUEST START
        }
        else if (userSelect.equals("B") || userSelect.equals("b")) {
            System.out.println("'Oh. Okay. Have a great day then, I guess.'");
            System.out.println("The villager closes the door.");
            System.out.println("Quest failed! You rejected it.");
            return;   
        }
        else if (userSelect.equals("C") || userSelect.equals("c")) {
            System.out.println("The villager stares at you and slowly closes the door.");
            System.out.println("Quest failed! The villager was too weirded out by your silence to give you a quest.");
            return;
        }
    }

    public void Villager_conversation(Scanner userInput) {
        System.out.println("The player is a local resident doing tasks to help the people of the village. They knock on the door to a cottage and are greeted by a humble villager.");
        System.out.println("'Hello there! How are you?'");
        
        System.out.println("How do you respond?");
        System.out.println("a. 'I am jolly as ever.'");
        System.out.println("b. 'I was in a good mood until I saw your face.'");
        System.out.println("c. '...'");
        String userSelect = userInput.nextLine();

        //A
        if (userSelect.equals("a") || userSelect.equals("A")) {
            //gain reputation
            System.out.println("'Well that's lovely to hear! Tell me, do you have a keen eye?");
            
            System.out.println("How do you respond?");
            System.out.println("a. 'I'd say so. Why?'");
            System.out.println("b. 'Who's asking?'");
            System.out.println("c. '...'");
            userSelect = userInput.nextLine();
              
                //A, A (works)
                //(Code is printing this out before allowing user to answer.) alright i gotta make sure I ask it to input stuff again.
                
                if (userSelect.equals("a") || userSelect.equals("A")) {
                    this.startQuest(userInput);
                }
                //A, B (works)
                else if (userSelect.equals("b") || userSelect.equals("B")) {
                    System.out.println("'I am...do you have a hearing problem?'");
                    //lose reputation
                    System.out.println("'Anyways, I hope your sight is not as bad, because I need your help.'");
                    this.startQuest(userInput);
                }
                //A, C (works)
                else if (userSelect.equals("C") || userSelect.equals("c")) {
                    System.out.println("'Well, you look like it, so listen here.'");
                    this.startQuest(userInput);
                } 

        }

        //B
        else if (userSelect.equals("b") || userSelect.equals("B")) {
            //lose reputation
            System.out.println("'That's just rude. You're no looker yourself but you don't see me blurting it out.'");
            
            System.out.println("How do you respond?");
            System.out.println("a. 'You just did. Do you want my help or not?'");
            System.out.println("b. 'Sorry, I didn't mean it.'");
            System.out.println("c. '...'");
            userSelect = userInput.nextLine();

            //B, A (works)
            if (userSelect.equals("a") || userSelect.equals("A")) {
                //lose reputation
                System.out.println("The villager grumbles. 'Unfortunately, I do.'");
                this.startQuest(userInput);
            }
            
            //B, B (chooses b automatically)
            else if (userSelect.equals("b") || userSelect.equals("B")) {
                System.out.println("'Oh, well, thank you for apologizing. Now tell me, do you have a keen eye?'");
                
                System.out.println("How do you respond?");
                System.out.println("a. 'I'd say so. Why?'");
                System.out.println("b. 'Who's asking?'");
                System.out.println("c. '...'");
                userSelect = userInput.nextLine();

                    //B, B, A (not tested, probably works)
                    if (userSelect.equals("a") || userSelect.equals("A")) {
                        this.startQuest(userInput);
                    }

                    //B, B, B (works)
                    else if (userSelect.equals("b") || userSelect.equals("B")) {
                        System.out.println("'I am...do you have a hearing problem?'");
                        //lose reputation
                        System.out.println("'Anyways, I hope your sight is not as bad, because I need your help.'");
                        this.startQuest(userInput);
                    }
                    
                    //B, B, C (not tested, probably works)
                    else if (userSelect.equals("c") || userSelect.equals("C")) {
                        System.out.println("'Well, you look like it, so listen here.'");
                        this.startQuest(userInput);
                    }
            }

            //B, C
            else if (userSelect.equals("c") || userSelect.equals("C")) {
                System.out.println("'...Yeah, that was a bit much, apologies. Anyways, tell, me do you have a keen eye?'");
                     
                System.out.println("How do you respond?");
                System.out.println("a. 'I'd say so. Why?'");
                System.out.println("b. 'Who's asking?'");
                System.out.println("c. '...'");
                userSelect = userInput.nextLine();

                    //B, C, A
                    if (userSelect.equals("a") || userSelect.equals("A")) {
                        this.startQuest(userInput);
                    }
                    //B, C, B
                    else if (userSelect.equals("b") || userSelect.equals("B")) {
                            System.out.println("'I am...do you have a hearing problem?'");
                            //lose reputation
                            System.out.println("'Anyways, I hope your sight is not as bad, because I need your help.'");
                            this.startQuest(userInput);
                    }
                    
                    //B, C, C
                    else if (userSelect.equals("c") || userSelect.equals("C")) {
                        System.out.println("The villager stares at you and slowly closes the door. They were too weirded out by your silence to give you a quest.");
                        System.out.println("Quest failed! The villager was too weirded out by your silence to give you a quest.");
                        return;
                    }
            }
        }

        //C
        else if (userSelect.equals("c") || userSelect.equals("C")) {
            System.out.println("'Uh...I'll take that as a so-so. Tell me, do you have a keen eye?'");
           
            System.out.println("How do you respond?");
            System.out.println("a. 'I'd say so. Why?'");
            System.out.println("b. 'Who's asking?'");
            System.out.println("c. '...'");
            userSelect = userInput.nextLine();
            
            //C, A
            if (userSelect.equals("a") || userSelect.equals("A")) {
                    this.startQuest(userInput);
            }

            //C, B
            else if (userSelect.equals("b") || userSelect.equals("B")) {
                    System.out.println("'I am...do you have a hearing problem?'");
                    //lose reputation
                    System.out.println("'Anyways, I hope your sight is not as bad, because I need your help.'");
                    this.startQuest(userInput);
            }

            //C, C (works)
            else if (userSelect.equals("c") || userSelect.equals("C")) {
                System.out.println("The villager stares at you and slowly closes the door. They were too weirded out by your silence to give you a quest.");
            }
        }

    }
}

