package practice.Polymorphism.LabAction;

public class Dislike extends Action{
    private final int DISLIKE_POINT = -1;
    
    public Dislike() {
        this.point = DISLIKE_POINT;
    }

    @Override
    public String showNotifications(int articleID) {
        // TODO Auto-generated method stub
        return String.format("Oh no, Someone DISLIKE your article (%d)", articleID);
    }
    
}
