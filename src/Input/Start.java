package Input;

import java.util.Scanner;

public class Start {

    public static boolean isGameRunning = false;

    public boolean Checker() {

        System.out.println("Вы бы хотели сыграть в Виселицу?\n" + "Варианты ответов - Да/Нет");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();


        switch (input) {
            case "ДА", "да", "Да" -> {
                isGameRunning = true;
                System.out.println("Да начнется игра!");
                return true;
            }
            case "НЕТ", "нет", "Нет" -> {
                System.out.println("Хорошо, так тому и быть");
                return false;
            }

            default -> {
                if (input.isEmpty()) {
                    System.out.println("Разучились писать?\n");
                    return Checker();
                }
                System.out.println("Вы ввели нечто некорректное " + input + " попробуйте еще раз!");
                return Checker();
            }
        }

    }
}
