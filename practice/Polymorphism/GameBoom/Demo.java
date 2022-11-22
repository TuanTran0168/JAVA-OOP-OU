package practice.Polymorphism.GameBoom;

public class Demo {
    public static void main(String[] args) {
        CharacterGame c1 = new CharacterGame("Songoku");
        c1.addItem(new ItemUpHP(1000));
        c1.addItem(new ItemUpHP(3000));
        c1.addItem(new ItemUpHP(1000));
        c1.addItem(new ItemUpTurn(5));
        c1.addItem(new ItemUpTurn(5));
        c1.addItem(new ItemUpTurn(20));

        CharacterGame c2 = new CharacterGame("Vegeta");
        c2.addItem(new ItemUpHP(1000));
        c2.addItem(new ItemUpTurn(5));

        CharacterGame c3 = new CharacterGame("Jiren");
        c3.addItem(new ItemUpHP(1000));
        c3.addItem(new ItemUpTurn(5));
        c3.addItem(new ItemUpHP(7000));

        CharacterGame c4 = new CharacterGame("Cadic");
        c4.addItem(new ItemUpHP(1000));
        c4.addItem(new ItemUpTurn(5));

        CharacterGame c5 = new CharacterGame("Tuan");
        c5.addItem(new ItemUpHP(1000));
        c5.addItem(new ItemUpTurn(5));

        c1.showCharacter();
        c2.showCharacter();
        c3.showCharacter();
        c4.showCharacter();
        c5.showCharacter();

        System.out.println(c1.sumHP());

        CharacterManagement characterList = new CharacterManagement();
        characterList.addCharacter(c1);
        characterList.addCharacter(c2);
        characterList.addCharacter(c3);
        characterList.addCharacter(c4);
        characterList.addCharacter(c5);

       System.out.println( characterList.findTurnsOfCharacter(1));
       characterList.findBestHPOfCharacter().forEach(character -> character.showCharacter());;
    }
}
