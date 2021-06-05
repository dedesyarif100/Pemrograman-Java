package data;

public class Data extends Car implements Avanza, IsMaintenance {
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
        System.out.println(numberFromHasBrand);
        // mobil();
        return true;
    }

    public String getStringBrand() {
        return "Toyota";
    }
    public Integer getIntBrand() {
        return 1;
    }
    public boolean IsMaintenance() {
        return false;
    }
}
