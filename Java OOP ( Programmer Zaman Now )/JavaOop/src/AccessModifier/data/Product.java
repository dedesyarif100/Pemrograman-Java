package data;

public class Product {
    public int idCustomers = 1;
    public String name = "Dede";
    public double price = 10.123;

    public Product(int a, String b, double c) {
        this.idCustomers = a;
        this.name = b;
        this.price = c;
    }

    public Product() {
        // this.idCustomers = idCustomers;
    }
}
