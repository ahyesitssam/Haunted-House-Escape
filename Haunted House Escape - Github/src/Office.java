public class Office extends Room {

    public Office(Inventory inventory) {
        super(inventory);
        this.description="*Everything is tidily organized, calligraphy pens and paper pristinely laid out.";
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
        
    }

    @Override
    public int getChoiceMax() {
        return 4;
    }
}
