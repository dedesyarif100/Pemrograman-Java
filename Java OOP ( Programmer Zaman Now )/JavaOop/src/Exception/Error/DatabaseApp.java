package Error;

public class DatabaseApp {
    public static void main(String[] args) {
        try {
            // connectDatabase("Eko", "Rahasia");
            connectDatabase(null, null);
            System.out.println("Sukses");
        } catch (DatabaseError error) {
            System.out.println("Error " + error.getMessage());
        }
    }

    public static void connectDatabase(String username, String password) {
        if ( (username == null || password == null) ) {
            throw new DatabaseError("Tidak bisa konek ke Database");
        }
    }
}
