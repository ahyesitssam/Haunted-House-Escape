public class Office extends Room {
    
    public Office(Inventory inventory) {
        super(inventory);
        this.description="The key you collected unlocks the office door! Everything is tidily "
        + "organized, calligraphy pens and paper pristinely laid out and a chair tucked neatly beneath the desk.";
    }

    @Override
	public int roomChoice() {
		int choice = 0;
		while (choice <= 0 || choice > 4) {
			System.out.println("-> Where will you go?");
			System.out.println("1. Office");
			System.out.println("2. Kitchen");
			System.out.println("3. Downstairs");
            System.out.println("4. Look through desk");
			System.out.print("Choose a number: ");
			choice = numberChoice(4);
		}	
		return choice;
	}

    @Override
    public void voidInteractionChoice() {
        System.out.println("You open the drawer, thankfully not requiring any code this time." +
        " Inside lies an envelope, which you pickup and peel open. What you pull out seems to reveal" +
        " a photo of the office. You notice there's an arrow pointing towards one of the walls, so you" +
        " decide to investigate what it means.");
        keyPress();
        System.out.println("You walk over to the wall. Looking up close, you notice a rectangular" +
        " outline in the paint--resembling something of a hidden door, except only a few square feet in size." +
        " You try pounding on and pushing against the wall, but to no avail, nothing moves.");
    }

    @Override
    public int getChoiceMax() {
        return 4;
    }
}
