/* Ввести число от 1 до 12.
 Вывести на консоль название месяца, соответствующего данному числу.
 Осуществить проверку корректности ввода чисел.
 */

import java.util.Scanner;

/**
 * TODO switch (line) {
 *   case 1: {
 *       break;
 *   }
 *   case 2: {
 *       break;
 *    }
 *  }
 *
 *  Обычный switch
 */
public class B_4 {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 12 и нажмите <Enter> :");
        Scanner scan = new Scanner(System.in);
        int line = scan.nextInt();
        if (line > 0 && line < 12) {
            switch (line) {
                case 1 -> System.out.println("Январь");
                case 2 -> System.out.println("Февраль");
                case 3 -> System.out.println("Март");
                case 4 -> System.out.println("Апрель");
                case 5 -> System.out.println("Май");
                case 6 -> System.out.println("Июнь");
                case 7 -> System.out.println("Июль");
                case 8 -> System.out.println("Август");
                case 9 -> System.out.println("Сентябрь");
                case 10 -> System.out.println("Октябрь");
                case 11 -> System.out.println("Ноябрь");
                case 12 -> System.out.println("Декабрь");
            }
        } else System.out.println("Вы ввели неверное число");
    }
}
