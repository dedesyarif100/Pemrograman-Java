// package com;

// import java.util.Arrays;

public class ArrayJava {    
    public static void bubbleSort(int[] data) {
        int n = data.length;
        int temp = 0;

        // Arrays.sort(data);
        for (int a = 0; a < n; a++) {
            for (int b = 1; b < (n-a); b++) {
                if (data[b-1] > data[b]) {
                    temp = data[b-1];
                    data[b-1] = data[b];
                    data[b] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] value = {5, 10, 4, 3, 8, 7, 9, 6, 1, 2};

        System.out.println("Sebelum dilakukan sorting");
        for (int c = 0; c < value.length; c++) {
            System.out.print(value[c] + " ");
        }

        System.out.println("\n");
        ArrayJava.bubbleSort(value);

        System.out.println("Setelah dilakukan sorting");
        for (int c = 0; c < value.length; c++) {
            System.out.print(value[c] + " ");
        }
    }
}




// 1,2,3
// 4,5,6
// 7,8,9