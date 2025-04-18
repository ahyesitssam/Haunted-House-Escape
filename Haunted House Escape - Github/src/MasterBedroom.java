public class MasterBedroom extends Room {
    private String description;

    public MasterBedroom(){
        this.description="*You enter the master bedroom*\nThe bedsheets are perfectly made, " + 
        "leaving behind no trace of anyone's presence.";
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
            System.out.println("5. Open wardrobe");
			System.out.print("Choose a number: ");
			choice = numberChoice(5);
		}	
		return choice;
	}

    @Override
    public void voidInteractionChoice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'voidInteractionChoice'");
    }

    @Override
    public int getChoiceMax() {
        return 5;
    }
}
