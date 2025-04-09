/**
 * Class: Foyer  
 * Group: C  
 * Version: 1.0  
 * Course: CSE201 E  
 * Last Updated: March 6, 2025
 * 
 * Purpose:
 */
public class Foyer extends Room {
    
	public Foyer () {
		this.description = "Now locked inside the errie house, you look around." + 
	"Maybe there's a way you can get out of here? You notice notice four places you can go.";
	}
	
	@Override
	public int roomChoice() {
		int choice = 0;
		while (choice <= 0 || choice > 4) {
			System.out.println("-> Where will you go?");
			System.out.println("1. Room to the Left");
			System.out.println("2. Room to the Right");
			System.out.println("3. Down the hall in front of you");
			System.out.println("4. Upstairs");
			System.out.print("Choose a number: ");
			choice = numberChoice(4);
		}	
		return choice;
	}
	
	// This is a test
	
	// Unused but needed via Room requirements
	@Override
	public void interactionChoice() {
		
	}		
}

