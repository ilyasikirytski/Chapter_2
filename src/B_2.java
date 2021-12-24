// Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.

/**
 * TODO
 * 1    2    3    4    5
 * 6    7    8    9    10
 * 11   12   13   14   15
 * 16   17   18   19   20
 * 21   22   23   24   25
 * <p>
 * TODO
 * 1   6   11   16   21
 * 2   7   12   17   22
 * 3   8   13   18   23
 * 4   9   14   19   24
 * 5   10  15   20   25
 */

import java.util.Scanner;

public class B_2 {
    public static void main(String[] args) {
        System.out.println("Введите одну цифру: и нажмите <Enter> :");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Матрица N*N");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n; k++) {
                System.out.print("\t" + (i * k));
            }
            System.out.println();
        }
        System.out.println("По очерёдно - слева направо");
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print("\t" + (k + (n * i) + 1));
            }
            System.out.println();
        }
        System.out.println("По очерёдно - сверху вниз");
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                System.out.print("\t" + (k + (n * i) + 1));
            }
            System.out.println();
        }
    }
}
