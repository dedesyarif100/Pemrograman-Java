public class Method {
    public static void main(String[] args) {
        // Method Tanpa Parameter ----------------------------------------------------------------------------------------------
        System.out.println("\nMethod Tanpa Parameter");
        hello();
        hitung();
        deretBilangan();

        // Method Dengan Parameter ----------------------------------------------------------------------------------------------
        System.out.println("\nMethod Dengan Parameter");
        sayHello("Dede", "Syarifudin");
        sayHello("Hendro", "Rachmad");
        sayHello("Riand", "Pratama");
        dataType(1, "Hello", 1.2, true);

        // Method Return Value ----------------------------------------------------------------------------------------------
        System.out.println("\nMethod Return Value");
        var result = sum(100, 100);
        System.out.println(result);
        System.out.println(sum(200, 200));

        System.out.println(hitung(100, "+", 100));
        System.out.println(hitung(200, "-", 100));
        System.out.println(hitung(3, "*", 5));
        System.out.println(hitung(10, "/", 5));
        System.out.println(hitung(30, "%", 18));
        System.out.println(hitung(30, "^", 18));
        System.out.println(hitung(200, "salah", 100));
    }

    // Method Tanpa Parameter ----------------------------------------------------------------------------------------------
    static void hello() {
        var number = 1;
        System.out.println("Hello " + number);
        number++;
        System.out.println("Hello " + number);
        number++;
        System.out.println("Hello " + number);
    }
    static void hitung() {
        var a = 3;
        var b = 4;
        var c = a + b;
        System.out.println(c);
    }
    static void deretBilangan() {
        var value = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        System.out.println(value);
    }

    // Method Dengan Parameter ----------------------------------------------------------------------------------------------
    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
    static void dataType(int dataInt, String dataString, double dataDouble, boolean dataBool) {
        System.out.println("Data Type = " + dataInt + ", " + dataString + ", " + dataDouble + ", " + dataBool);
    }

    // Method Return Value ----------------------------------------------------------------------------------------------
    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            case "/":
                return value1 / value2;
            case "%":
                return value1 % value2;
            case "^":
                return value1 ^ value2;
            default :
                return 0;
        }
    }
}
