4/23/23
5:30-9:00PM
Eva & Musa

Constructed the House, Ring, User, and Villager classes.
Created and implemented:
 - [Villager]startQuest - The last part of the dialogue tree; user answers yes, no, or stays silent when villager presents quest.
 - [Villager] Villager_Conversation - The bulk of the dialogue tree. The user has three dialogue options each time, each with varying responses from the Villager.
 - [Ring] isGlowing boolean - Determines whether the magical ring is glowing
 - [House] pick_room - Randomly selects a room amongst the Array list of rooms for the ring to be in each time it is run
 - Fixed:
 - [Villager] Dialogue tree not allowing user to input another answer after picking the first, fixed by making sure that users are asked to input another answer after every choice they make. 
 
 Future goals:
 Implement methods for user to explore and interact with the house to find the ring
 Write dialogue for when the user finds the ring and decides whether to steal or return it
 Create Bandit class and implement combat methods for Bandit and User classes



4/25/23
5:30 - 7:00PM
Eva & Musa

Created and Implemented: 
- Hashtables for rooms with room-description pairs.
- Called startQuest method after appropriate dialogue to trigger beginning of exploration.

Challenges: 
- Checking the location of the user after starting the game
- Should we make separate classes for the rooms, when we're making hashtables for openable, grabable, look under-able, objects (as a means of preventing too many hashtables in one class)?

Ways to approach challenges for next time 
- Have just objects player can interact with, and a list of rooms next to the room you're in. check what room you're in for this specialized list. there's a door to each room.



4/25/23
7:00 - 8:00PM
Musa

Created and Implemented:
- New classes for each individual room in order to give each room their own individualized hashtables of objects that the user can open, take, and look under, and a list of adjacent rooms that user can move to. This was done to avoid putting so many hashtables in the house class. Also, it makes navigating through the house easier because the user can only access one of these at a time.

Challenges: None

Future goals:
- Implement the hashtables.
- Allow user to interact with objects



4/26/23
7:20PM - 9:46PM
Eva and Musa

Created and Implemented:
- Added individualized hashtables and lists to each room class, items that a user can open, look under, or take.
- Added all of the openable items, grabbable items, and items that you can look under to their respective hashtables, with their 'values' as keys being what happens when the user interacts with those objects in the selected way. 
- Introduced a new moveThroughDoor() method for each room class to solve the problem of some rooms having multiple doors. The method prompts the user to choose between doors if the room they're in has more than one door. The method also handles the functionality of the user chosing to move between rooms, updating their current location and thus the items they are able to interact with (the latter will be introduced in a future change).

Challenges:
- We were struggling with implementing user controls from the terminal. We were trying to adapt code from the conversation bot to deal with this problem, but we're still figuring out how to get the code to see if the user command entered contains the keywords needed for the player to complete an action. 

Challenges to fix in the future:
- Ensure that user can navigate around the house and interact with the house and its objects through the terminal.



4/28/23
8:35AM - 9:35AM 
Eva and Musa

Created and Implemented
- LookAround function works, just have to make sure it works after moving from one room to the next.

Challenges: None

Future Goals
- Implement the rest of the user functions
- Implement what happens when user doesn't enter in the right commands
- Make sure all user functions work when the user moves from one room to another.
- Implement game endings for when user finds the ring
- Implement combat for when user chooses to steal the ring instead of return it



4/30/23
1:00PM - 5:00PM
Eva and Musa

Created and Implemented
 - Tested and confirmed that lookAround() method is fully functional
 - Made sure that lookUnder() and open() methods work for all items in lookableItems and openableItems lists.
 - Decided to put moveThroughDoor() method in House class rather than all room classes
        - Extended room classes from House class to allow this change
 - Tested and confirmed that moveThroughDoor() method is fully functional; the program will ask for clarification on which door they wish to enter if the room they are in has more than one door/adjacent room
 - The user can now move between rooms in the house and look around, under, and open items without program breaking

Challenges: None

Future Goals
 - Test inventory; take() method should be fully functional
 - Implement conditional for when user looks at the item that the program randomly chose the ring to be hidden in
 - Program ending(s) when user finds the ring
 - If we have time, begin work on Bandits class and combat


5/1/23
3:00 - 5:00pm
Eva and Musa

Created and Implemented
- Inventory and take() method is fully functional. Added user function to be able to view inventory.
- All possible ring locations have been set.

Future Goals
- Make sure that ring is actually placed in a random location at the beginning of each game.
- Work on implementing final stage of the game.

Challenges
- Fix ring not being placed in a random location at the beginning of the game. 

5/2/23
10:00 - 10:40am
Eva & Musa

Created and Implemented
- Expanded some print statements for non-ring lookableItems and openableItems

Fixed
- pickRoom method
- placeInRoom is fully functional

Future Goals
- Finish expanding print statements for non-ring lookableItems and openableItems
- Add use functionality for all grabbableItems and write print statements/endings based on which item the user uses against the bandits
- Write Javadocs

5/2/23
6:30 - 9:30PM
- Implemented the combat system!
- Created all game endings.
- Started working on spacing

5/3
12:00 - 1:10PM
Eva & Musa

- Fixed most of the spacing, made sure to input error messages and allow players to retry commands if they put in the wrong one.
- Implemented showOptions() method that prints out instructions in case the player needs to reference the instructions again.  

5/4
9:25-10:40AM
Eva & Musa

~ Presentation Day! ~

- Found bugs, mostly regarding users attempting to grab items that we didn't consider making grabbable and typing in their full responses during the dialogue segment rather than letters.

6:00 - 7:00PM
Eva & Musa

- Fixed all bugs found during presentation day.
- Implemented final spacing & formatting fixes.

5/5
1:00pm - 7:00pm
Eva and Musa

- 
- 
- 