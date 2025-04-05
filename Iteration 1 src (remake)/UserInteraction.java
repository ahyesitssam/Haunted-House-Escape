import java.util.Scanner;

/**
 * Class: UserInteraction  
 * Author: Elena Levine  
 * Version: 1.0  
 * Course: CSE201 E  
 * Written: March 4, 2025  
 *
 * Purpose: This class creates some keyboard functions that the
 * player uses to interact with the game.
 */
public class UserInteraction {

    private Scanner scanner;

    /**
     * Constructor that introduces and initializes a scanner object for user input.
     */
    public UserInteraction() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Method that prompts the player to press 'Enter',
     * continuing them to the next dialogue prompt.
     */
    public void keyPress() {
        System.out.println("[Press 'Enter' to continue...]");
        scanner.nextLine();
    }
}
