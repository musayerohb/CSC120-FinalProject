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