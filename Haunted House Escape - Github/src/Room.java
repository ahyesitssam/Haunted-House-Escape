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

    /**
     * When called, adds a pause and waits for user input to continue.
     */
    protected void keyPress() {
        System.out.println("[Press 'Enter' to continue...]");
        scanner.nextLine();
    }

    /**
     * Handles the user input, including input validation. Returns 0 if the choice is invalid.
     * @param paramNum the number of options the user is given
     * @return the users choices
     */
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

    public int enter() {
        if (!beenHereBefore) {
            System.out.println(description);
            beenHereBefore = true;
        }
    
        int choice = 0;
        while (true) {
            choice = roomChoice();
    
            if (choice == getChoiceMax()) { //if user chooses last option on prompted list (one that offers user interaction)
                voidInteractionChoice(); // lets user visit iteractive object in room
                continue; // Go back to top and prompt again
            }
    
            return choice; // Leave the room and return the user's room choice
        }
    }
    
    
    
    
    // all rooms (except woods) will have there own version of roomChoice
    public abstract int roomChoice();
    

    // some rooms may have voidInteractionChoice
    public abstract void voidInteractionChoice();

    // all rooms have a max amount of choices to select within roomChoice()
    // and only the last option will be capable of asking user to view interaction object
    public abstract int getChoiceMax();
}
