// Random Class
import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int value = random.nextInt(1000);
            System.out.println(value);
        }

        for (int i = 0; i < 1000; i++) {
            Double value = random.nextDouble();
            System.out.println(value);
        }
    }
}
