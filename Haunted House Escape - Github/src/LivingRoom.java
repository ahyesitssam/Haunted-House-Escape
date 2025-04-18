import java.util.ArrayList;

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
	private ArrayList<String> list = new ArrayList<>();
		
    public LivingRoom() {
        this.description = "Looking aroud, this room appers to be a living room.\nThere's an arid chill that fills the room, "  + 
        "and dust covers the surrounding sofas and furniture. \nIn the corner lies a bookshelf, out of curiosity, you walk towards it";

		list.add("The book on the left, its dusty, red, and looks ancient");
		list.add("The second book, its blue, and torn up.");
		list.add("The book third, Its purple, and in good condition.");
		list.add("The book on the far right, its light green and newer."); 
    }

	@Override
	public int roomChoice() {
		return 0;
		
	}

	/*
	 * Can pick books at random
	 * correct book shows clue
	 * incorrect book shows random
	 */
	@Override
	public int interactionChoice() {
		int choice = 0;
		
		while (choice <= 0 || choice > 4) {
			System.out.println("-> Pick a book.");
			for (int i = 0; i < list.size(); i++) {
				if (!(list.get(i) == null)) {
					System.out.println((i + 1) + ". " + list.get(i));
				}
				
			}
			System.out.print("Choose a number: ");
			choice = numberChoice(4);
			list.set(choice - 1, null);
		}

		bookShelfInteraction(choice);
		
		
		return choice;
	}
	private void bookShelfInteraction(int choice) {
		switch (choice) {
			case 1:
				System.out.println("bad choice");
				this.interactionChoice();
				break;
			
		}
	}
}

