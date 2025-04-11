/**
 * Class: LivingRoom  
 * Group: C  
 * Version: 1.0  
 * Course: CSE201 E  
 * Last Updated: March 6, 2025  
 *
 * Purpose: This class allows the player to enter the living room.
 */
public class LivingRoom extends Room {
 
    public LivingRoom(){
        this.description = "Looking aroud, this room appers to be a living room.\nThere's an arid coldness that fills the room, "  + 
        "and dust covers the sofas and surrounding furniture.";
    }

	@Override
	public int roomChoice() {
		return 0;
		
	}

	@Override
	public int interactionChoice() {
		int choice = 0;
		while (choice <= 0 || choice > 4) {
			System.out.println("-> What will you do?");
			System.out.println("1. Room to the Left");
			System.out.println("2. Room to the Right");
			System.out.println("3. Down the hall in front of you");
			System.out.println("4. Upstairs");
			System.out.print("Choose a number: ");
			choice = numberChoice(4);
		}	
		return choice;
	}
}

