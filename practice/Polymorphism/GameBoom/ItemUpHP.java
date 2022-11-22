package practice.Polymorphism.GameBoom;

public class ItemUpHP extends Item{
    private static int count;
    private int upHP;

    public ItemUpHP(int hp) {
        this.upHP = hp;
        this.idItem = String.format("B%02d", ++count);
    }

    @Override
    public void showItem() {
        // TODO Auto-generated method stub
        super.showItem();
        System.out.println("Your HP: " + this.upHP);
    }

    public int getUpHP() {
        return upHP;
    }
    public void setUpHP(int upHP) {
        this.upHP = upHP;
    }

}
