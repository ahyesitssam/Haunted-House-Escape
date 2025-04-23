import java.util.HashSet;
import java.util.Set;
public class Inventory {
    private Set<String> inventory;
    int length = 0;

    public Inventory() { //creates inventory that collects items throughout the game
        this.inventory = new HashSet<>();
    }

    public void addItem(String item) { 
        inventory.add(item);
        length++;
    }

    public boolean hasItem(String item) {
        return inventory.contains(item);
    }

    public int length() {
        return length;
    }
}
