// Ввести n чисел с консоли. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину

import java.util.Arrays;
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
        int[] mid = new int[size];
        for (int i = 0; i < str.length; i++) {
            mid[i] = (str[i].length() - str[i].length() / 2);
        }
        double average = Arrays.stream(mid).average().getAsDouble();
        System.out.printf("Средняя длинна строки: %s%n", average);
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > mid[i]){
                System.out.printf("Строчки которые больше средней длинны : %s%n", str[i]);
            }
        }
    }
}
