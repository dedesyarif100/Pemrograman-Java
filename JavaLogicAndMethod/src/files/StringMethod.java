// package files;

public class StringMethod {
    public static void main(String[] args) {
        System.out.println("String Method Java");
        String names = "Dede Syarifudin Hidayat";
        String firstName = "Dede ";
        String lastName = "Syarifudin";
        System.out.println(names.length());
        System.out.println(names.toLowerCase());
        System.out.println(names.toUpperCase());
        System.out.println(names.isEmpty());
        System.out.println(names.indexOf("Syarifudin"));
        System.out.println(firstName.concat(lastName).toUpperCase());
        char result = names.charAt(5);
        System.out.println(result);
    }
}
