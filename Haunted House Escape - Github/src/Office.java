public class Office extends Room {
    private String description;

    public Office() {
        this.description="*You enter the office*\nEverything is tidily organized, "+
        "calligraphy pens and paper pristinely laid out.";
    }

	@Override
	public int roomChoice() {
		int choice = 0;
		while (choice <= 0 || choice > 5) {
			System.out.println("-> What will you do?");
			System.out.println("1. Room to the Left");
			System.out.println("2. Room to the Right");
			System.out.println("3. Down the hall in front of you");
			System.out.println("4. Upstairs");
            System.out.println("5. Look through desk");
			System.out.print("Choose a number: ");
			choice = numberChoice(5);
		}	
		return choice;
	}

    @Override
    public void voidInteractionChoice() {
        
    }

    @Override
    public int getChoiceMax() {
        return 5;
    }
}
