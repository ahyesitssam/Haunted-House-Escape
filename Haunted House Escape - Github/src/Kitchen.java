/**
 * Class: Kitchen  
 * Group: C  
 * Version: 1.0  
 * Course: CSE201 E  
 * Last Updated: March 6, 2025
 * 
 * Purpose:
 */
public class Kitchen {
    private String description;

    public Kitchen(){
        this.description="*You enter the kitchen*\nThe pantries are all empty except for plates and utensils. " + 
        "Water slowly drips from the faucet.";
    }

    public void enter() {
        System.out.println(description);
    }

}
