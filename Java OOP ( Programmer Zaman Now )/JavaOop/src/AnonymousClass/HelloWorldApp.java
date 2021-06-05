public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() { // Anonymous Class
            public void sayHello() {
                System.out.println("English");
            }
            public void sayHello(String name) {
                System.out.println("My Name Is " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld() { // Anonymous Class
            public void sayHello() {
                System.out.println("Indonesia");
            }
            public void sayHello(String name) {
                System.out.println("Nama saya adalah " + name);
            }
        };
        english.sayHello();
        english.sayHello("Budi");

        indonesia.sayHello();
        indonesia.sayHello("Eko");
    }
}
