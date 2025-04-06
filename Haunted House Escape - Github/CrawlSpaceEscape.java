/**
 * Class: CrawlSpaceEscape
 * Author: Elena Levine
 * Version: 1.0
 * Course: CSE201 E
 * Written: March 4, 2025
 *
 * Purpose: This class allows the player to attempt to access a crawl space,
 * allowing them to finally escape the game.
 */
public class CrawlSpaceEscape extends UserInteraction {

    private String description;
    private Inventory inventory;

    /**
     * Constructor that introduces and initializes the crawl space.
     * Prints a message to player.
     *
     * @param inventory Inventory of items the player has
     */
    public CrawlSpaceEscape(Inventory inventory) {
        this.description = "Looks like this could lead somewhere... I wonder what I could use to open it...";
        this.inventory = inventory;
    }

    /**
     * Method that checks to see if the player can open the crawl space.
     * If they can, they can then escape the game. If they can't, they'll
     * be prompted to go back with a message.
     */
    public void open() {
        System.out.println(description);

        if (inventory.hasItem("latch")) {
            System.out.println("Ah, maybe my latch will work!");
            keyPress(); // Waits for player to press Enter before presenting next dialogue
            System.out.println("*You slowly pry the hatch open. Seeing no other option, you decide to crawl inside.*");
        } else {
            System.out.println("It's sealed shut. Maybe I should explore more.");
        }
    }
}
