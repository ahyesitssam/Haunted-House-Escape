import java.util.Scanner;

/**
 * Class: CrawlSpaceEscape  
 * Group: C  
 * Version: 1.1  
 * Course: CSE201 E  
 * Written: April 29, 2025  
 * 
 * Purpose: This class allows the player to navigate a crawl space by making 
 * correct directional choices. If the user chooses wrong, they must restart.
 */
public class CrawlSpaceEscape extends Outside {
    private Inventory inventory;
    private Scanner scanner = new Scanner(System.in);
    private String[] correctPath = {"left", "straight", "right"};

    public CrawlSpaceEscape(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public void enter() {
        System.out.println("You squeeze into the narrow path and make your way... until you find" +
        " three tunnles branching off of your route.");
        keyPress();
        chooseDirection();
        escapeCrawlSpace();
    }

    // Handles navigation through the crawlspace
    private void chooseDirection() {
        int index = 0;
        while (index < correctPath.length) {
            String choice = getUserDirection();
            if (choice.equalsIgnoreCase(correctPath[index])) {
                System.out.println("You chose correctly and continue crawling...");
                index++;
                keyPress();
            } else {
                System.out.println("Dead end! You have to backtrack and start over.");
                index = 0;
                keyPress();
            }
        }
    }
    

    // Presents direction choices to the user and returns their chosen direction
    private String getUserDirection() {
        int choice = 0;
        while (choice < 1 || choice > 3) {
            System.out.println("-> Where will you go?");
            System.out.println("1. Left");
            System.out.println("2. Right");
            System.out.println("3. Straight");
            System.out.print("Choose a number: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); 
            } else {
                scanner.nextLine(); 
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
            }
        }
    
        switch (choice) {
            case 1: return "left";
            case 2: return "right";
            case 3: return "straight";
            default: return ""; 
        }
    }
    

    // Let's user finally escape once correctly choosing all correct direction
    private void escapeCrawlSpace() {
        System.out.println("You finally reach a hatch. This must be the end... " +
        " You push it open and feel a rush of cold air against your face...");
        keyPress();
        System.out.println("You tremble to your knees as the light of day shrinks" +
        " your pupils and droplets of rain patter your skin.\nStumbling out the dark," +
        " unsettling pathway, you take one look back at the foreboding house" +
        " and finally scurry away, forever changed by the haunting encounter.");
        System.out.println("Congratulations! You escaped the haunted house!");
        keyPress();
        System.exit(0); // Ends game
    }
}
