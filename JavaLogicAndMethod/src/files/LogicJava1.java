// package files;
// import java.util.Scanner;

public class LogicJava1 {
    public static void main(String[] args) {
        System.out.println("Logic Perulangan For");
        for (int a = 0; a <= 10; a++) {
            System.out.print(a);
            if (a == 10) break;
            System.out.print(", ");
        }

        System.out.print("\n");
        int angka1;
        int angka2 = 20;
        for (angka1 = 0; angka1 <= angka2; angka1++) {
            System.out.print(angka1);
            if (angka1 == 20) break;
            System.out.print(", ");
        }

        System.out.print("\n");
        System.out.println("Logic Perulangan Looping Array");
        int[][] myNumber = {{10, 20, 30, 40}, {50, 60, 70}};
        for (int i = 0; i < myNumber.length; i++) {
            for (int j = 0; j < myNumber[i].length; j++) {
                System.out.print(myNumber[i][j]);
                System.out.print(", ");
            }
        }

        System.out.print("\n");
        int[][] loopAngka = {{10, 20, 30, 40}, {50, 60, 70, 80}};
        int x = 0;
        while (x < loopAngka.length) {
            int y = 0;
            while (y < loopAngka[x].length) {
                System.out.print(loopAngka[x][y]);
                System.out.print(", ");
                y++;
            }
            x++;
        }

        System.out.print("\n");
        String[] abjad = {"A", "B", "C", "D"};
        for (String i : abjad) {
            System.out.print(i);
            System.out.print(", ");
        }

        System.out.print("\n");
        int[] angka = {1, 2, 3, 4};
        for (int a : angka) {
            System.out.print(a);
            System.out.print(", ");
        }

        System.out.print("Logic If Ternary");
        System.out.print("\n");
        int time = 20;
        String times = (time < 18) ? "Morning" : "Evening";
        System.out.println(times);

        int weather = 32;
        int weathers = (weather < 5) ? 1
            : (weather < 10) ? 2
            : (weather < 15) ? 3
            : (weather < 20) ? 4
            : (weather < 25) ? 5
            : (weather < 30) ? 6 
            : 7;
        System.out.println(weathers);

        System.out.print("Login Java Comparison Operators");
        int nilai1 = 10;
        int nilai2 = 20;
        System.out.println(nilai1 == nilai2);
        System.out.println(nilai1 != nilai2);
        System.out.println(nilai1 != nilai2);
        System.out.println(nilai1 < nilai2);
        System.out.println(nilai1 <= nilai2);
        System.out.println(nilai1 > nilai2);
        System.out.println(nilai1 >= nilai2);
        boolean bool = (nilai1 < nilai2) ? true : false;
        System.out.println(bool);

        System.out.println("Automatic casting: int to double");
        int angkaInt2 = 9;
        double angkaDouble2 = angkaInt2;
        System.out.println(angkaInt2);
        System.out.println(angkaDouble2);

        System.out.println("Manual casting: double to int");
        double myDouble = 10.5;
        int myInt = (int) myDouble; // Manual casting: double to int
        System.out.println(myDouble);   // Outputs 10.5
        System.out.println(myInt);
        
        System.out.println("Manual casting: double to int");
        double angkaKoma1 = 19.3;
        int angkaInt1 = (int) angkaKoma1;
        System.out.println(angkaKoma1);
        System.out.println(angkaInt1);

        int[][] variabelN = {{10, 20, 30, 40}, {50, 60, 70, 80, 90, 100}, {110, 120, 130, 140}};
        for (int n = 0; n < variabelN.length; n++) {
            for (int m = 0; m < variabelN[n].length; m++) {
                if (variabelN[n][m] >= 40 && variabelN[n][m] < 70) {
                    System.out.print(" 1, ");
                } else {
                    System.out.print(variabelN[n][m] + ", ");
                }
            }
        }
        System.out.println();
        int[][] board = new int[4][4];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = row * col;
                System.out.print(board[row][col] + "\t");
            }
            System.out.println();
        }
        // int m = 0;
        // while (m < variabelN.length) {
        //     System.out.print(variabelN[m] + ", ");
        //     m++;
        // }
    }
}
