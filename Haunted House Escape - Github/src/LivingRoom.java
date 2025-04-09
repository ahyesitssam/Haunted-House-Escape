/**
 * Class: LivingRoom  
 * Group: C  
 * Version: 1.0  
 * Course: CSE201 E  
 * Last Updated: March 6, 2025  
 *
 * Purpose: This class allows the player to enter the living room.
 */
public class LivingRoom extends Room {
 
    public LivingRoom(){
        this.description = "Looking aroud, this room appers to be a living room.\nThere's an arid coldness that fills the room, "  + 
    "and dust covers the sofas and surrounding furniture.";
    }

	@Override
	public int roomChoice() {
		return 0;
		
	}

	@Override
	public void interactionChoice() {
		// TODO Auto-generated method stub
		
	}
}

