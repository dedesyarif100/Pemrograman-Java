// package AccessModifier.application;

// package AccessModifier.application;

// import AccessModifier.data.Product;
// import AccessModifier.data.Data;

import data.*; // Untuk mengimport class di folder lain
// import java.lang.String; // untuk mengimport jenis tipedata string (Java sudah otomatis mengimport package ini)
// import java.lang.*; // untuk mengimport seluruh jenis tipedata (Java sudah otomatis mengimport package ini)

public class Application {
    public static void main(String[] args) {
        // String name = "Eko";

        Product product = new Product(1, "Mac Book Pro", 12.5);
        System.out.println(product.idCustomers);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println("\n-----------------------------------");
        Product myProduct = new Product();
        System.out.println(myProduct.idCustomers);
        System.out.println(myProduct.name);
        System.out.println(myProduct.price);

        System.out.println("\n-----------------------------------");
        Data data = new Data();
        System.out.println(data.data1);
        System.out.println(data.applyData());
        // System.out.println(data.data3);
        
        // Car car = new Avanza();
        // System.out.println(car.getTier());
        // car.drive();
    }
}
