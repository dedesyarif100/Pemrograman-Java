import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
 
interface Transportasi {
    public static final int idz = 153400;
    public int getId();
    public void setData();
    public void tampil();
}
 
abstract class Gojek implements Transportasi {
    int id, harga = 10000;
    @Override
    public abstract void setData();
    @Override
    public abstract void tampil();
    public static Scanner in = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);
    public static void main(String[] args) {
        int menu = 0, z = 0, a, cari;
        bayar[] data = new bayar[1024];
        data[z] = new bayar();

        // // Kurensi Indonesia
        // DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        // DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        // formatRp.setCurrencySymbol("Rp. ");
        // formatRp.setMonetaryDecimalSeparator(',');
        // formatRp.setGroupingSeparator('.');

        // kursIndonesia.setDecimalFormatSymbols(formatRp);

        while (menu != 6) {
            System.out.print("\nmenu...\n1.input\t\t2.view\n3.search\t4.update\n5.delete\t6.exit\n");
            System.out.print("Pilih Angka 1 - 6 = ");
            menu = data[0].in.nextInt();
            if (menu == 1) {
                z++;
                data[z] = new bayar(data[z - 1].getId());
                data[z].setData();
            } else if (menu == 2) {
                if (z < 1)
                    System.out.println("data kosong");
                else {
                    a = 0;
                    System.out.println("| ID | NAMA | JARAK/KM | HARGA | TOTAL |");
                    System.out.println("------------------------------------------------");
                    while (a < z) {
                        a++;
                        // System.out.println("---" + a + "---");
                        data[a].tampil();
                    }
                }
            } else if (menu == 3 || menu == 4 || menu == 5) {
                System.out.print("masukkan id bayar : ");
                cari = data[0].in.nextInt();
                System.out.println("| ID | NAMA | JARAK/KM | HARGA | TOTAL |");
                System.out.println("------------------------------------------------");
                a = 1;
                while (a <= z) {
                    if (data[a].getId() == cari) {
                        break;
                    }
                    a++;
                }
                if (a <= z) {
                    if (menu == 3) {
                        data[a].tampil();
                    }
                    else if (menu == 4) {
                        data[a].tampil();
                        data[a].setData();
                    }
                    else {
                        while (a < z) {
                            data[a] = data[a + 1];
                            a++;
                        }
                        z--;
                        System.out.println("data " + cari + " berhasil dihapus");
                    }
                }
                else {
                    System.out.println("data tidak ditemukan");
                }
            } else if (menu == 6) {
                System.out.println("keluar...");
            } else {
                System.out.println("menu ilegal");
            }
        }
    }
   
}
 
class bayar extends Gojek {
    int jarak, total;
    String nama;
    public bayar() {
        this.id = idz;
    }
    public bayar(int id) {
        this.id = id + 1;
    }
    @Override
    public void setData() {
        System.out.print("Masukkan Nama Penumpang : ");
        this.nama = str.nextLine();
        System.out.print("Masukkan Jarak(km)      : ");
        this.jarak = in.nextInt();
        this.total = this.harga * this.jarak;
    }
    @Override
    public void tampil() {
        // System.out.println("Id             : " + this.id);
        // System.out.println("Nama Penumpang : " + this.nama);
        // System.out.println("Harga Per 1km  : Rp." + this.harga);
        // System.out.println("Jarak          : " + this.jarak);
        // System.out.println("Total          : Rp." + this.total);
        System.out.println("| " + this.id + " | " + this.nama + " | " + this.jarak + " km | Rp. " + (this.harga) + " | Rp. " + this.total + " | ");
    }
    @Override
    public int getId() {
        return this.id;
    }
}