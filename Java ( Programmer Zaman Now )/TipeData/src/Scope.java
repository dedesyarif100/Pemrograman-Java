public class Scope {
    public static void main(String[] args) {
        sayHello("Dede");
        sayHello("");
    }

    static void sayHello(String name) {
        String a = "INI A";
        String b = "INI B";
        String c = "INI C";
        int number[] = {1, 2, 3};

        if (!name.isBlank())
        {
            System.out.println(name + ", " + a);
            System.out.println(name + ", " + b);
            System.out.println(name + ", " + c);
        } 
        else 
        {
            String variabel = "INI VARIABEL STRING";
            int value1 = 12;
            int value2 = 22;
            char karakter[] = {'x', 'y', 'z'};
            System.out.println(variabel);
            for (int i : number) 
            {
                System.out.println(i);
            }
            for (char x : karakter) 
            {
                System.out.println(x);
            }
        }
        // Scope Variavel 
        // System.out.println(value1);
        // System.out.println(value2);
    }
}
