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

    public Kitchen(){
        this.description="The pantries are all empty except for plates and utensils. " + 
        "Water slowly drips from the faucet.";
    }

    @Override
	public int roomChoice() {
		int choice = 0;
		while (choice <= 0 || choice > 4) {
			System.out.println("-> Where will you go?");
			System.out.println("1. Office");
			System.out.println("2. Kitchen");
			System.out.println("3. Downstairs");
            System.out.println("4. View fridge");
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
        return 4;
    }
}
