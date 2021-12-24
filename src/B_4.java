/* Ввести число от 1 до 12.
 Вывести на консоль название месяца, соответствующего данному числу.
 Осуществить проверку корректности ввода чисел.
 */

import java.util.Scanner;

/**
 * TODO switch (line) {
 * case 1: {
 * break;
 * }
 * case 2: {
 * break;
 * }
 * }
 * <p>
 * Обычный switch
 */
public class B_4 {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 12 и нажмите <Enter> :");
        Scanner scan = new Scanner(System.in);
        int line = scan.nextInt();
        if (line > 0 && line < 12) {
            switch (line) {
                case 1: {
                    System.out.println("Январь");
                    break;
                }
                case 2: {
                    System.out.println("Февраль");
                    break;
                }
                case 3: {
                    System.out.println("Март");
                    break;
                }
                case 4: {
                    System.out.println("Апрель");
                    break;
                }
                case 5: {
                    System.out.println("Май");
                    break;
                }
                case 6: {
                    System.out.println("Июнь");
                    break;
                }
                case 7: {
                    System.out.println("Июль");
                    break;
                }
                case 8: {
                    System.out.println("Август");
                    break;
                }
                case 9: {
                    System.out.println("Сентябрь");
                    break;
                }
                case 10: {
                    System.out.println("Октябрь");
                    break;
                }
                case 11: {
                    System.out.println("Ноябрь");
                    break;
                }
                case 12: {
                    System.out.println("Декабрь");
                    break;
                }
            }
        } else System.out.println("Вы ввели неверное число");
    }
}
