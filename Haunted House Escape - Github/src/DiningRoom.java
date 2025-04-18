public class DiningRoom extends Room {
    private String description;
    private int choiceMax = 4;


    public DiningRoom(){
        this.description="*You enter the dining room*\nSpiderwebs cover the chairs and drawers are" + 
        "loaded with silverware and fine China sets.";  
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
            System.out.println("5. View painting on wall");
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
        return 5;
    }

}
