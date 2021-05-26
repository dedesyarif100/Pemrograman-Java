// String Joiner Class
import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        // ---------------------------------------------------------------------------------------------------
        // StringJoiner joiner = new StringJoiner(", ", "[", "]"); // StringJoiner(delimiter, prefix, suffix)
        // joiner.add("Dede");
        // joiner.add("Syarifudin");
        // joiner.add("Hidayat");

        // String value = joiner.toString();
        // System.out.println(value);

        // ---------------------------------------------------------------------------------------------------
        String[] names = {"Eko", "Kurniawan", "Khannedy"};
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        for (var name : names) {
            joiner.add(name);
        }

        System.out.println(joiner.toString());
    }
}
