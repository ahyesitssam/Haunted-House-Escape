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

        System.out.println("You stand in front of the fridge. The surface is painted in" +
        " black and is as smooth as silk. You pull on the door.\n Nothing. You then notice" +
        " a number combination in the upper corner.");
        
        System.out.print("What could it be? ");
        String input = scanner.nextLine();
        
        if (input.equals("735")) {
            System.out.println("The door swings open. You gasp, as bottles of organoids lay" + 
            " on each of the shelves. Holding your breath, you take a closer look and find a" + 
            " crowbar laying inconspicuously in the back. Maybe this could be useful... you take it.");
            if (!inventory.hasItem("crowbar") || inventory.length() == 0) {
                System.out.println("You gasp, as bottles of organoids lay on each of the shelves." +
                " Holding your breath, you take a closer look and find a" + 
                " crowbar laying inconspicuously in the back. Maybe this could be useful... you take it.");
                
                inventory.addItem("crowbar");
            } else {
                System.out.println("There is nothing left to be found here.");
            }
        }  
    }

    @Override
    public int getChoiceMax() {
        return 4;
    }
}
