// Base64 Class
import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        // Konversi dari string menjadi encoded
        String original = "Dede Syarifudin Hidayat";
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encoded);

        // Konversi dari encoded menjadi string
        byte[] bytes = Base64.getDecoder().decode(encoded);
        String result = new String(bytes);
        System.out.println(result);
    }
}
