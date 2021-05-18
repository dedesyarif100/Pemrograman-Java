package LinkedListJava;

import java.util.Scanner;

public class LinkedListMhs2 {
    // LinkedListMhs2 idNumber;
    public Integer id, nim, update;
    Double uts, uas, rata2_uts, rata2_uas, nilai_akhir;
    String nama, alamat, skill;
    LinkedListMhs2 next, prev;
    
    static Scanner integer = new Scanner(System.in);
    Scanner string = new Scanner(System.in);
    Scanner doubleValue = new Scanner(System.in);
    public void inputData(Integer idNumber) {
        System.out.print("ID TERBUAT OTOMATIS   : " + (id = idNumber) + "\n");
        id = idNumber;
        System.out.print("Masukkan Nim          : ");
        nim = integer.nextInt();
        System.out.print("Masukkan Nama         : ");
        nama = string.nextLine();
        System.out.print("Masukkan Alamat       : ");
        alamat = string.nextLine();
        System.out.print("Masukkan Skill        : ");
        skill = string.nextLine();
        System.out.print("Masukkan Nilai UTS    : ");
        uts = doubleValue.nextDouble();
        System.out.print("Masukkan Nilai UAS    : ");
        uas = doubleValue.nextDouble();
        rata2_uts = (30.0 / 100) * uts;
        rata2_uas = (70.0 / 100) * uas;
        nilai_akhir = uts + uas;
        System.out.println("cek uts : " + rata2_uts);
        System.out.println("cek uas : " + rata2_uas);
        System.out.println("cek NA : " + nilai_akhir);
    }

    public void viewData() {
        System.out.println("| "+ id +" | "+ nim +" | "+ nama +" | "+ alamat +" | "+ skill +" | "+ uts +" | "+ uas +" | "+ nilai_akhir +" |");
    }

    public void viewDataByNilaiAkhir() {

    }

    public int inputIDupdate() {
        System.out.print("Input Update Berdasarkan ID : ");
        Scanner updateData = new Scanner(System.in);
        update = updateData.nextInt();
        return update;
    }

    public void InputUpdateData(LinkedListMhs2 selectData) {
        System.out.print("Masukkan Nim          : ");
        selectData.nim = integer.nextInt();
        System.out.print("Masukkan Nama         : ");
        selectData.nama = string.nextLine();
        System.out.print("Masukkan Alamat       : ");
        selectData.alamat = string.nextLine();
        System.out.print("Masukkan Skill        : ");
        selectData.skill = string.nextLine();
        System.out.print("Masukkan Nilai UTS    : ");
        selectData.uts = doubleValue.nextDouble();
        System.out.print("Masukkan Nilai UAS    : ");
        selectData.uas = doubleValue.nextDouble();
        // selectData.rata2_uts = (30.0 / 100) * selectData.uts;
        // selectData.rata2_uas = (70.0 / 100) * selectData.uas;
        // selectData.nilai_akhir = selectData.uts + selectData.uas;
        // System.out.println("cek UTS : " + selectData.rata2_uts);
        // System.out.println("cek UAS : " + selectData.rata2_uas);
        // System.out.println("cek NA : " + selectData.nilai_akhir);
    }

    public void remove(LinkedListMhs2 selectData) {
        selectData = null;
    }

    public LinkedListMhs2 getNext() {
        return next;
    }

    public LinkedListMhs2 getPrev() {
        return prev;
    }

    public static void main(String[] args) {
        int menu = 0, id = 1, delete;
        LinkedList2 inputMenu = new LinkedList2();
        while (menu != 5 && menu <= 5) {
            System.out.print("1. Input\n2. View\n3. Update\n4. Delete\n5. Exit\n");
            System.out.print("Masukkan Menu : ");
            menu = integer.nextInt();
            if (menu == 1) {
                // idNumber = id;
                System.out.println(id);
                inputMenu.add(id);
                id++;
                System.out.println("Tambah Data Selesai");
                System.out.println("-----------------------------------------\n");
            } else if (menu == 2) {
                inputMenu.view(id);
                System.out.println("Cek Id Number : " + id);
            } else if (menu == 3) {
                inputMenu.updateData(id);
            } else if (menu == 4) {
                System.out.print("\n1. Data Pertama\n2. Data Terakhir\n3. Remove Berdasarkan ID\n");
                System.out.print("Pilih Menu : ");
                delete = integer.nextInt();
                if (delete == 1) {
                    inputMenu.removeFirst(id);
                } else if (delete == 2) {
                    inputMenu.removeLast();
                } 
                // else if (delete == 3) {
                //     inputMenu.removeByID();
                // } 
                else {
                    System.out.println("Batas Maksimal hapus sampai 2 angka");
                }
            } else if (menu == 5) {
                System.out.println("Keluar");
            } else {
                System.out.println("Maksimal nomor sampai 4");
            }
        }
    }
}

