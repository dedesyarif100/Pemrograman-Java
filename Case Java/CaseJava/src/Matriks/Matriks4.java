// Matrik dinamis
package Matriks;
import java.util.Scanner;

public class Matriks4 {

    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        int C[][] = new int[2][2];
         
        System.out.println("Masukkan Nilai Matriks A");
        System.out.println("=======================");
        for (int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print("[" + ( i + 1 ) + "][" + ( j + 1 ) + "]:");
                A[i][j] = inputan.nextInt();
            }
        }
      
        System.out.println("\nMasukkan Nilai Matriks B");
        System.out.println("==========================");
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print("[" + ( i + 1 ) + "][" + ( j + 1 ) + "]:");
                B[i][j] = inputan.nextInt();
            }
        }
      
        /* Melakukan penjumlahan matriks*/
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
      
        System.out.println("\nHasil penjumlahan Matriks");
        System.out.println("===========================");
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print( + (C[i][j]) + " ");
            }
            System.out.println(" ");
        }
    }
    
}