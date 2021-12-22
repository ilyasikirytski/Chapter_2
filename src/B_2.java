// Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.

import java.util.Scanner;
public class B_2 {
    public static void main(String[] args) {
        System.out.println("Введите одну цифру: и нажмите <Enter> :");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n; k++) {
                System.out.printf("%4d ", (i * k));
            }
            System.out.println("");
        }
    }
}
