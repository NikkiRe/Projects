package Logic;

import Input.InputProvider;
import Input.Start;

import java.util.ArrayList;


public class GameLogic {
    int mistakeCount = 0;
    private final InputProvider inputProvider;

    public GameLogic(InputProvider inputProvider) {
        this.inputProvider = inputProvider;
    }

    Logic myLogic = new Logic();
    String resultString = myLogic.Decider().getValue();
    char[] resultChar = myLogic.Devider(resultString);

    public ArrayList<Character> resultList;

    public void setResultList() {
        resultList = new ArrayList<>(10);
        for (int i = 0; i < resultChar.length; i++) {
            resultList.add('_');
        }
    }


    public void playGame() {
        setResultList();
        while (Start.isGameRunning || resultList.contains('_') && mistakeCount < resultChar.length) {

            char ch = inputProvider.getInputChar();
//          int in = inputProvider.getInputInt(resultList.size());

            boolean found = false;
            for (int i = 0; i < resultChar.length; i++) {
                if (resultChar[i] == ch) {
                    resultList.set(i, ch);
                    found = true;
                }
            }

            if (found) {
                System.out.println("Правильно!");
                System.out.println(resultList + " - ваш прогресс на данный момент!");
            } else {
                mistakeCount++;
                System.out.println("Нет такой буквы! Ошибок: " + mistakeCount);
                System.out.println(resultList + " - это ваш успех :(");

            }


            if (!resultList.contains('_')) {
                System.out.println("Поздравляю! Вы выиграли!");
                System.out.println("Слово: " + resultList);
            } else if (mistakeCount >= resultChar.length) {
                System.out.println("Игра окончена! Слишком много ошибок.");
                System.out.println("Загаданное слово: " + new String(resultChar));
                Start.isGameRunning = false;
            }
        }
    }
}