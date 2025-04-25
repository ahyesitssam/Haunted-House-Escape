/**
 * Class: LivingRoom  
 * Group: C  
 * Version: 1.5  
 * Course: CSE201 E  
 * Last Updated: April 24th, 2025  
 *
 * Purpose: This class allows the player to enter the living room.
 */

 
/*
 * ALECS UPDATES
 *  1) Made global ArrayLists to house option list and book description list
 *  2) updated logic in switch case to use arraylists
 *  3) moved switch case to seperate method for single uses respondibility or whatever
 */
import java.util.ArrayList;
public class LivingRoom extends Room { 
		
	private static ArrayList<String> optionList = new ArrayList<>();
	private static ArrayList<String> bookDescList = new ArrayList<>();
    
	public LivingRoom(Inventory inventory) {
        super(inventory);
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
		
		// initialize arraylists
		getOptionList();
		getBookDescList();
		

		System.out.print("*You're standing in front of the bookshelf, piled with books that look like" 
		+ "they date back many centuries.*\nMaybe I can look through some of the books?");
		while (!exit) {
			System.out.println("-> What book will you view?");
			
			// prints out user options, unless its null, it skips that option
			for (int i = 0; i < optionList.size(); i++) {
				if (optionList.get(i) != null) {
					System.out.println(optionList.get(i));
				} 
			}

			int choice = scanner.nextInt();
        	exit = handleUserInput(choice); //handles user input, upadtes exit variable if user chose to leave
		}		
	}

	@Override
	public int getChoiceMax() {
		return 5;
	}

	/**
	 * Houses the switch case statement. Prints corresponding message to user choice.
	 * @param choice The users choice
	 * @return True, if the user has chosen to exit the bookshelf. False otherwise
	 */
	private static boolean handleUserInput(int choice) {
		switch (choice) {
			case 1:
				if (bookDescList.get(0) != null) {
					System.out.println(bookDescList.get(0));
					optionList.set(0, null);
					bookDescList.set(0, null);
				} else {
					System.out.println("Looks like you've already looked at this book");
				}
				break;
			case 2:
				if (bookDescList.get(1) != null) {	
					System.out.println(bookDescList.get(1));
					optionList.set(1, null);
					bookDescList.set(1, null);
				} else {
					System.out.println("Looks like you've already looked at this book");
				}
				break;
			case 3:
				if (bookDescList.get(2) != null) {
					System.out.println(bookDescList.get(2));
					optionList.set(2, null);
					bookDescList.set(2, null);
				} else {
					System.out.println("Looks like you've already looked at this book");
				}
				break;
			case 4:
				if (bookDescList.get(3) != null) {
					System.out.println(bookDescList.get(3));
					optionList.set(3, null);
					bookDescList.set(3, null);
				} else {
					System.out.println("Looks like you've already looked at this book");
				}
				break;
			case 5:
				if (bookDescList.get(4) != null) {
					System.out.println(bookDescList.get(4));
					optionList.set(4, null);
					bookDescList.set(4, null);
				} else {
					System.out.println("Looks like you've already looked at this book");
				}
				break;
			case 6:
				System.out.println(bookDescList.get(5));
				bookDescList.clear(); //resets the lists for future visits back
				optionList.clear();
				return true;
			
		}
		return false;
	}
	
	/**
	 * Initializes the option list with values.
	 * @return the populated arraylist
	 */
	private static void getOptionList() {
		//ArrayList<String> optionList = new ArrayList<>();
		optionList.add("1. Book 1");
		optionList.add("2. Book 2");
		optionList.add("3. Book 3");
		optionList.add("4. Book 4");
		optionList.add("5. Book 5");
		optionList.add("6. Leave Bookshelf");
		//return optionList;
	}
	
	/**
	 * Initializes the book description list with values.
	 * @return the populated arraylist
	 */
	private static void getBookDescList() {
		bookDescList.add("You open the first book. When you spread the pages, nothing but dust falls" +
					" out and floods your nostrils. Disgusted, you quickly shove it back in its place.");
		bookDescList.add("You take the second book and cautiously pry it open-careful not to damage its" +
					" fragile structure. You're frightened to find a few blood stains tainting the pages, and swiftly put in back. ");
		bookDescList.add("You reach out for the third book, which possessed a beautiful, green leather exterior. " + 
						"You're relieved to find nothing unsettling inside, and carefully place it back on its shelf.");
		bookDescList.add("Lifting the fourth book, you notice a slight increase in heaviness. Intrigued, you open " + 
						"its contents to reveal a hidden compartment. Laying inside is a wooden block with a message carved into the" + 
						" surface, reading: Before Seven Bells Sound, Seek Three Shadows--Each With Five Arms");
		bookDescList.add("You take the fifth book and hastily open it. Disappointed, there was nothing of interest inside." +
					" Even the pages were blank, so you decide to put it back.");
		bookDescList.add("You step away from the bookshelf.");
	}
}

