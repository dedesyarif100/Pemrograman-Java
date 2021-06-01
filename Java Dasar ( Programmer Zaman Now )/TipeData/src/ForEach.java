public class ForEach {
    public static void main(String[] args) {
        // String -----------------------------------------------------------
        String[] names = { // Aturan Penulisan Array pada Java
            "kucing", "Anjing", "kelinci", "sapi", "kambing", "ayam"
        };

        for (int a = 0; a < names.length; a++) { // For Biasa yang digunakan oleh Bahasa Pemrograman
            System.out.print(names[a] + ", ");
        }

        System.out.println("\nForeach");
        for (String name : names) { // ForEach Pada Java
            System.out.print(name + ", ");
        }

        System.out.println();
        // Integer -----------------------------------------------------------
        Integer[] values = { // Aturan Penulisan Array pada Java
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10 
        };

        for (int b = 0; b < values.length; b++) { // For Biasa yang digunakan oleh Bahasa Pemrograman
            System.out.print(values[b] + ", ");
        }
        for (Integer value : values) { // ForEach Pada Java
            System.out.print(value + ", ");
        }
    }
}
