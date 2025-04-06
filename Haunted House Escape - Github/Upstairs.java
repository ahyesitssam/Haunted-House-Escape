/**
 * Class: Upstairs  
 * Author: Elena Levine  
 * Version: 1.0  
 * Course: CSE201 E  
 * Written: March 4, 2025  
 *
 * Purpose: This class allows the player to go upstairs and access
 * the rooms upstairs.
 */
public class Upstairs {

    private String description;

    /**
     * Constructor that introduces and initializes the upstairs.
     */
    public Upstairs() {
        this.description = "*You walk upstairs*\nA long hallway introduces a new set of rooms.";
    }

    /**
     * Method that allows the player to go upstairs, introduced with a message
     * about the area.
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
