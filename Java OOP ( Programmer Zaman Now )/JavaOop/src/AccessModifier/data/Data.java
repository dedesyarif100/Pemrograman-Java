package data;

public class Data extends Car implements Avanza {
    public int data1 = 1;
    protected int data2 = 2;
    private int data3 = 3;
    public Data() {

    }
    public Boolean applyData() {
        System.out.println("Cek Apply Data");
        System.out.print(data2 + ", " + data3 + "\n");
        drive();
        getTier();
        System.out.println(cekIntAvanza);
        System.out.println(cekStringAvanza);
        // mobil();
        return true;
    }
}
