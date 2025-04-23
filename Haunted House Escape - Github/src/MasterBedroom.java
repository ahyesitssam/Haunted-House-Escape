public class MasterBedroom extends Room {

    public MasterBedroom(Inventory inventory) {
        super(inventory);
        this.description="The bedsheets are perfectly made, leaving behind no trace of anyone's presence.";
    }

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

    @Override
    public void voidInteractionChoice() {
        boolean exit  = false; 
        System.out.println("You walk up to the intimidatingly-sized wardrobe and pull on its handle");

        if (inventory.hasItem("key")) { //if user has key, there is nothing left to look for
            System.out.println("There is nothing left to be found here.");
        } else {
            System.out.println("The door won't budge, and you look down to find the doors bound together by a lock." +
            " Thinking back, you wonder if there was a clue that could've given you the combo.");
            
            while (!exit) { 
                System.out.print("What could it be? ");
                String input = scanner.nextLine();
            
                if (input.equals("321")) {
                    System.out.println("The lock comes undone, and you gasp in satisfaction. You find a" + 
                    " small, golden key. You start to think that finding an exit might be possible afterall," + 
                    " and quickly swipe the key into your pocket.");

                    inventory.addItem("key");
                    exit = true; //should exit while loop and finish method
                } else {
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
                }
            }
        } 
    }

    @Override
    public int getChoiceMax() {
        return 5;
    }
}
