/**
 * Class: DiningRoom
 * Author: Elena Levine
 * Version: 1.0
 * Course: CSE201 E
 * Written: March 4, 2025
 *
 * Purpose: This class allows the player to attempt to access a crawl space,
 * allowing them to finally escape the game.
 */
public class DiningRoom {

    private String description;

    /**
     * Constructor that introduces and initializes the dining room.
     */
    public DiningRoom() {
        this.description = "*You enter the dining room*\nSpiderwebs cover the chairs and drawers are loaded with silverware and fine China sets.";
    }

    /**
     * Method that allows player to enter the dining room, introduced with a message
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
