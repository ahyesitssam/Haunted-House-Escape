public class LivingRoom {
    private String description;

    public LivingRoom(){
        this.description="*You enter the house where you are greeted to the living room*\nThere's an arid coldness that fills the room, and dust covers the sofas and surrounding furniture.";
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
