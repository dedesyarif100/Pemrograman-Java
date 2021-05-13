// getter & setter (Encapsulasi) ---------------------------------------------------------

package com.tutorial;

class Mahasiswi {
    // Variabel --------------------------------------------------
    public String Mahasiswi1;
    public String Mahasiswi2;
    private String Mahasiswi3;
    private String Mahasiswi4;
    private int number1 = 1;
    private double number2 = 2.5;
    private boolean bool1 = true;

    // Constructor --------------------------------------------------
    Mahasiswi() {
        this.Mahasiswi1 = "Dede Syarifudin";
        this.Mahasiswi2 = "Rian Pratama";
        this.Mahasiswi3 = "Hendro Rachmad";
        this.Mahasiswi4 = "Trisuli";
    }

    // Method --------------------------------------------------
    public void getMahasiswi() {
        System.out.println(this.Mahasiswi3);
        System.out.println(this.Mahasiswi4);
        System.out.println(this.number1);
        System.out.println(this.number2);
        System.out.println(this.number1);
        System.out.println(this.number2);
        System.out.println(this.bool1);
    }

    public String getMahasiswi2() {
        return this.Mahasiswi2;
    }

    // public int getList(){
    //     for (int i = 0; i < list.length; i++){
    //         return
    //     }
    // }
}

public class Latihan1 {
    public static void main(String[] args) {
        Mahasiswi maba = new Mahasiswi();
        System.out.println(maba.Mahasiswi1);
        System.out.println(maba.Mahasiswi2);
        maba.getMahasiswi();
        System.out.println(maba.getMahasiswi2());
        

        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list[i]);
            if (i == 9) 
            {
                break;
            }
            System.out.print(" - ");
        }
        char[] abjad = {'a', 'b', 'c', 'd', 'e'};
        for (int a = 0; a < abjad.length; a++)
        {
            System.out.print(abjad[a]);
        }
    }
}