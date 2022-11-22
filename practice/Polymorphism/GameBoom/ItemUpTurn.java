package practice.Polymorphism.GameBoom;

public class ItemUpTurn extends Item {
    private static int count;
    private int upTurn;

    public ItemUpTurn (int Turn) {
        this.upTurn = Turn;
        this.idItem = String.format("A%02d", ++count);
    }

    @Override
    public void showItem() {
        // TODO Auto-generated method stub
        super.showItem();
        System.out.println("Your turn: " + this.upTurn);
    }

    public int getUpTurn() {
        return upTurn;
    }

    public void setUpTurn(int upTurn) {
        this.upTurn = upTurn;
    }
}
