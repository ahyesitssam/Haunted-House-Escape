/**
 * Class: CrawlSpaceEscape
 * Group: C
 * Version: 1.0
 * Course: CSE201 E
 * Written: March 6, 2025
 *
 * Purpose: This class allows the player to attempt to access a crawl space,
 * allowing them to finally escape the game.
 */
public class CrawlSpaceEscape extends Outside{
    private String description;
    private Inventory inventory;
    

    public CrawlSpaceEscape(Inventory inventory){
        this.description="Looks like this could lead somewhere... I wonder what I could use to open it...";
        this.inventory=inventory;
    }

    @Override
    public void enter(){
        System.out.println(description);
        if (inventory.hasItem("latch")){
            System.out.println("Ah, maybe my latch will work!");
            keyPress(); //waits for player to press Enter before presenting next dialogue
            System.out.println("*You slowly pry the hatch open. Seeing no other option, you decide to crawl inside.*");
        } else{
            System.out.println("It's sealed shut. Maybe I should explore more.");
        }

    }

}
