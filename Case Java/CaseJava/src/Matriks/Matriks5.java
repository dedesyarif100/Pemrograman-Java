// Tranpose Matriks
package Matriks;
import java.util.Scanner;

public class Matriks5 {

    public static void main(String[] args) {
        int i, j, m, n;
        int matriks[][] = new int[10][10]; 
        int transpose[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris matriks : ");
        m = scan.nextInt();
        System.out.print("Masukkan jumlah kolom matriks : ");
        n = scan.nextInt();
        System.out.println("Masukkan elemen matriks : ");
        for (i = 0; i < m; i++) 
        {
            for (j = 0; j< n; j++) 
            {
                matriks[i][j] = scan.nextInt();
            }
        }

        for(i = 0; i < m; i++) 
        {
            for(j = 0; j< n; j++) 
            {
                transpose[j][i] = matriks[i][j];
            }
        }
        System.out.println("Hasil transpose matriks : ");
        for(i = 0; i < n; i++) 
        {
            for(j = 0; j < m; j++) 
            {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}