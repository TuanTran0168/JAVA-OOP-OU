package practice.Polymorphism.GameBoom;

public abstract class Item {
    protected String idItem;

    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    public void showItem() {
        System.out.println("ID of Item: " + this.idItem);
    }
}
