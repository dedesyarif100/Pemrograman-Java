// String Class

public class StringApp {
    public static void main(String[] args) {
        String name = "Dede Syarifudin Hidayat";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();
        
        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Dede"));
        System.out.println(name.endsWith("Hallo"));

        String[] names = name.split(" | ");
        for (var value : names) {
            System.out.println(value);
        }
        System.out.println("zz".isBlank());
        System.out.println("zz".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(6));

        char[] chars = name.toCharArray();
        for (var value : chars) {
            System.out.print(value);
        }
    }
}
