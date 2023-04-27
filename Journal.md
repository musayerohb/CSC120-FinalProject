// 4/23/23
// 5:30-9:00PM
// Eva & Musa

// Constructed the House, Ring, User, and Villager classes.
// Created and implemented:
// [Villager]startQuest - The last part of the dialogue tree; user answers yes, no, or stays silent when villager presents quest.
// [Villager] Villager_Conversation - The bulk of the dialogue tree. The user has three dialogue options each time, each with varying responses from the Villager.
// [Ring] isGlowing boolean - Determines whether the magical ring is glowing
// [House] pick_room - Randomly selects a room amongst the Array list of rooms for the ring to be in each time it is run
// Fixed:
// [Villager] Dialogue tree not allowing user to input another answer after picking the first, fixed by making sure that users are asked to input another answer after every choice they make. 
// 

// Future goals:
// Implement methods for user to explore and interact with the house to find the ring
// Write dialogue for when the user finds the ring and decides whether to steal or return it
// Create Bandit class and implement combat methods for Bandit and User classes

4/25/23
5:30 - 7:00PM
Eva & Musa

Challenges: 
Checking the location of the user after starting the game
Should we make separate classes for the rooms, when we're making hashtables for openable, grabable, look under-able, objects (as a means of preventing too many hashtables in one class)?

Created and Implemented: 
Hashtables for rooms with room-description pairs.

Called startQuest method after appropriate dialogue to trigger beginning of exploration.

Ways to approach challenges for next time: have just objects player can interact with, and a list of rooms next to the room you're in. check what room you're in for this specialized list. there's a door to each room.