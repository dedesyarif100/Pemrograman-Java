package data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product(1, "Mac Book Pro", 1200000);
        System.out.println(product.idCustomers);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
