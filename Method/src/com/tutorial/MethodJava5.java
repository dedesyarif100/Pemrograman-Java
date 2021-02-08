package com.tutorial;

class TypeData {
    int[] number1;
    String[] kata;
    double[] numberFloat;
    int[][] myNumbers;

    TypeData(int[] number1, String[] kata, double[] numberFloat, int[][] myNumbers) {
        this.number1 = number1;
        this.kata = kata;
        this.numberFloat = numberFloat;
        this.myNumbers = myNumbers;
    }
}

public class MethodJava5 {
    public static void main(String[] args) {
        int[] dataArray1 = {1,2,3,4};

        String[] dataArray2 = {"A", "B", "C", "D"};

        double[] dataArray3 = {1.2, 2.2, 3.2, 4.2};
        
        int[][] dataArray4 = {  
            {10, 20, 30, 40}, 
            {50, 60, 70, 80},
            {90, 100, 110, 120},
            {130, 140, 150, 160},
        };

        TypeData tampilkanDataInt = new TypeData(dataArray1, dataArray2, dataArray3, dataArray4);
        System.out.println("Tampilkan Data Integer");
        for (int a = 0; a < tampilkanDataInt.number1.length; a++) {
            System.out.print(tampilkanDataInt.number1[a]);
            if (a == 3) break;
            System.out.print(", ");
        }


        TypeData tampilkanDataString = new TypeData(dataArray1, dataArray2, dataArray3, dataArray4);
        System.out.println("\n\nTampilkan Data String");
        int b = 0;
        while (b < tampilkanDataString.kata.length) {
            System.out.print(tampilkanDataString.kata[b]);
            if (b == 3) break;
            System.out.print(", ");
            b++;
        }

        TypeData tampilkanDataDouble = new TypeData(dataArray1, dataArray2, dataArray3, dataArray4);
        System.out.println("\n\nTampilkan Data Double");
        for (int c = 0; c < tampilkanDataDouble.numberFloat.length; c++) {
            System.out.print(tampilkanDataDouble.numberFloat[c]);
            if (c == 3) break;
            System.out.print(", ");
        }

        TypeData tampilkanArrayIntDinamis = new TypeData(dataArray1, dataArray2, dataArray3, dataArray4);    
        System.out.println("\n\nTampilkan Data Integer");
        for (int d = 0; d < tampilkanArrayIntDinamis.myNumbers.length; d++) {
            for (int e = 0; e < tampilkanArrayIntDinamis.myNumbers[d].length; e++) {
                System.out.print(tampilkanArrayIntDinamis.myNumbers[d][e]);
                if (d == 3 && e == 3) break;
                System.out.print(", ");
                if (e == 3) {
                    System.out.println();
                }
            }
        }

        int[] tampungData1;
        tampungData1 = dataArray4[0];
        dataArray4[0] = dataArray4[1];
        dataArray4[1] = tampungData1;

        int[] tampungData2;
        tampungData2 = dataArray4[2];
        dataArray4[2] = dataArray4[3];
        dataArray4[3] = tampungData2;

        System.out.println("\n\nTampilkan Data Integer");
        for (int d = 0; d < tampilkanArrayIntDinamis.myNumbers.length; d++) {
            for (int e = 0; e < tampilkanArrayIntDinamis.myNumbers[d].length; e++) {
                System.out.print(tampilkanArrayIntDinamis.myNumbers[d][e]);
                if (d == 3 && e == 3) break;
                System.out.print(", ");
                if (e == 3) {
                    System.out.println();
                }
            }
        }
        
        System.out.println("\n\nTampilkan Bintang");
        for (int f = 0; f < 5; f++) {
            for (int g = f; g < 5; g++) {
                if (g == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("   ");
                }
            }
            for (int h = 0; h < f; h++) {
                // if (h == 1) {
                //     System.out.print(" * ");
                // } else {
                //     System.out.print("   ");
                // }
                System.out.print("   ");
            }
            for (int i = (f - 1); i >= 0; i--) {
                if (i == 0) {
                    System.out.print(" * ");
                } 
                // if (i == 2) {
                //     System.out.print(" * ");
                // }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int h = 5; h > 0; h--) {
            for (int i = h; i <= 5; i++) {
                System.out.print("   ");
            }
            for (int j = 1; j < h; j++) {
                if (j == 1) {
                    System.out.print("* ");
                } 
                // if (j == 3) {
                //     System.out.print("  * ");
                // }
                else {
                    System.out.print("   ");
                }
                // System.out.print(j);
                // System.out.print("  ");
            }
            for (int k = (h - 3); k >= 0; k--) {
                if (k == 0) {
                    System.out.print(" * ");
                }
                // if (k == 2) {
                //     System.out.print("   * ");
                // }
                else {
                    System.out.print("   ");
                }
                // System.out.print(k);
                // System.out.print("  ");
            }
            System.out.println("   ");
        }
        for (int l = 0; l < 6; l++) {
            for (int m = 0; m <= 6; m++) {
                if (m == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n\n");
        }
    }
}
