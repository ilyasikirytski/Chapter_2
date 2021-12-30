
public class Factorial {
    public static void main(String[] args) {
        System.out.println(getFactorialLoop(4));
        System.out.println(getFactorialRecursion(4));
    }

    static int getFactorialLoop(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        return result;
    }

    static int getFactorialRecursion(int x) {
        if (x <= 0) {
            return 1;
        } else {
            return x * getFactorialRecursion(x - 1);
        }
    }
}

