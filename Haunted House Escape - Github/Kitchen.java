/**
 * Class: Kitchen  
 * Author: Elena Levine  
 * Version: 1.0  
 * Course: CSE201 E  
 * Written: March 4, 2025  
 *
 * Purpose: This class allows the player to enter the kitchen.
 */
public class Kitchen {

    private String description;

    /**
     * Constructor that introduces and initializes the kitchen.
     */
    public Kitchen() {
        this.description = "*You enter the kitchen*\nThe pantries are all empty except for plates and utensils. Water drips from the faucet.";
    }

    /**
     * Method that allows the player to enter the kitchen, introduced with a message
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
