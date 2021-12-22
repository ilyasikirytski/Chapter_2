import java.util.Scanner;

/* Определить принадлежность некоторого значения k интервалам (n, m], [n, m), (n, m), [n, m].
 */
public class B_1 {
    public static void main(String[] args) {
        System.out.println("Введите через пробел 3 цифры: и нажмите <Enter> :");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int m = scan.nextInt();
        boolean isInRange;
        System.out.println("некоторое значение k = " + k + " входит в следующие интервалы:");
        isInRange = k >= n && k < m;
        System.out.printf("(%s, %s, %s] %s%n", n, k, m, isInRange);
        isInRange = k > n && k <= m;
        System.out.printf("[%s, %s, %s) %s%n", n, k, m, isInRange);
        isInRange = k >= n && k <= m;
        System.out.printf("(%s, %s, %s) %s%n", n, k, m, isInRange);
        isInRange = k > n && k < m;
        System.out.printf("[%s, %s, %s] %s%n", n, k, m, isInRange);
    }
}
