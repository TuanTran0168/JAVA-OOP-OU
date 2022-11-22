package practice.Polymorphism.GameBoom;

import java.util.ArrayList;
import java.util.List;

public class CharacterManagement {
    private List<CharacterGame> charList = new ArrayList<CharacterGame>();

    public List<CharacterGame> getCharList() {
        return charList;
    }

    public List<CharacterGame> findBestHPOfCharacter() {
        int bestHP = 0;
        for (CharacterGame characterGame : charList) {
            int hp = characterGame.sumHP();
            if (hp > bestHP) {
                bestHP = hp;
            }
        }
        
        List<CharacterGame> bestHpCharList = new ArrayList<CharacterGame>();
        for (CharacterGame characterGame : charList) {
            int hp = characterGame.sumHP();
            if (hp == bestHP)
                bestHpCharList.add(characterGame);

        }
        return bestHpCharList;
    }

    public int findTurnsOfCharacter(int idChar) {

        // return this.charList.stream().filter(character -> character.getIdChar() ==
        // idChar).findFirst().get().sumTurn();
        for (CharacterGame characterGame : charList) {
            if (characterGame.getIdChar() == idChar)
                return characterGame.sumTurn();
        }
        return -1;
    }

    public int findHPOfCharacter(int idChar) {

        return this.charList.stream().filter(character -> character.getIdChar() == idChar).findFirst().get().sumHP();
        // for (CharacterGame characterGame : charList) {
        // if (characterGame.getIdChar() == idChar)
        // return characterGame.sumTurn();
        // }
        // return -1;
    }

    public void setCharList(List<CharacterGame> charList) {
        this.charList = charList;
    }

    public void addCharacter(CharacterGame character) {
        this.charList.add(character);
    }
}
