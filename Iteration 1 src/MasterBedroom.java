public class MasterBedroom {
    private String description;

    public MasterBedroom(){
        this.description="*You enter the master bedroom*\nThe bedsheets are perfectly made, leaving behind no trace of anyone's presence.";
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
