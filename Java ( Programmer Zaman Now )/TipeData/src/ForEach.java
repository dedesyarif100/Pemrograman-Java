public class ForEach {
    public static void main(String[] args) {
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
    }
}
