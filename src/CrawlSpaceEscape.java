public class CrawlSpaceEscape extends UserInteraction{
    private String description;
    private Inventory inventory;
    

    public CrawlSpaceEscape(Inventory inventory){
        this.description="Looks like this could lead somewhere... I wonder what I could use to open it...";
        this.inventory=inventory;
    }

    public void open(){
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
