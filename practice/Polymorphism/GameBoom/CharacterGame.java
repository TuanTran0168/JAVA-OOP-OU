package practice.Polymorphism.GameBoom;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CharacterGame {
    private static int count;
    private int idChar = ++count;
    private String nameChar;
    private List<Item> itemList;

    public CharacterGame(String nameChar) {
        this.nameChar = nameChar;
        this.itemList = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public int sumHP() {
        return this.itemList.stream().filter(item -> item instanceof ItemUpHP)
                .flatMapToInt(item -> IntStream.of(((ItemUpHP) item).getUpHP())).sum();
    }

    public int sumTurn() {
        // return this.itemList.stream().filter(item -> item instanceof ItemUpHP)
        //         .flatMapToInt(item -> IntStream.of(((ItemUpHP) item).getUpHP())).sum();
        int sum = 0;
        for (Item item : itemList) {
            if (item instanceof ItemUpTurn) {
                sum += ((ItemUpTurn) item).getUpTurn();
            }
        }
        return sum;
    }

    public void showCharacter() {
        System.out.println("ID of character: " + this.idChar);
        System.out.println("Name of character: " + this.nameChar);

        this.itemList.forEach(item -> item.showItem());

        System.out.println();

        // for (Item item : itemList) {
        // item.showItem();
        // }
    }

    public int getIdChar() {
        return idChar;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public String getNameChar() {
        return nameChar;
    }

    public void setNameChar(String nameChar) {
        this.nameChar = nameChar;
    }

    public void setIdChar(int idChar) {
        this.idChar = idChar;
    }

}
