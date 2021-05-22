package LinkedListJava;

import java.util.Scanner;

public class LinkedListMhs2 {
    // LinkedListMhs2 idNumber;
    public Integer id_mahasiswa, nim, update;
    Double uts, uas, rata2_uts, rata2_uas, nilai_akhir;
    String nama, alamat, skill;
    LinkedListMhs2 prev, next;

    static Scanner integer = new Scanner(System.in);
    static Scanner string = new Scanner(System.in);
    Scanner doubleValue = new Scanner(System.in);
    public void inputDataMahasiswa(Integer idNumber) {
        // System.out.println(next);
        System.out.print("ID TERBUAT OTOMATIS   : " + (id_mahasiswa = idNumber) + "\n");
        id_mahasiswa = idNumber;
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
        System.out.println("| "+ id_mahasiswa +" | "+ nim +" | "+ nama +" | "+ alamat +" | "+ skill +" | "+ uts +" | "+ uas +" | "+ nilai_akhir +" |");
    }

    public void viewDataByNilaiAkhir() {
        System.out.println("| "+ id_mahasiswa +" | "+ nim +" | "+ nama +" | "+ alamat +" | "+ skill +" | "+ uts +" | "+ uas +" | "+ nilai_akhir +" |");
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
        selectData.rata2_uts = (30.0 / 100) * selectData.uts;
        selectData.rata2_uas = (70.0 / 100) * selectData.uas;
        selectData.nilai_akhir = selectData.uts + selectData.uas;
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

    public void tambahData(Integer idNumber, Integer a, String b, String c, String d, Double e, Double f, LinkedListMhs2 sendData, LinkedListMhs2 test) {
        LinkedList2 kirim = new LinkedList2();
        id_mahasiswa = idNumber;
        nim = a;
        nama = b;
        alamat = c;
        skill = d;
        uts = e;
        uas = f;
        rata2_uts = (30.0 / 100) * uts;
        rata2_uas = (70.0 / 100) * uas;
        nilai_akhir = uts + uas;
        // kirim.testAddData(id, nim, nama, alamat, skill, uts, uas, sendData, test);
        // System.out.println(" | "+ id +" | "+ nim +" | "+ nama +" | "+ alamat +" | "+ skill +" | "+ uts +" | "+ uas +" | ");
    }

    public static void main(String[] args) {
        int menu = 0, addData, delete, pilihanInput = 0;
        int id_mahasiswa = 1, 
            id_dosen = 1,
            id_mataKuliah = 1,
            id_relasiPerusahaan = 1,
            id_alumniUniversitas = 1;
        LinkedList2 inputMenu = new LinkedList2();
        LinkedListDosen inputDosen = new LinkedListDosen();
        LinkedListMataKuliah inputMataKuliah = new LinkedListMataKuliah();
        LinkedListRelasiPerusahaan inputRelasiPerusahaan = new LinkedListRelasiPerusahaan();
        LinkedListAlumniUniversitas inputAlumniUniversitas = new LinkedListAlumniUniversitas();
        System.out.println("Cek");
        while (menu != 5 && menu <= 5) {
            System.out.print("\n1. Input\n2. View\n3. Update\n4. Delete\n5. Exit\n");
            System.out.print("Masukkan Menu : ");
            menu = integer.nextInt();

            // Add Data LinkedList //////////////////////////////////////////////////////////////////////////////

            if (menu == 1) {
                System.out.print("\n1. Data Mahasiswa\n2. Data Dosen\n3. Data Mata Kuliah\n4. Data Relasi Perusahaan\n5. Data Alumni Universitas\n");
                System.out.print("Masukkan Menu : ");
                pilihanInput = integer.nextInt();
                if (pilihanInput == 1) {
                    // idNumber = id;
                    System.out.print("\n1. Input Data Dummy\n2. Input Data Manual\n");
                    System.out.print("Pilih Menu : ");
                    addData = integer.nextInt();
                    if (addData == 1) {
                        int a = 0;
                        while (true) {
                            if (a == 30) {
                                break;
                            } else {
                                inputMenu.kumpulData(id_mahasiswa);
                                id_mahasiswa++;
                                a++;
                            }
                        }
                        // inputMenu.kumpulData(id);
                        System.out.println("Tambah Data Selesai");
                        System.out.println("-----------------------------------------\n");
                    } else {
                        System.out.println(id_mahasiswa);
                        inputMenu.addMahasiswa(id_mahasiswa);
                        id_mahasiswa++;
                        System.out.println("Tambah Data Selesai");
                        System.out.println("-----------------------------------------\n");
                    }
                } else if (pilihanInput == 2) {
                    inputDosen.addDosen(id_dosen);
                    id_dosen++;
                } else if (pilihanInput == 3) {
                    inputMataKuliah.addMataKuliah(id_mataKuliah);
                    id_mataKuliah++;
                } else if (pilihanInput == 4) {
                    inputRelasiPerusahaan.addRelasiPerusahaan(id_relasiPerusahaan);
                    id_relasiPerusahaan++;
                } else if (pilihanInput == 5) {
                    inputAlumniUniversitas.addAlumniUniversitas(id_alumniUniversitas);
                    id_alumniUniversitas++;
                } else {

                }
            }

            // View Data LinkedList //////////////////////////////////////////////////////////////////////////////

            else if (menu == 2) {
                System.out.print("\n1. View Mahasiswa\n2. View Dosen\n3. View Mata Kuliah\n4. View Relasi Perusahaan\n5. View Alumni Universitas\n");
                System.out.print("Masukkan Menu : ");
                pilihanInput = integer.nextInt();
                if (pilihanInput == 1) {
                    inputMenu.view(id_mahasiswa);
                    System.out.println("Cek Id Number : " + id_mahasiswa);
                } else if (pilihanInput == 2) {
                    inputDosen.viewDosen(id_dosen);
                } else if (pilihanInput == 3) {
                    inputMataKuliah.viewMataKuliah(id_mataKuliah);
                } else if (pilihanInput == 4) {
                    inputRelasiPerusahaan.viewRelasiPerusahaan(id_relasiPerusahaan);
                } else if (pilihanInput == 5) {
                    inputAlumniUniversitas.viewAlumniUniversitas(id_alumniUniversitas);
                }
            } 

            // Update Data LinkedList //////////////////////////////////////////////////////////////////////////////

            else if (menu == 3) {
                System.out.print("\n1. Edit Mahasiswa\n2. Edit Dosen\n3. Edit Mata Kuliah\n4. Edit Relasi Perusahaan\n5. Edit Alumni Universitas\n");
                System.out.print("Masukkan Menu : ");
                pilihanInput = integer.nextInt();
                if (pilihanInput == 1) {
                    inputMenu.updateData(id_mahasiswa);
                } else if (pilihanInput == 2) {
                    inputDosen.editDosen(id_dosen);
                } else if (pilihanInput == 3) {
                    inputMataKuliah.editMataKuliah(id_mataKuliah);
                } else if (pilihanInput == 4) {
                    inputRelasiPerusahaan.editRelasiPerusahaan(id_relasiPerusahaan);
                } else if (pilihanInput == 5) {
                    inputAlumniUniversitas.editAlumniUniversitas(id_alumniUniversitas);
                } 
            } 

            // Delete Data LinkedList //////////////////////////////////////////////////////////////////////////////
            
            else if (menu == 4) {
                System.out.print("\n1. Delete Mahasiswa\n2. Delete Dosen\n3. Delete Mata Kuliah\n4. Delete Relasi Perusahaan\n5. Delete Alumni Universitas\n");
                System.out.print("Masukkan Menu : ");
                pilihanInput = integer.nextInt();
                if (pilihanInput == 1) {
                    System.out.print("Data Mahasiswa : ");
                    System.out.print("\n---------------------------------------------------------------");
                    System.out.print("\n1. Data Pertama\n2. Data Terakhir\n3. Remove Berdasarkan ID\n");
                    System.out.print("Pilih Menu : ");
                    delete = integer.nextInt();
                    if (delete == 1) {
                        inputMenu.removeFirstMahasiswa(id_mahasiswa);
                    } else if (delete == 2) {
                        inputMenu.removeLastMahasiswa();
                    } 
                    // else if (delete == 3) {
                    //     inputMenu.removeByID();
                    // }
                    else {
                        System.out.println("Batas Maksimal hapus sampai 2 angka");
                    }
                } else if (pilihanInput == 2) {
                    System.out.print("Data Dosen : ");
                    System.out.print("\n---------------------------------------------------------------");
                    System.out.print("\n1. Data Pertama\n2. Data Terakhir\n3. Remove Berdasarkan ID\n");
                    System.out.print("Pilih Menu : ");
                    delete = integer.nextInt();
                    if (delete == 1) {
                        inputDosen.removeFirstDosen(id_dosen);
                    } else if (delete == 2) {
                        inputDosen.removeLastDosen();
                    } else if (delete == 3) {
                        inputDosen.removeByIdDosen();
                    }
                } else if (pilihanInput == 3) {
                    System.out.print("Data Mata Kuliah : ");
                    System.out.print("\n---------------------------------------------------------------");
                    System.out.print("\n1. Data Pertama\n2. Data Terakhir\n3. Remove Berdasarkan ID\n");
                    System.out.print("Pilih Menu : ");
                    delete = integer.nextInt();
                    if (delete == 1) {
                        inputMataKuliah.removeFirstMataKuliah(id_mataKuliah);
                    } else if (delete == 2) {
                        inputMataKuliah.removeLastMataKuliah();
                    } else if (delete == 3) {
                        inputMataKuliah.removeByIdMataKuliah();
                    }
                } else if (pilihanInput == 4) {
                    System.out.print("Data Relasi Perusahaan : ");
                    System.out.print("\n---------------------------------------------------------------");
                    System.out.print("\n1. Data Pertama\n2. Data Terakhir\n3. Remove Berdasarkan ID\n");
                    System.out.print("Pilih Menu : ");
                    delete = integer.nextInt();
                    if (delete == 1) {
                        inputRelasiPerusahaan.removeFirstRelasiPerusahaan(id_relasiPerusahaan);
                    } else if (delete == 2) {
                        inputRelasiPerusahaan.removeLastRelasiPerusahaan();
                    } else if (delete == 3) {
                        inputRelasiPerusahaan.removeByIdRelasiPerusahaan();
                    }
                } else if (pilihanInput == 5) {
                    System.out.print("Data Alumni Universitas : ");
                    System.out.print("\n---------------------------------------------------------------");
                    System.out.print("\n1. Data Pertama\n2. Data Terakhir\n3. Remove Berdasarkan ID\n");
                    System.out.print("Pilih Menu : ");
                    delete = integer.nextInt();
                    if (delete == 1) {
                        inputAlumniUniversitas.removeFirstAlumniUniversitas(id_alumniUniversitas);
                    } else if (delete == 2) {
                        inputAlumniUniversitas.removeLastAlumniUniversitas();
                    } else if (delete == 3) {
                        inputAlumniUniversitas.removeByIdAlumniUniversitas();
                    }
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

    // Integer id;
    public LinkedList2() { // Constructor
        head = null;
        tail = null;
        next = null;
        prev = null;
    }

    public void kumpulData(int idNumber) {
        LinkedListMhs2 sendData = new LinkedListMhs2();
        LinkedListMhs2 test = new LinkedListMhs2();
        sendData.tambahData(idNumber, 1, "aa", "aa", "aa", 45.5, 88.5, sendData, test);
        idNumber++;
        if (head == null) {
            head = sendData;
            tail = sendData;
        } else {
            test = tail;
            tail.next = sendData;
            tail = sendData;
            tail.prev = test;
        }
    }

    // public void testAddData(int idNumber, int a, String b, String c, String d, Double f, Double g, LinkedListMhs2 sendData, LinkedListMhs2 test) {
    //     if (head == null) {
    //         head = sendData;
    //         tail = sendData;
    //         System.out.println(head.nama);
    //     } else {
    //         test = tail;
    //         tail.next = sendData;
    //         tail = sendData;
    //         tail.prev = test;
    //         System.out.println(tail.nama);
    //     }
    // }

    public void addMahasiswa(int idNumber) {
        LinkedListMhs2 addData = new LinkedListMhs2();
        LinkedListMhs2 tm = new LinkedListMhs2();
        addData.inputDataMahasiswa(idNumber);
        if (head == null) {
            head = addData;
            tail = addData;
            System.out.println(head);
        } else {
            tm = tail;
            tail.next = addData;
            tail = addData;
            tail.prev = tm;
            System.out.println(tail);
        }
        // if (head.next != null) {
        //     System.out.println(" Cek id : " + tail.prev.id);
        //     System.out.println(" Cek tail : " + tail);
        //     System.out.println(" Cek Next : " + head.next);
        // }
    }

    public void view(int id_mahasiswa) {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("------------------------------------\n");
            return;
        } else {
            id_mahasiswa = head.id_mahasiswa;
            int menuView = 0;
            // LinkedList2 sendView = new LinkedList2();
            while (menuView <= 3) {
                System.out.print("\n1. View Berdasarkan ID\n2. View Berdasarkan Nilai Akhir\n");
                System.out.print("Masukkan Menu : ");
                Scanner integer = new Scanner(System.in);
                menuView = integer.nextInt();
                if (menuView == 1) {
                    System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS | NILAI AKHIR |");
                    System.out.println("--------------------------------------------------------------");
                    LinkedListMhs2 viewData = head;
                    while (viewData != null) {
                        viewData.viewData();
                        viewData = viewData.next;
                        id_mahasiswa++;
                        // System.out.println(tail);
                    }
                    // System.out.println(viewData.prev.prev.id);
                    System.out.println("View Data Selesai");
                    System.out.println("-----------------------------------------\n");
                    System.out.println("Cek Id Number di View : " + id_mahasiswa);
                } 
                // else if (menuView == 2) {
                //     System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS | NILAI AKHIR |");
                //     System.out.println("--------------------------------------------------------------");
                //     LinkedListMhs2 viewData = head;
                //     while (viewData != null) {
                //         if (viewData.id == 1) {
                //             System.out.println("Jika ID 1");
                //             viewData.viewData();
                //             viewData = viewData.next;
                //             System.out.println("Cek ID : " + viewData.id);
                //             // System.out.println("Cek Prev NA : " + viewData.prev.nilai_akhir);
                //         }
                //         else if (viewData.prev.nilai_akhir > viewData.nilai_akhir) {
                //             // System.out.println(viewData.prev.nilai_akhir);
                //             System.out.println("Nilai Terendah");
                //             viewData.viewData();
                //             viewData = viewData.next;
                //             // id++;
                //         }
                //         else if (viewData.prev.nilai_akhir < viewData.nilai_akhir) {
                //             System.out.println(" Cek View : " + viewData.id);
                //             System.out.println("Nilai Tertinggi");
                //             LinkedListMhs2 viewAgain = head;
                //             System.out.println(viewAgain.id);
                //             // break;
                //             while (viewAgain != null) {
                //                 System.out.println("Cek a : "+ viewAgain.nilai_akhir); // loop 2 = 96
                //                 System.out.println("Cek b : "+ viewData.nilai_akhir); // loop 2 = 88
                //                 if (viewAgain.nilai_akhir < viewData.nilai_akhir) {
                //                     System.out.println("Cek a : "+ viewAgain.nilai_akhir); // 88
                //                     System.out.println("Cek b : "+ viewData.nilai_akhir); // 96
                //                     LinkedListMhs2 tampung;
                //                     tampung = viewAgain;
                //                     viewAgain = viewData;
                //                     viewData = tampung;
                //                     // viewAgain = viewAgain.next;
                //                     System.out.println("tampung : " + tampung.nilai_akhir);
                //                     System.out.println("viewAgain : " + viewAgain.nilai_akhir);
                //                     System.out.println("viewData : " + viewData.nilai_akhir);
                //                     System.out.println(" if : " + viewData.id);
                //                 } else {
                //                     if (viewAgain.nilai_akhir > viewData.nilai_akhir) {
                //                         System.out.println("Masuk Break");
                //                         break;
                //                     }
                //                     viewAgain = viewAgain.next;
                //                     System.out.println(" else : " + viewAgain.nilai_akhir);
                //                 }
                //             }
                //             System.out.println(" Cek View : " + viewData.nilai_akhir);
                //             viewAgain.viewData();
                //             viewData = viewData.next;
                //             System.out.println(" Cek View : " + viewData.nilai_akhir);
                //             // id++;
                //         }
                //     }
                // }
                
                else {
                    System.out.println("Menu tidak tersedia");
                }
            }
        }
    }

    public void updateData(int id_mahasiswa) {
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
                if (selectData.id_mahasiswa == save) {
                    System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS | NILAI AKHIR |");
                    System.out.println("------------------------------------");
                    System.out.println("| "+ selectData.id_mahasiswa +" | "+ selectData.nim +" | "+ selectData.nama +" | "+ selectData.alamat +" | "+ selectData.skill +" | "+ selectData.uts +" | "+ selectData.uas +" | "+ selectData.nilai_akhir +" |");
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

    public void removeFirstMahasiswa(int id_mahasiswa) {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("------------------------------------\n");
            return;
        } else {
            System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS | NILAI AKHIR |");
            System.out.println("------------------------------------");
            System.out.println("| "+ head.id_mahasiswa +" | "+ head.nim +" | "+ head.nama +" | "+ head.alamat +" | "+ head.skill +" | "+ head.uts +" | "+ head.uas +" | "+ head.nilai_akhir +" |");
            System.out.println("Data "+ head.id_mahasiswa +" Berhasil Dihapus");
            System.out.println("Cek Data Head.Next : " + head.next.id_mahasiswa);
            System.out.println("Cek Data Head : " + head.id_mahasiswa);
            head = head.next;
            System.out.println("Cek Data Head : " + head.id_mahasiswa);
            System.out.println("Data Pertama Berhasil Dihapus");
            System.out.println("------------------------------------\n");
        }
    }

    public void removeLastMahasiswa() {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("------------------------------------\n");
            return;
        } else if (head == tail) {
            System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS | NILAI AKHIR");
            System.out.println("------------------------------------");
            System.out.println("| "+ tail.id_mahasiswa +" | "+ tail.nim +" | "+ tail.nama +" | "+ tail.alamat +" | "+ tail.skill +" | "+ tail.uts +" | "+ tail.uas +" | "+ tail.nilai_akhir +" |");
            System.out.println("Data "+ tail.id_mahasiswa +" Berhasil Dihapus");
            head = null;
            tail = null;
            System.out.println("Data Kembali NULL");
            System.out.println("------------------------------------\n");
        } else {
            System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS |");
            System.out.println("------------------------------------");
            System.out.println("| "+ tail.id_mahasiswa +" | "+ tail.nim +" | "+ tail.nama +" | "+ tail.alamat +" | "+ tail.skill +" | "+ tail.uts +" | "+ tail.uas +" | "+ tail.nilai_akhir +" |");
            System.out.println("Data "+ tail.id_mahasiswa +" Berhasil Dihapus");
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