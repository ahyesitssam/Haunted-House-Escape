/**
 * Class: LivingRoom  
 * Author: Elena Levine  
 * Version: 1.0  
 * Course: CSE201 E  
 * Written: March 4, 2025  
 *
 * Purpose: This class allows the player to enter the living room.
 */
public class LivingRoom {

    private String description;

    /**
     * Constructor that introduces and initializes the living room.
     */
    public LivingRoom() {
        this.description = "*You enter the house where you are greeted to the living room*\nThere's an arid coldness that fills the room, and dust covers the sofas and surrounding furniture.";
    }

    /**
     * Method that allows the player to enter the living room, introduced with a message
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