class LinkedList2 {
    LinkedListMhs2 head, tail, next, prev;
    Integer id;
    public LinkedList2() { // Constructor
        head = null;
        tail = null;
        next = null;
        prev = null;
    }

    public void add(int idNumber) {
        LinkedListMhs2 addData = new LinkedListMhs2();
        addData.inputData(idNumber);
        if (head == null) {
            head = addData;
        } else {
            tail.next = addData;
        }
        tail = addData;
    }

    public void view(int id) {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("------------------------------------\n");
            return;
        } else {
            id = head.id;
            int menuView = 0;
            LinkedList2 sendView = new LinkedList2();
            while (menuView <= 3) {
                System.out.print("\n1. View Berdasarkan ID\n2. View Berdasarkan Nilai Akhir\n");
                System.out.print("Masukkan Menu : ");
                Scanner integer = new Scanner(System.in);
                menuView = integer.nextInt();
                if (menuView == 1) {
                    System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS | NILAI AKHIR |");
                    System.out.println("------------------------------------");
                    LinkedListMhs2 viewData = head;
                    while (viewData != null) {
                        viewData.viewData();
                        viewData = viewData.next;
                        id++;
                    }
                    System.out.println("View Data Selesai");
                    System.out.println("-----------------------------------------\n");
                    System.out.println("Cek Id Number di View : " + id);
                } else if (menuView == 2) {
                    System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS | NILAI AKHIR |");
                    System.out.println("------------------------------------");
                    LinkedListMhs2 viewData = head;
                    while (viewData != null) {
                        if (viewData.id == 1) {
                            System.out.println("Jika ID 1");
                            viewData.viewData();
                            viewData = viewData.next;
                            viewData = viewData.next;
                            System.out.println("Cek ID : " + viewData.id);
                            // System.out.println("Cek Prev NA : " + viewData.prev.nilai_akhir);
                        }
                        else if (viewData.prev.nilai_akhir > viewData.nilai_akhir) {
                            // System.out.println(viewData.prev.nilai_akhir);
                            System.out.println("Nilai Terendah");
                            viewData.viewData();
                            viewData = viewData.next;
                            // id++;
                        } 
                        else if (viewData.prev.nilai_akhir < viewData.nilai_akhir) {
                            System.out.println("Nilai Tertinggi");
                            LinkedListMhs2 viewAgain = head;
                            while (viewAgain != null) {
                                if (viewAgain.nilai_akhir < viewData.nilai_akhir) {
                                    LinkedListMhs2 tampung;
                                    tampung = viewAgain;
                                    viewAgain = viewData;
                                    viewData = tampung;
                                    viewAgain = viewAgain.next;
                                } else {
                                    viewAgain = viewAgain.next;
                                }
                            }
                            viewData.viewData();
                            // viewData = viewData.next;
                            // id++;
                        }
                    }
                } else {
                    System.out.println("Menu tidak tersedia");
                }
            }
        }
    }

    public void updateData(int id) {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("------------------------------------\n");
        } else {
            // int update;
            LinkedListMhs2 send = new LinkedListMhs2();
            int save = send.inputIDupdate();
            // System.out.print("lewati ini");
            LinkedListMhs2 selectData = head;
            while (selectData != null) {
                if (selectData.id == save) {
                    System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS | NILAI AKHIR |");
                    System.out.println("------------------------------------");
                    System.out.println("| "+ selectData.id +" | "+ selectData.nim +" | "+ selectData.nama +" | "+ selectData.alamat +" | "+ selectData.skill +" | "+ selectData.uts +" | "+ selectData.uas +" | "+ selectData.nilai_akhir +" |");
                    System.out.println("Berhasil Masuk Pengujian");
                    System.out.println("Update Data : ");
                    send.InputUpdateData(selectData);
                    System.out.println("Data Berhasil Di Update");
                    System.out.println("------------------------------------\n");
                    break;
                } else {
                    selectData = selectData.next;
                }
            }
            System.out.println("ID TIDAK DITEMUKAN");
            System.out.println("------------------------------------\n");
        }
    }

    public void removeFirst(int id) {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("------------------------------------\n");
            return;
        } else {
            System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS | NILAI AKHIR |");
            System.out.println("------------------------------------");
            System.out.println("| "+ head.id +" | "+ head.nim +" | "+ head.nama +" | "+ head.alamat +" | "+ head.skill +" | "+ head.uts +" | "+ head.uas +" | "+ head.nilai_akhir +" |");
            System.out.println("Data "+ head.id +" Berhasil Dihapus");
            System.out.println("Cek Data Head.Next : " + head.next.id);
            System.out.println("Cek Data Head : " + head.id);
            head = head.next;
            System.out.println("Cek Data Head : " + head.id);
            System.out.println("Data Pertama Berhasil Dihapus");
            System.out.println("------------------------------------\n");
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("------------------------------------\n");
            return;
        } else if (head == tail) {
            System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS | NILAI AKHIR");
            System.out.println("------------------------------------");
            System.out.println("| "+ tail.id +" | "+ tail.nim +" | "+ tail.nama +" | "+ tail.alamat +" | "+ tail.skill +" | "+ tail.uts +" | "+ tail.uas +" | "+ tail.nilai_akhir +" |");
            System.out.println("Data "+ tail.id +" Berhasil Dihapus");
            head = null;
            tail = null;
            System.out.println("Data Kembali NULL");
            System.out.println("------------------------------------\n");
        } else {
            System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS |");
            System.out.println("------------------------------------");
            System.out.println("| "+ tail.id +" | "+ tail.nim +" | "+ tail.nama +" | "+ tail.alamat +" | "+ tail.skill +" | "+ tail.uts +" | "+ tail.uas +" | "+ tail.nilai_akhir +" |");
            System.out.println("Data "+ tail.id +" Berhasil Dihapus");
            System.out.println("Data Terakhir Berhasil Dihapus");
            System.out.println("------------------------------------\n");
            LinkedListMhs2 removeLastData = head.next;
            LinkedListMhs2 backOff = head;
            while (removeLastData != tail) {
                removeLastData = removeLastData.next;
                backOff = backOff.next;
            }
            backOff.next = null;
            tail = backOff;
        }
    }
    // public void removeByID() {
    //     if (head == null) {
    //         System.out.println("Data Kosong");
    //         System.out.println("------------------------------------\n");
    //     } else {
    //         LinkedListMhs2 send = new LinkedListMhs2();
    //         int save = send.inputIDupdate();
    //         LinkedListMhs2 slow_ptr = head;
    //         LinkedListMhs2 selectData = head;
    //         LinkedListMhs2 tampung = null;
    //         LinkedListMhs2 temp = null;
    //         LinkedListMhs2 prev = null;
    //         while (selectData != null) {
    //             if (selectData.id == save) {
    //                 System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS |");
    //                 System.out.println("------------------------------------");
    //                 System.out.println("| "+ selectData.id +" | "+ selectData.nim +" | "+ selectData.nama +" | "+ selectData.alamat +" | "+ selectData.skill +" | "+ selectData.uts +" | "+ selectData.uas +" | ");
    //                 System.out.println("Berhasil Masuk Pengujian");
    //                 System.out.println("Remove Data BY ID : ");
    //                 // ---------------------------------------------
    //                 // temp = selectData; // temp = data ID save
    //                 // prev = slow_ptr; // prev = head
    //                 // slow_ptr = slow_ptr.next; // head = head.next
    //                 // break;
    //                 // ---------------------------------------------
    //                 // temp = head;
    //                 // // head = selectData;
    //                 // prev = selectData.next;
    //                 // break;
    //                 // ---------------------------------------------
    //                 // temp = head;
    //                 // temp = selectData;
    //                 // prev = selectData.next;
    //                 // break;
    //                 // ---------------------------------------------
    //                 // temp = selectData;
    //                 // selectData = null;
    //                 // selectData = temp.next;
    //                 // System.out.println(selectData.id);

    //                 // selectData = selectData.next;
    //                 // temp = null;
    //             } else {
    //                 tampung = selectData;
    //                 selectData = selectData.next;
    //                 // System.out.println(selectData.id);
    //             }
    //         }
    //         // System.out.println(head.next.id); // id 2
    //         // head.next = slow_ptr.next; // Fungsi Hapus Sudah Ketemu
    //         // System.out.println(head.next.id); // id 3
    //         // System.out.println(slow_ptr.next.id); // id 2
    //         // ---------------------------------------------------------
    //         // head = selectData;
    //         // head = tampung, prev;
    //         // tail = head;
    //         // head = tampung.getPrev();
    //         // System.err.println(head.id);
    //         // System.out.println(tail.id);
    //         // head.prev = temp;
    //         // System.out.println(head.prev.id);
    //         // ---------------------------------------------------------
    //         // System.out.println(temp.id);
    //         // temp = prev;
    //         // System.out.println(prev.id);
    //         // selectData = prev;
    //     }
    // }
}