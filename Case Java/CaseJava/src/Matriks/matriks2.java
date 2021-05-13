// Penjumlahan, Pengurangan, Perkalian, Pembagian
package Matriks;

public class matriks2 {

    public static void main(String[] args) {
    int matrixa[][] = new int[2][2];
        matrixa[0][0] = 2;
        matrixa[0][1] = 10;
        matrixa[1][0] = 10;
        matrixa[1][1] = 12;

    int matrixb[][] = new int[2][2];
        matrixb[0][0] = 1;
        matrixb[0][1] = 2;
        matrixb[1][0] = 2;
        matrixb[1][1] = 2;

        for (int i = 0; i < matrixa.length; i++) 
        {
            for (int j = 0; j < matrixa[0].length; j++) 
            {
                //menjumlahkan matrik a dengan matriks b
                int elem = matrixa[i][j] / matrixb[i][j]; 
                System.out.print( elem + " ");
            }
            System.out.println();
        }
    }
}