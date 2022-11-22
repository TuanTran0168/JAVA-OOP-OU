package practice.Polymorphism.LabAction;

public class Love extends Action{
    private final int LOVE_POINT = 3;

    public Love() {
        this.point = LOVE_POINT;
    }

    @Override
    public String showNotifications(int articleID) {
        // TODO Auto-generated method stub
        return String.format("Oh!, Someone LOVE your article (%d)", articleID);
    }
    
}
