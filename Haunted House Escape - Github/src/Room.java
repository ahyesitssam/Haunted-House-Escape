import java.util.Scanner;
/**
 * Class: Room  
 * Group: C  
 * Version: 1.0  
 * Course: CSE201 E  
 * Last Updated: March 6, 2025
 * 
 * Purpose:
 */
public abstract class Room {
    protected String description;
    protected boolean beenHereBefore;
    protected Scanner scanner = new Scanner(System.in);

    public Room() {
    	this.beenHereBefore = false;
    }

    // Use to add a pause between dialogue
    public void keyPress() {
        System.out.println("[Press 'Enter' to continue...]");
        scanner.nextLine();
    }

    // Use to get the players menu choice
    public int numberChoice(int paramNum) {
        int number;
        if (scanner.hasNextInt()) {
            
            number = scanner.nextInt();
            if (number > paramNum) {
                scanner.nextLine(); // clear non integer input
                System.out.println("Error: Invalid Choice");
                return 0;
            }
            scanner.nextLine();
            System.out.println();
            return number;
        } else {
            scanner.nextLine(); // clear non integer input
            System.out.println("Error: Invalid Choice");
            return 0;
        }
    }

    public int enter() 
    {
    	if (!beenHereBefore) {
			System.out.println(description);
			beenHereBefore = true;
		}
		return roomChoice();
    }
    
    
    // all rooms (except woods) will have there own version of roomChoice
    public abstract int roomChoice();
    
    
    // some rooms may have interactionChoice
    /**
     * 
     */
    public abstract void interactionChoice();
}
