import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
        String nilai;
        System.out.print("Masukkan Karakter = ");
        Scanner input = new Scanner(System.in);
        nilai = input.next();

        // Switch Statement
        switch (nilai) {
            case "A", "a", 1:
                System.out.println("Sangat Baik");
                break;
            case "B", "b", 2:
                System.out.println("Baik");
                break;
            case "C", "c", 3:
                System.out.println("Cukup");
                break;
            case "D", "d", 4:
                System.out.println("Kurang");
                break;
            case "E", "e", 5:
                System.out.println("Sangat Kurang");
                break;
            default:
                System.out.println("Tidak ada");
        }

        // Switch Lamda
        switch (nilai) {
            case "A", "a", 1 -> System.out.println("Sangat Baik (Lamda)");
            case "B", "b", 2 -> System.out.println("Baik (Lamda)");
            case "C", "c", 3 -> System.out.println("Cukup (Lamda)");
            case "D", "d", 4 -> System.out.println("Kurang (Lamda)");
            case "E", "e", 5 -> System.out.println("Sangat Kurang (Lamda)");
            default -> System.out.println("Tidak ada (Lamda)");
        }

        // Switch Tanpa Yield
        String ucapan;
        switch (nilai) {
            case "A", "a", 1 -> ucapan = "Sangat Baik (Tanpa Yield)";
            case "B", "b", 2 -> ucapan = "Baik (Tanpa Yield)";
            case "C", "c", 3 -> ucapan = "Cukup (Tanpa Yield)";
            case "D", "d", 4 -> ucapan = "Kurang (Tanpa Yield)";
            case "E", "e", 5 -> ucapan = "Sangat Kurang (Tanpa Yield)";
            default -> ucapan = "Tidak ada";
        }
        System.out.println(ucapan);

        // Switch Dengan Yield
        ucapan = switch (nilai) {
            case "A", "a", 1:
                yield "Sangat Baik (Dengan Yield)";
            case "B", "b", 2:
                yield "Baik (Dengan Yield)";
            case "C", "c", 3:
                yield "Cukup (Dengan Yield)";
            case "D", "d", 4:
                yield "Kurang (Dengan Yield)";
            case "E", "e", 5:
                yield "Sangat Kurang (Dengan Yield)";
            default:
                yield "Tidak ada";
        };
        System.out.println(ucapan);
    }
}
