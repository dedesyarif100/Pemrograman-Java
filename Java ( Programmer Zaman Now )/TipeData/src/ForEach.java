public class ForEach {
    public static void main(String[] args) {
        // String -----------------------------------------------------------
        String[] names = {
            "kucing", "Anjing", "kelinci", "sapi", "kambing", "ayam"
        };

        for (int a = 0; a < names.length; a++) {
            System.out.print(names[a] + ", ");
        }

        System.out.println("\nForeach");
        for (String name : names) {
            System.out.print(name + ", ");
        }

        System.out.println();
        // Integer -----------------------------------------------------------
        Integer[] values = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        for (int b = 0; b < values.length; b++) {
            System.out.print(values[b] + ", ");
        }
        for (Integer value : values) {
            System.out.print(value + ", ");
        }
    }
}
