import Input.Console;
import Input.InputProvider;
import Input.Start;
import Logic.GameLogic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Start nachalo = new Start();
        nachalo.Checker();

        if (Start.isGameRunning) {
            InputProvider inputProvider = new Console(scanner);
            GameLogic gameLogic = new GameLogic(inputProvider);
            gameLogic.playGame();
        }
    }
}
