// getter & setter (Encapsulasi) ---------------------------------------------------------

package com.tutorial;

class Mahasiswa{
    public String mahasiswa1;
    public String mahasiswa2;
    private String mahasiswa3;
    private String mahasiswa4;
    private int number1 = 1;
    private double number2 = 2.5;
    private boolean bool1 = true;

    Mahasiswa() {
        this.mahasiswa1 = "Dede Syarifudin";
        this.mahasiswa2 = "Rian Pratama";
        this.mahasiswa3 = "Hendro Rachmad";
        this.mahasiswa4 = "Trisuli";
    }

    public void getMahasiswa(){
        System.out.println(this.mahasiswa3);
        System.out.println(this.mahasiswa4);
        System.out.println(this.number1);
        System.out.println(this.number2);
        System.out.println(this.number1);
        System.out.println(this.number2);
        System.out.println(this.bool1);
    }

    public String getMahasiswa2(){
        return this.mahasiswa3;
    }

    // public int getList(){
    //     for (int i = 0; i < list.length; i++){
    //         return
    //     }
    // }
}

public class Latihan1{
    public static void main(String[] args) {
        Mahasiswa maba = new Mahasiswa();
        System.out.println(maba.mahasiswa1);
        System.out.println(maba.mahasiswa2);
        maba.getMahasiswa();
        System.out.println(maba.getMahasiswa2());
        

        int[] list = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i]);
            if (i == 9) {
                break;
            }
            System.out.print(" - ");
        }
        char[] abjad = {'a', 'b', 'c', 'd', 'e'};
        for (int a = 0; a < abjad.length; a++){
            System.out.print(abjad[a]);
        }
    }
}