public class Upstairs extends Room{

    public Upstairs(){
        this.description="A long hallway introduces a new set of rooms.";
    }

    @Override
	public int roomChoice() {
		int choice = 0;
		while (choice <= 0 || choice > 3) {
			System.out.println("-> Where will you go?");
			System.out.println("1. Office");
			System.out.println("2. Kitchen");
			System.out.println("3. Downstairs");
			System.out.print("Choose a number: ");
			choice = numberChoice(3);
		}	
		return choice;
	}

    @Override
    public void voidInteractionChoice() {

    }

    @Override
    public int getChoiceMax() {
        return 4; //choiceMax goes out of bounds (cannot be returned from roomChoice) 
                  //since there is no voidInteractionChoice to view in Upstairs, so enter method 
                  //in Room class will never bring user to voidInteractionChoice method
    }


}
