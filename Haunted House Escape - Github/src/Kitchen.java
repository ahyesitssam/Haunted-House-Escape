/**
 * Class: Kitchen  
 * Group: C  
 * Version: 1.0  
 * Course: CSE201 E  
 * Last Updated: March 6, 2025
 * 
 * Purpose:
 */
public class Kitchen extends Room {

    public Kitchen(Inventory inventory) {
        super(inventory);
        this.description="The pantries are all empty except for plates and utensils. " + 
        "Water slowly drips from the faucet.";
    }

    @Override
	public int roomChoice() {
		int choice = 0;
		while (choice <= 0 || choice > 4) {
			System.out.println("-> Where will you go?");
			System.out.println("1. Office");
			System.out.println("2. Kitchen");
			System.out.println("3. Downstairs");
            System.out.println("4. View fridge");
			System.out.print("Choose a number: ");
			choice = numberChoice(4);
		}	
		return choice;
	}

    @Override
    public void voidInteractionChoice() {
        boolean exit = false;

        System.out.println("You stand in front of the fridge. The surface is painted in" +
        " black and is as smooth as silk. You pull on the door.\nNothing. You then notice" +
        " a numbered key pad in the upper corner.");
        
        while (!exit) {
            System.out.print("What could the code be? "); 
            String input = scanner.nextLine();
            
            if (input.equals("735")) {
                exit = userEntersCorrectPassword();  
            } else {
                exit = userEntersWrongPassword();
            }
        }
    }

    /**
     * Handles interaction if user entered correct password.
     * @return true if the user exists, false otherwise
     */
    private boolean userEntersCorrectPassword() {
        boolean exit;
        System.out.println("The door swings open.");
        if (!inventory.hasItem("crowbar")) {
            System.out.println("You gasp, as bottles of organoids lay on each of the shelves." +
            " Holding your breath, you take a closer look and find a" + 
            " crowbar laying inconspicuously in the back. Maybe this could be useful... you take it.\n");

            inventory.addItem("crowbar");
        } else {
            System.out.println("There is nothing left to be found here.");
        }

        exit = true;
        return exit;
    }

    /**
     * Handles interaction if user entered incorrect password.
     * @return true if user has decieded to exit, false otherwise
     */
    private boolean userEntersWrongPassword() {
        boolean exit;
        System.out.println("Your code failed. What will you do?");
        System.out.println("1. Try again");
        System.out.println("2. Leave wardrobe");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                exit = false;
                break;
            case 2:
                exit = true; //should exit while loop and finish method
                break;
        }
        exit = true;
        return exit;
    }

    
    @Override
    public int getChoiceMax() {
        return 4;
    }
}
