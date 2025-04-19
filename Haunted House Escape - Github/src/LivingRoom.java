/**
 * Class: LivingRoom  
 * Group: C  
 * Version: 1.0  
 * Course: CSE201 E  
 * Last Updated: March 6, 2025  
 *
 * Purpose: This class allows the player to enter the living room.
 */
public class LivingRoom extends Room { 
 
    public LivingRoom() {
        this.description = "Looking aroud, this room appers to be a living room. There's an arid chill that fills the room, "  + 
        "and dust covers the surrounding sofas and furniture.";
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
            System.out.println("5. Bookshelf in the corner");
			System.out.print("Choose a number: ");
			choice = numberChoice(5);
		}	
		return choice;
	}

	@Override
	public void voidInteractionChoice() { //bookshelf gives player code 
		boolean exit = false;

		System.out.print("*You're standing in front of the bookshelf, piled with books that look like" 
		+ "they date back many centuries.*\nMaybe I can look through some of the books?");
		while (!exit) {
			System.out.println("-> What book will you view?");
			System.out.println("1. Book 1");
			System.out.println("2. Book 2");
			System.out.println("3. Book 3");
			System.out.println("4. Book 4");
			System.out.println("5. Book 5");
			System.out.println("6. Leave bookshelf");

			int choice = scanner.nextInt();

        	switch (choice) {
            	case 1:
                	System.out.println("You open the first book. When you spread the pages, nothing but dust falls" +
					" out and floods your nostrils. Disgusted, you quickly shove it back in its place.");
                	break;
            	case 2:
                	System.out.println("You take the second book and cautiously pry it open-careful not to damage its" +
					" fragile structure. You're frightened to find a few blood stains tainting the pages, and swiftly put in back. ");
                	break;
            	case 3:
                	System.out.println("You reach out for the third book, which possessed a beautiful, green leather exterior." +
					" You're relieved to find nothing unsettling inside, and carefully place it back on its shelf.");
                	break;
            	case 4:
                	System.out.println("Lifting the fourth book, you notice a slight increase in heaviness. Intrigued, you open" +
					" its contents to reveal a hidden compartment. Laying inside is a wooden block with a message carved into the" +
					" surface, reading: Before Seven Bells Sound, Seek Three Shadows--Each Silent, Each Still, Each Beginning with F.");
                	break;
            	case 5:
                	System.out.println("You take the fifth book and hastily open it. Disappointed, there was nothing of interest inside." +
					" Even the pages were blank, so you decide to put it back.");
                	break;
            	case 6:
					System.out.println("You step away from the bookshelf.");
					exit = true;
					break;
        	}
		}		
	}

	@Override
	public int getChoiceMax() {
		return 5;
	}
}

