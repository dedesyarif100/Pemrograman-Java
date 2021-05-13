//membuat matriks 
package Matriks;
public class matriks1 {
    public static void main(String[] args) {
        int mat[][][] = new int[3][3][3];
        mat[0][0][0] = 1;
        mat[0][0][1] = 2;
        mat[0][0][2] = 100;
        mat[0][1][0] = 1;
        mat[0][1][1] = 2;
        mat[0][1][2] = 200;
        mat[0][2][0] = 1;
        mat[0][2][1] = 2;
        mat[0][2][2] = 300;

        mat[1][0][0] = 3;
        mat[1][0][1] = 4;
        mat[1][0][2] = 200;
        mat[1][1][0] = 3;
        mat[1][1][1] = 4;
        mat[1][1][2] = 200;
        mat[1][2][0] = 3;
        mat[1][2][1] = 4;
        mat[1][2][2] = 200;

        mat[2][0][0] = 5;
        mat[2][0][1] = 6;
        mat[2][0][2] = 300;
        mat[2][1][0] = 5;
        mat[2][1][1] = 6;
        mat[2][1][2] = 300;
        mat[2][2][0] = 5;
        mat[2][2][1] = 6;
        mat[2][2][2] = 300;
        
        for (int x = 0; x < mat.length; x++) 
        {
            for (int y = 0; y < mat[x].length; y++) 
            {
                for (int z = 0; z < mat[x][y].length; z++) 
                {
                    System.out.print(mat[x][y][z] + ", ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}