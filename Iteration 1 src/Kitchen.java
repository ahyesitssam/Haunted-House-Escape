public class Kitchen {
    private String description;

    public Kitchen(){
        this.description="*You enter the kitchen*\nThe pantries are all empty except for plates and utensils. Water drips from the faucet.";
    }

    public void enter(){
        System.out.println(description);
    }
/*
    public void inspect(){
        System.out.println()
    }
    
    public void moveOn(){
        System.out.println()
    }
*/

}
