import java.util.Scanner;

public class UserInteraction {
    private Scanner scanner;

    public UserInteraction() {
        this.scanner = new Scanner(System.in);
    }

    public void keyPress() { 
        System.out.println("[Press 'Enter' to continue...]");
        scanner.nextLine();
    }
}
