// Method ---------------------------------------------------------
package com.tutorial;

class Food {
    String nasgor;
    String mie;
    String sop;
    String pecel;
    
    // Constructor ------------------------------------------
    Food(String nasgor, String mie, String sop, String pecel) {
        this.nasgor = nasgor;
        this.mie = mie;
        this.sop = sop;
        this.pecel = pecel;
    }

    // Method tanpa return & tanpa parameter
    void SurabayaFood() {
        System.out.println("Food : " + this.nasgor);
        System.out.println("Food : " + this.mie);
        System.out.println("Food : " + this.sop);
        System.out.println("Food : " + this.pecel);
    }

    // Method tanpa return & dengan parameter 
    void SetValue(String nasgor, String mie, String sop, String pecel) {
        this.nasgor = nasgor;
        this.mie = mie;
        this.sop = sop;
        this.pecel = pecel;
    }

    // Method dengan return & tanpa parameter
    String getNasgor() {
        return this.nasgor;
    }

    String getMie() {
        return this.mie;
    }

    String getSop() {
        return this.sop;
    }

    String getPecel() {
        return this.pecel;
    }

    // Method dengan return & dengan parameter
    String message(String message) {
        return "Ini adalah makanan " + this.nasgor + ", " + message +
                "Ini adalah makanan " + this.mie + ", " + message +
                "Ini adalah makanan " + this.sop + ", " + message +
                "Ini adalah makanan " + this.pecel + ", " + message;
    }

}

public class MethodJava4 {
    public static void main(String[] args) {
        System.out.println("Method tanpa return & tanpa parameter");
        Food Foodness_1 = new Food("Nasi Goreng", "Mie", "Soup", "Nasi Pecel");
        Foodness_1.SurabayaFood();

        System.out.println("\nMethod tanpa return & dengan parameter");
        Food Foodness_2 = new Food("Nasi Goreng", "Mie", "Soup", "Nasi Pecel");
        Foodness_2.SetValue("A", "B", "C", "D");
        Foodness_2.SurabayaFood();

        System.out.println("\nMethod dengan return & tanpa parameter");
        System.out.println(Foodness_1.getNasgor());
        System.out.println(Foodness_1.getMie());
        System.out.println(Foodness_1.getSop());
        System.out.println(Foodness_1.getPecel());

        System.out.println("\nMethod dengan return & dengan parameter");
        String data = Foodness_1.message("Enak Lho");
        System.out.println(data);
    }
}
