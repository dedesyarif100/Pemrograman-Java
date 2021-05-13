// package files;

public class Perulangan {
    public static void main(String[] args) {
        for (int a = 1; a <= 15; a++) {
            System.out.print("");
            if (a == 8 || a == 10 || a == 13) {
                System.out.print(a);
                if (a == 13) break;
                System.out.print(", ");
            }
        }

        System.out.println("\nCase 1");
        int[] number1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int a = 0; a < number1.length; a++) {
            if (number1[0] == 1 || number1[a] == 2 || number1[a] == 5) {
                System.out.print(number1[a]);
            } else {
                System.out.print("-");
            }
            System.out.print(", ");
            if (number1[a] == 3 || number1[a] == 6) {
                System.out.println();
            }
        }

        System.out.println("\n\nCase 2");
        int c = 1;
        int d = 9;
        int n = 3;
        for (int StartTwo = c; StartTwo <= d; StartTwo++) {
            if (StartTwo == 2 || StartTwo == 1 || StartTwo == 4) {
                System.out.print(StartTwo);
            } else {
                System.out.print("-");
            }
            System.out.print(", ");
            if (StartTwo == 3 || StartTwo == 6) {
                System.out.println();
            }
        }

        System.out.println("\n\nCase 3");
        int e = 1;
        int f = 9;
        for (int StartThree = e; StartThree <= f; StartThree++) {
            if (StartThree == 3 || StartThree == 4 || StartThree == 7) {
                System.out.print(StartThree);
            } else {
                System.out.print("-");
            }
            System.out.print(", ");
            if (StartThree == 3 || StartThree == 6) {
                System.out.println();
            }
        }
    }
}
