package RekursiveMethod;

public class FibonanciRekursif {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            int hasil = fiboRekursif(i);
            System.out.print(hasil + " ");
            System.out.print(" | ");
        }
    }
    public static Integer fiboRekursif(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // System.out.print(n + " , ");
        return fiboRekursif(n - 1) + fiboRekursif(n - 2);
    }
}
