package Input;

import java.util.Scanner;


public class Console implements InputProvider {

    private final Scanner scanner;

    public Console(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public char getInputChar() {
        String input;
        do {
            System.out.println("Введите вашу догадку: ");

            input = scanner.nextLine();
            if (input.length() != 1) {
                System.out.println("Прошу, введите только одну букву!");
            }
        } while (input.length() != 1);
        return input.charAt(0);
    }

//    @Override
//    public int getInputInt(int maxLength) {
//        int input;
//        do {
//            System.out.println("Введите позицию вашей буквы с длинной слова в " + maxLength + " букв ");
//
//            while (!scanner.hasNextInt()) {
//                System.out.println("Ошибка! Введите число!");
//                scanner.next();
//            }
//
//            input = scanner.nextInt();
//            if (input < 1 || input > maxLength) {
//                System.out.println("Ошибка! Позиция должна быть от 1 до " + maxLength);
//            }
//        } while (input < 1 || input > maxLength);
//        return input;
//    }

}
