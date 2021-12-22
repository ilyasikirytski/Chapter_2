// Ввести n чисел с консоли. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

import java.util.Scanner;
public class A_1 {
    public static void main(String[] args) {
        System.out.println("Введите числа через пробел и нажмите <Enter> :");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String longWord = "";
        String shortWord = line;
        for (String s : line.split(" ")) {
            if (s.length() > longWord.length()) longWord = s;
            if (s.length() < shortWord.length()) shortWord = s;
        }
        System.out.printf("Самое длинное число: %s%n", longWord);
        System.out.printf("Длина: %s%n", longWord.length());
        System.out.printf("Самое короткое число: %s%n", shortWord);
        System.out.printf("Длина: %s%n", shortWord.length());
    }
}
