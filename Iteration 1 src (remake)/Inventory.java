import java.util.HashSet;
import java.util.Set;

/**
 * Class: Inventory  
 * Author: Elena Levine  
 * Version: 1.0  
 * Course: CSE201 E  
 * Written: March 4, 2025  
 *
 * Purpose: This creates an inventory of all the items
 * the player may obtain throughout the course of the game.
 */
public class Inventory {

    private Set<String> inventory;

    /**
     * Constructor that initializes the player's inventory
     * as a HashSet of items.
     */
    public Inventory() {
        this.inventory = new HashSet<>();
    }

    /**
     * Method that allows player to add an item to the inventory.
     * 
     * @param item The item to be added to the inventory.
     */
    public void addItem(String item) {
        inventory.add(item);
    }

    /**
     * Method returns whether the player has the specified item in the inventory.
     * 
     * @param item The item to check in the inventory.
     * @return true if the inventory contains the item, false otherwise.
     */
    public boolean hasItem(String item) {
        return inventory.contains(item);
    }
}
