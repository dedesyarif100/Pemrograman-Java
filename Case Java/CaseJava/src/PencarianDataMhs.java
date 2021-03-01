import java.util.Scanner;
public class PencarianDataMhs {
    String nama;
    int npm;
    boolean cekNpm = true;
    double uts, uas, na;
    Scanner getdata = new Scanner(System.in);
    public void setdata(PencarianDataMhs mhs[], int a) {
        System.out.print("Masukkan Nama      : ");
        this.nama = getdata.nextLine();
        System.out.print("Masukkan NPM       : ");
        this.npm = getdata.nextInt();
        // while (cekNpm) {
        //     a++;
        //     this.npm = getdata.nextInt();
        //     if (mhs[a] == null) {
        //         System.out.println("next");
        //     } else if (mhs[a].getnpm() == this.npm) {
        //         System.out.println("NPM sudah pernah di inputkan");
        //     } else {
        //         cekNpm = false;
        //     }
        // }
        
        System.out.print("Masukkan Nilai UTS : ");
        this.uts = getdata.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        this.uas = getdata.nextDouble();
        this.na = (this.uts + this.uas) / 2;
    }
    public String getNama() {
        return this.nama;
    }

    public int getnpm() {
        return this.npm;
    }
    public void tampil(int nomorApply) {
        System.out.println("| " + nomorApply + " | " + this.npm + " | " + this.nama + " | " + this.uts + " | " + this.uas + " | " + this.na + " | ");
    }
    public static void main(String[] args) {
        Scanner getint = new Scanner(System.in);
        int a = 0, z = 0, menu = 0, ketemu;
        String nama;
        int npm, nomorApply = 1;
        PencarianDataMhs[] mhs = new PencarianDataMhs[128];
        Scanner getdata = new Scanner(System.in);
        while (menu != 4) {            
            System.out.print("Menu...\n1. Input\n2. View\n3. Search\n4. Exit\n\nPilihan : ");
            menu = getint.nextInt();
            if (menu == 1) {
                z++;
                mhs[z] = new PencarianDataMhs();
                mhs[z].setdata(mhs, a);
                System.out.println();
            } else if (menu == 2) {
                if (z < 1) {
                    System.out.println("Data Masih Kosong");
                } else {
                    a = 0;
                    nomorApply = 1;
                    System.out.println("| No | NPM | Nama | UTS | UAS | NA |");
                    System.out.println("------------------------------------");
                    while (a < z) {
                        a++;
                        // System.out.println("---" + a + "---");
                        mhs[a].tampil(nomorApply);
                        nomorApply++;
                    }
                }
            } else if (menu == 3) {
                if (z < 1) {
                    System.out.println("Data Masih Kosong");
                } else {
                    a = 0;
                    ketemu = 0;
                    int cari;
                    while (a < z) {
                        a++;
                        System.out.println("Cari Berdasarkan : ");
                        System.out.print("1. Nama\n2. NPM \n\n");
                        System.out.print("Pilihan : ");
                        Scanner cariMhs = new Scanner(System.in);
                        cari = cariMhs.nextInt();
                        if (cari == 1) {
                            System.out.print("Masukkan nama yang dicari : ");
                            nama = getdata.nextLine();
                            if (nama.equals(mhs[a].getNama())) {
                                System.out.println("Menampilkan Data");
                                System.out.println("-------------------------------------");
                                mhs[a].tampil(nomorApply);
                                ketemu++;
                                System.out.println();
                                a = z;
                            }
                        } else if (cari == 2) {
                            System.out.print("Masukkan npm yang dicari : ");
                            npm = getdata.nextInt();
                            if (npm == mhs[a].getnpm()) {
                                System.out.println("Menampilkan Data");
                                System.out.println("-------------------------------------");
                                mhs[a].tampil(nomorApply);
                                ketemu++;
                                System.out.println();
                                a = z;
                            }
                        } else {
                            System.out.println("\nPilihan Salah\n");
                        }
                    }
                    if (ketemu < 1) {
                        System.out.println("Data Yang Anda Cari Mungkin Tidak Ada");
                    }
                }
            } else if (menu == 4) {
                System.out.println("Keluar...");
            } else{
                System.out.println("Masukkan Menu Yang Tersedia");
            }
        }  
    }
}