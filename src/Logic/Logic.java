package Logic;

import java.util.Random;
import Enum.Dictionary;

public class Logic {
    public Dictionary Decider() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(9);

        switch (randomNumber) {
            case 0: return Dictionary.LAMB;
            case 1: return Dictionary.CAT;
            case 2: return Dictionary.DOG;
            case 3: return Dictionary.BIRD;
            case 4: return Dictionary.FISH;
            case 5: return Dictionary.HORSE;
            case 6: return Dictionary.COW;
            case 7: return Dictionary.PIG;
            case 8: return Dictionary.SHEEP;
            default: return Dictionary.LAMB;
        }
    }

    public char[] Devider(String character) {
        char[] charArray = character.toCharArray();
        System.out.println("Длина загаданного слова = " + character.length());
        return charArray;
    }
}
