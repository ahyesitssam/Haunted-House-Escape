import java.util.Scanner;
/**
 * Class: Outside  
 * Group: C  
 * Version: 1.0  
 * Course: CSE201 E  
 * Last Updated: March 6, 2025
 * 
 * Purpose:
 */
public abstract class Outside {
	protected String description;
	protected Scanner scanner = new Scanner(System.in);
	
	
	// Use to add a pause between dialogue
    public void keyPress() {
        System.out.println("[Press 'Enter' to continue...]");
        scanner.nextLine();
    }
    
	public abstract void enter();
}
