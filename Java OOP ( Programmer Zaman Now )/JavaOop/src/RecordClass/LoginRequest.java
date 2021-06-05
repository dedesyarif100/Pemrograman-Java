import data.Avanza;
import data.HasBrand;
import data.IsMaintenance;

// Fitur record di Java tidak bisa melakukan extends Class, namun bisa melakukan implements Interface
// Java record dikhususkan untuk menyimpan data, bersifat Immutable, yaitu datanya tidak bisa dirubah lagi
// Contoh set field username/password, username/password valuenya tidak bisa dirubah lagi di class lain
public record LoginRequest(String username, String password, int satu, int dua, double koma) implements IsMaintenance, HasBrand { // Jika Record, untuk membuat constructor seperti kode berikut
    public LoginRequest { // Compact Constructor
        // System.out.println("Membuat Object LoginRequest");
        System.out.println(username);
        System.out.println(password);
        System.out.println(satu +", "+ dua +", "+ koma);
    }

    public LoginRequest(String username) {
        this(username, "", 1, 3, 2.5);
    }

    public LoginRequest() {
        this("", "", 1, 3, 2.5);
    }

    public boolean IsMaintenance() {
        System.out.println("Cek IsMaintenance");
        return !((satu == dua) & !(password.length() > koma)) ? true : false;
    }

    public Integer number() {
        return 5;
    }
    
    public String getStringBrand() {
        return username;
    }

    public boolean tes() {
        System.out.println("Cek tes");
        return !((satu < dua) && (dua < koma)) && password.length() > dua;
    }

    public Integer getIntBrand() {
        return 5;
    }

    public void say(String username, String password) {
        System.out.println(username);
    }
    // public void hello(String username) {
    //     this.username = username; // Jika Field di dalam Record, Field tersebut otomatis di Set Final / tidak bisa dirubah lagi
    // }
}
