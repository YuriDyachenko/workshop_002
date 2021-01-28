package kurs;

//Надо написать функцию, которая на вход принимает текстовое значение и число - указание максимальной длины.
//Результатом ее работы должен стать анализ этого текста по следующим правилам:
//- Функция должна напечатать количество символов в тексте.
//- Функция должна напечатать количество символов без учета пробелов.
//- Функция должна напечатать "количество символов в тексте четное" или "количество символов в тексте нечетное"
//в зависимости от количества символов (тут пробелы учитываем).
//- Функция должна напечатать "длина текста превышает длину {N} символов", где N - это целочисленное значение,
//которое передается вторым параметром в функцию. Само собой, если на самом деле длина текста меньше максимальной,
//то это писать не надо.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        System.out.print("Введите максимальную длину: ");
        int maxLength = scanner.nextInt();
        textAnalysis(text, maxLength);
        scanner.close();
    }

    private static void textAnalysis(String text, int maxLength) {
        int textLength = text.length();
        System.out.printf("Количество символов в тексте: %d\n", textLength);

        String textWithoutSpaces = text.replace(" ", "");
        int textWithoutSpacesLength = textWithoutSpaces.length();
        System.out.printf("Количество символов без учета пробелов: %d\n", textWithoutSpacesLength);

        System.out.printf("Количество символов в тексте %s\n", textLength % 2 == 0 ? "четное" : "нечетное");

        if (textLength > maxLength)
            System.out.printf("Длина текста превышает длину %d символов\n", maxLength);
    }
}
