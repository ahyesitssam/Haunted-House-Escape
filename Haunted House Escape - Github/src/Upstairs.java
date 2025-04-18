public class Upstairs {
    private String description;

    public Upstairs(){
        this.description="*You walk upstairs*\nA long hallway introduces a new set of rooms.";
    }

    public void enter(){
        System.out.println(description);
    }

}
