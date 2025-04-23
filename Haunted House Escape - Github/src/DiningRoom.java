public class DiningRoom extends Room {

    public DiningRoom(Inventory inventory) {
        super(inventory);
        this.description="Spiderwebs cover the chairs and drawers are loaded with silverware and fine China sets.";  
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
            System.out.println("5. View painting on wall");
			System.out.print("Choose a number: ");
			choice = numberChoice(5);
		}	
		return choice;
	}

    @Override
    public void voidInteractionChoice() {
		System.out.println("You're lured to the painting on the wall, and gently dust its surface with your fingertips." 
        + " Underneath the debris lies a sad, brooding man with his hands clamped into fists and color drained from his"
        + " face. You go to dust the surface even more, and are shocked to find a faint sentence written in the bottom"
        + " corner: 'The second bell tolls twice, the first serpent coils thrice, and the final step echoes once in shadow.'"); // (code 3 2 1)
    }

    @Override
    public int getChoiceMax() {
        return 5;
    }

}
