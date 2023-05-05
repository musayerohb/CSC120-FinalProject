This file will contain documentation for all commands available in your game.

Note:  It's a good idea to also make this list available inside the game, in response to a `HELP` command.


  Here is a list of commands you can use to look for the ring:
 
 'look around' - It's in the name! Lets you look around and see what there is to interact with in the room you're currently in.
 'look under <object>' - Allows you to look underneath the object if possible.
 'open <object>' - Allows you to open the object if possible. Use this command to move between the rooms of the house!
 'take <object>' or 'grab <object>' - Allows you to pick up the object and put it in your inventory, if possible.
 'view inventory'  - Opens your inventory to see what you've picked up.
 'use <object>' -  Triggers different reactions and endings based on the object the user chooses to use. This ability is locked unti the user picks a certain route.

# SPOILER ALERT

If your game includes challenges that must be overcome to win, also list them below.
    
    Each time the game is run, the program picks a random room to put the ring in. There is one spot in each room that the ring can be in:
      Living Room - Under the carpet. User must 'look under carpet' to find it.
      Kitchen - In the cabinets. User must 'open (the) cabinet(s)' to find it.
      Basement - In the trunk. User must 'open (the) trunk' to find it.
      Bedroom - Under the bed. User must 'look under (the) bed' to find it.
      Study - Inside the drawer of the bookshelf. User must 'open (the) drawer(s)' to find it.

    When the user finds the ring, they are presented the option to either return it or take it for themself. If they choose to return it, they return it to the villager and the game ends. If you choose to take the ring, you unlock a new stage of the game where you have to escape two bandits that want to steal the ring from you. At this point, the combat method is called and the user can use the 'use' ability. The user can 'use' any item in their inventory, each item causing different reactions and endings, but ultimately let you win. Except for one, which is the ring: if the user tries to use it, they black out and have their things taken by the bandits, leading to a bad ending.
