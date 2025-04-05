/**
 * Class: MasterBedroom  
 * Author: Elena Levine  
 * Version: 1.0  
 * Course: CSE201 E  
 * Written: March 4, 2025  
 *
 * Purpose: This class allows the player to enter the master bedroom.
 */
public class MasterBedroom {

    private String description;

    /**
     * Constructor that introduces and initializes the master bedroom.
     */
    public MasterBedroom() {
        this.description = "*You enter the master bedroom*\nThe bedsheets are perfectly made, leaving behind no trace of anyone's presence.";
    }

    /**
     * Method that allows the player to enter the master bedroom, introduced with a message
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
