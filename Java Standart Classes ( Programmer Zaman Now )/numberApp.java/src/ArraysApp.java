import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 6, 10, 19, 12, 18, 16, 14, 20, 15};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 100));

        int[] result1 = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result1));

        int[] result2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(result2));
    }
}
