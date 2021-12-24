// Ввести n чисел с консоли. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину

import java.util.Scanner;

public class A_3 {
    public static void main(String[] args) {
        System.out.print("Сколько целых чисел вы собираетесь ввести? :");
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        String[] str = new String[size];
        System.out.println("Введите числа через пробел и нажмите <Enter> :");
        for (int i = 0; i < str.length; i++) {
            str[i] = scan.next();
        }
        int sumOfNumbers = 0;
        for (String s : str) {
            sumOfNumbers += s.length();
        }
        int average = sumOfNumbers/size;
        System.out.printf("Средняя длинна строки: %s%n", average);
        for (String s : str) {
            if (s.length() > average) {
                System.out.printf("Строчки которые больше средней длинны : %s%n", s);
            }
        }
    }
}
