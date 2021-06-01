package RekursiveMethod;

public class FactorialRekursive1 {
    public static void main(String[] args) {
        int a = 2;
        // Integer[] number = {2, 3, 4, 7, 8, 10, 11, 14, 16};
        // int i = 0;

        System.out.println("Factorial Recursive Penjumlahan : ");
        System.out.println(factorialPlusRecursive(1));
        System.out.println("Factorial Recursive Penjumlahan Berlipat : ");
        System.out.println(factorialMinusRecursive(0, a));
        // System.out.println(factorialIntegerRekursive(number, i));
    }

    public static int factorialPlusRecursive(int value) {
        if (value == 6) {
            System.out.print(" = ");
            return 0;
        } else {
            System.out.print(value + " + ");
            return value + factorialPlusRecursive(value + 1);
        }
    }

    public static int factorialMinusRecursive(int value, int n) {
        if (value >= 52) {
            System.out.print(" = ");
            return 0;
        } else {
            System.out.print(value + " + ");
            if (n == 2) {
                n = 4;
                return value + factorialMinusRecursive(value + 2, n);
            } else {
                n = 2;
                return value + factorialMinusRecursive(value + 4, n);
            }
        }
    }
    // public static Integer[] factorialIntegerRekursive(Integer[] value, int a) {
    //     int i = 0;
    //     if (value[i] > 16) {
    //         return value;
    //     } else {
    //         // value[i + 1] = value[i] + value[i + 1];
    //         i++;
    //         return value[i - 1] + factorialIntegerRekursive(Integer[] value, value[i - 1] + value[i]);
    //     }
    // }
}
