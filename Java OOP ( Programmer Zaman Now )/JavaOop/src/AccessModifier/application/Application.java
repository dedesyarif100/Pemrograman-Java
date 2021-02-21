package AccessModifier.application;

// import AccessModifier.data.Product;
// import AccessModifier.data.Data;

import AccessModifier.data.*; // Untuk mengimport class di folder lain
// import java.lang.String; // untuk mengimport jenis tipedata string (Java sudah otomatis mengimport package ini)
// import java.lang.*; // untuk mengimport seluruh jenis tipedata (Java sudah otomatis mengimport package ini)

public class Application {
    public static void main(String[] args) {
        String name = "Eko";

        Product product = new Product("Mac Book Pro", 1200000);
        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
