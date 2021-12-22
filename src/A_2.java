//Ввести n чисел с консоли. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
import java.util.Scanner;

public class A_2 {
    public static void main(String[] args) {
        System.out.print("Сколько целых чисел вы собираетесь ввести? :");
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        String[] str = new String[size];
        System.out.println("Введите числа через пробел и нажмите <Enter> :");
        for (int i = 0; i < str.length; i++) {
            str[i] = scan.next();
        }
        for (int i = str.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (str[j].length() > str[j + 1].length()) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
