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
    	
    	// initialize all the rooms
    	Outside woods = new Woods();
    	Room foyer = new Foyer();
    	Room livingRoom = new LivingRoom();
    	
    	// Start the game
        woods.enter();
        userChoice = foyer.enter();
      
   
        switch (userChoice) {
    	case 1:
    		System.out.println("You go to the room on the left.");
    		livingRoom.enter();
    		break;
    	case 2:
    		System.out.println("You go to the room on the right.");
    		//masterBedroom.enter();
    		break;
    	case 3:
    		System.out.println("You go down the hall.");
    		//diningRoom.enter();
    		break;
    	case 4:
    		System.out.println("You head upstairs.");
    		break;
        }
    }
}
