/**
 * Class: Main  
 * Group: C 
 * Version: 1.0  
 * Course: CSE201 E  
 * Last Updated: March 6, 2025  
 *
 * Purpose: This class allows the player to initiate gameplay.
 */
public class Main {
    public static void main(String[] args) {  	
    	int userChoice;
		Inventory userInventory = new Inventory();
		String lockedRoomDescription = "You turn the knob but the door seems to be locked. I wonder" +
		" what I could use to unlock it?";
    	
    	// initialize all the rooms
    	Outside woods = new Woods();
    	Room foyer = new Foyer(userInventory);
		Room upstairs = new Upstairs(userInventory);
    	Room livingRoom = new LivingRoom(userInventory);
		Room masterBedroom = new MasterBedroom(userInventory);
		Room diningRoom = new DiningRoom(userInventory);
		Room office = new Office(userInventory);
		Room kitchen = new Kitchen(userInventory);
		Outside crawlSpace = new CrawlSpaceEscape(userInventory);

    	
    	// Start the game
        woods.enter();
        userChoice = foyer.enter();
		boolean downstairs = true;
      
		while (true) {
			if (downstairs) { // downstairs rooms
				switch (userChoice) {
					case 1:
						System.out.println("You go to the living room.");
						userChoice = livingRoom.enter();
						break;
					case 2:
						System.out.println("You go to the master bedroom.");
						userChoice = masterBedroom.enter();
						break;
					case 3:
						System.out.println("You go to the dining room.");
						userChoice = diningRoom.enter();
						break;
					case 4:
						System.out.println("You head upstairs.");
						downstairs = false; // player is now upstairs
						userChoice = upstairs.enter(); // go to upstairs 
						break;
				}
			} 
			else if (!downstairs) { // upstairs rooms
				switch (userChoice) {
					case 1:
						System.out.println("You go to the office.");
						if (!userInventory.hasItem("key")) { // if player doesn't have key
							System.out.println(lockedRoomDescription);
							userChoice = upstairs.enter(); // present upstairs rooms again
						} else {
							userChoice = office.enter();
						}
						break;
					case 2:
						System.out.println("You go to the kitchen.");
						userChoice = kitchen.enter();
						break;
					case 3:
						System.out.println("You head downstairs.");
						downstairs = true; // player is now downstairs
						userChoice = foyer.enter(); // go to foyer downstairs
						break;
				}
			}
		}
    }
}
