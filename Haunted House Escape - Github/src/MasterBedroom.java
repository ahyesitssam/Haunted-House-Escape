/**
 * Class: MasterBedroom
 * Course: CSE201
 * Group: C
 * Version 2.0
 * Last Updated: 4/30
 * 
 * This class serves as the Master bedroom of the house.
 * It includes a wardrobe that is locked and requires a passcode to open.
 * Upon opening the wardrobe, the user recieves a small golden key used for
 * future interactions.
 * 
 * @author brunsaj2,
 * 
 */
public class MasterBedroom extends Room {

    /**
     * Constructor. Initializes the MasterBedroom room.
     * 
     * @param inventory the users inventory
     */
    public MasterBedroom(Inventory inventory) {
        super(inventory);
        this.description = "The bedsheets are perfectly made, leaving behind no trace of anyone's presence.";
    }

    /**
     * Prints out list of options for the user.
     */
    @Override
    public int roomChoice() {
        int choice = 0;
        while (choice <= 0 || choice > 5) {
            System.out.println("-> What will you do?");
            System.out.println("1. Living room");
            System.out.println("2. Master bedroom");
            System.out.println("3. Dining room");
            System.out.println("4. Upstairs");
            System.out.println("5. Open wardrobe");
            System.out.print("Choose a number: ");
            choice = numberChoice(5);
        }
        return choice;
    }

    /**
     * Handles logic of whether or not user has already opened and unlocked the
     * wardrobe.
     */
    @Override
    public void voidInteractionChoice() {
        boolean exit = false;
        System.out.println("You walk up to the intimidatingly-sized wardrobe and pull on its handle.");

        if (inventory.hasItem("key")) { // if user has key, there is nothing left to look for
            System.out.println("There is nothing left to be found here.");
        } else {
            userHasNoKey(exit);
        }
    }

    /**
     * Handles logic of if user has not already opened the wardrobe.
     * Presents the locked wardrobe to the user
     * 
     * @param exit true if the user has decided to exit, false otherwise
     */
    private void userHasNoKey(boolean exit) {
        System.out.println("The door won't budge, and you look down to find the doors bound together by a lock." +
                " Thinking back, you wonder if there was a clue that could've given you the combo.");

        while (!exit) {
            System.out.print("What could it be? ");
            String input = scanner.nextLine();

            if (input.equals("321")) {
                correctPasswordEntered();
                exit = true;
            } else {
                exit = incorrectPasswordEntered();
            }
        }
    }

    /**
     * Prints statement and adds key to inventory upon correct password.
     * the user is given the golden key.
     * 
     * @return true if user
     */
    private void correctPasswordEntered() {
        System.out.println("The lock comes undone, and you gasp in satisfaction. You find a" +
                " small, golden key. You start to think that finding an exit might be possible afterall," +
                " and quickly swipe the key into your pocket.\n");

        inventory.addItem("key");
    }

    /**
     * Presents user with option to try again, or leave the wardrobe.
     * 
     * @return true if user has decided to exit, false otherwise
     */
    private boolean incorrectPasswordEntered() {
        while (true) {
            System.out.println("Your code failed. What will you do?");
            System.out.println("1. Try again");
            System.out.println("2. Leave wardrobe");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        return false;
                    case 2:
                        return true;
                    default:
                        System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } else {
                scanner.nextLine();
                System.out.println("Please enter a number.");
            }
        }
    }

    /**
     * Helper method. Represents maximum number of options listed upon entering the
     * master bedroom.
     */
    @Override
    public int getChoiceMax() {
        return 5;
    }
}
