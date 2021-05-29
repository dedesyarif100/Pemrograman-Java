// String Buffer & String Builder Class

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Dede");
        builder.append(" ");
        builder.append("Syarifudin");
        builder.append(" ");
        builder.append("Hidayat");

        String name = builder.toString();
        System.out.println(name);
        System.out.println(builder);
    }
}
