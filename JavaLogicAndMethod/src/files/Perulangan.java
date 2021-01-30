package files;

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
    }
}
