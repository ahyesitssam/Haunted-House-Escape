/**
 * Class: Office  
 * Author: Elena Levine  
 * Version: 1.0  
 * Course: CSE201 E  
 * Written: March 4, 2025  
 *
 * Purpose: This class allows the player to enter the office.
 */
public class Office {

    private String description;

    /**
     * Constructor that introduces and initializes the office.
     */
    public Office() {
        this.description = "*You enter the office*\nEverything is tidily organized, calligraphy pens and paper pristinely laid out.";
    }

    /**
     * Method that allows the player to enter the office, introduced with a message
     * about the room.
     */
    public void enter() {
        System.out.println(description);
    }

    /*
    public void inspect() {
        System.out.println();
    }

    public void moveOn() {
        System.out.println();
    }
    */
}
