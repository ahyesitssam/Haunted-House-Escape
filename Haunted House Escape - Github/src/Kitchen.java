/**
 * Class: Kitchen  
 * Group: C  
 * Version: 1.0  
 * Course: CSE201 E  
 * Last Updated: March 6, 2025
 * 
 * Purpose:
 */
public class Kitchen extends Room {
    private String description;

    public Kitchen(){
        this.description="*You enter the kitchen*\nThe pantries are all empty except for plates and utensils. " + 
        "Water slowly drips from the faucet.";
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
            System.out.println("5. View fridge");
			System.out.print("Choose a number: ");
			choice = numberChoice(4);
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
