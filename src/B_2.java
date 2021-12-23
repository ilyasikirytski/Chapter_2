// Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.

/**
 *   1    2    3    4    5
 *   6    7    8    9    10
 *   11   12   13   14   15
 *   16   17   18   19   20
 *   21   22   23   24   25
 *
 *   1   6   11   16   21
 *   2   7   12   17   22
 *   3   8   13   18   23
 *   4   9   14   19   24
 *   5   10  15   20   25
 */
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
