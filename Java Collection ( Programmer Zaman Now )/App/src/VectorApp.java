// Vector
import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> list = new Vector<>(); // Vector mirip seperti ArrayList, yang membedakan semua method di vector menggunakan kata kunci synchronized yang berarti artinya dia thread safe
        
        list.add("Eko");
        list.add("Kurniawan");
        list.add("Khannedy");
        for (var value : list) {
            System.out.println(value);
        }
    }
}
