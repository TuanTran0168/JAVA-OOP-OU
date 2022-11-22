package practice.Polymorphism.LabAction;

public class Like extends Action {
    private final int LIKE_POINT = 2;

    public Like() {
        this.point = LIKE_POINT;
    }

    // {
    //     point = 2;
    // }

    @Override
    public String showNotifications(int articleID) {
        // TODO Auto-generated method stub
        return String.format("Wow, Someone LIKE your article (%d)", articleID);
    }
    
}
