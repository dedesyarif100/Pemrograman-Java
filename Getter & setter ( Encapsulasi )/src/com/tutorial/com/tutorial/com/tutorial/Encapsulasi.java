// Getter & setter ( Encapsulasi ) ------------------------------------------------------------

package com.tutorial;

class DataNumber {
    public int onePublic;
    public int twoPublic;
    public int threePublic;
    public int fourPublic;
    public int fivePublic;
    private int sixPrivate;
    private int sevenPrivate;
    private int eightPrivate;
    private int ninePrivate;
    private int tenPrivate;

    // Constructor --------------------------------------------
    public DataNumber() {
        this.sixPrivate = 6;
        this.sevenPrivate = 7;
        this.eightPrivate = 8;
        this.ninePrivate = 9;
        this.tenPrivate = 10;
    }

    // Getter -----------------------------------------------------
    // Setiap Method yang diberi type data khusus, di dalamnya wajib melakukan return jika akan menampilkan property
    public int getSixPrivate() {
        return this.sixPrivate;
    }

    public int getSevenPrivate() {
        return this.sevenPrivate;
    }

    public int getEightPrivate() {
        return this.eightPrivate;
    }

    public int getNinePrivate() {
        return this.ninePrivate;
    }

    public int getTenPrivate() {
        return this.tenPrivate;
    }

    // Access Modifier --------------------------------------------
    public void displayPrivate() {
        System.out.println("six Private : " + this.sixPrivate);
        System.out.println("seven Private : " + this.sevenPrivate);
        System.out.println("eight Private : " + this.eightPrivate);
        System.out.println("nine Private : " + this.ninePrivate);
        System.out.println("ten Private : " + this.tenPrivate);
    }

    // Setter -----------------------------------------------------
    public void setSixPrivate(int value) {
        this.sixPrivate = value;
    }

    public void setSevenPrivate(int value) {
        this.sevenPrivate = value;
    }

    public void setEightPrivate(int value) {
        this.eightPrivate = value;
    }

    public void setNinePrivate(int value) {
        this.ninePrivate = value;
    }

    public void setTenPrivate(int value) {
        this.tenPrivate = value;
    }
}

class Penjumlahan {
    private int number;
    
}

public class Encapsulasi {
    public static void main(String[] args) {
        DataNumber object = new DataNumber();
        object.onePublic = 1;
        object.twoPublic = 2;
        object.threePublic = 3;
        object.fourPublic = 4;
        object.fivePublic = 5;

        System.out.println(object.onePublic + " | " + object.twoPublic + " | " + object.threePublic + " | " + object.fourPublic + " | " + object.fivePublic);

        object.displayPrivate();

        int sevenPrivate = object.getSevenPrivate();
        System.out.println("Get Seven Private : " + sevenPrivate);

        int ninePrivate = object.getNinePrivate();
        System.out.println("Get Nine Private : " + ninePrivate);

        int sixPrivate = object.getSixPrivate();
        System.out.println("Get Six Private : " + sixPrivate);

        int eightPrivate = object.getEightPrivate();
        System.out.println("Get Eight Private : " + eightPrivate);

        int tenPrivate = object.getTenPrivate();
        System.out.println("Get Ten Private : " + tenPrivate);

        object.setSixPrivate(66);
        object.setSevenPrivate(77);
        object.setEightPrivate(88);
        object.setNinePrivate(99);
        object.setTenPrivate(100);
        object.displayPrivate();
    }
}
