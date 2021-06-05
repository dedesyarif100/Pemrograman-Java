public class ValidationApp {
    public static void main(String[] args) {
        LoginRequestException loginRequest = new LoginRequestException("DEDE", "Rahasia");
        try { // Untuk melakukan validasi program memastikan tidak ada error
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException exception) { // Untuk menangkap value data yang error agar program tetap berjalan
            System.out.println("Masuk Validation Exception");
            System.out.println("Data Tidak Valid : " + exception.getMessage());
        } finally { // Finnaly, kode block yang selalu di eksekusi baik error maupun tidak
            System.out.println("Selalu di Eksekusi");
        }
        // catch (NullPointerException exception) {
        //     System.out.println("Masuk Null Pointer");
        //     System.out.println("Data Null : " + exception.getMessage());
        // }

        LoginRequestException loginRequest2 = new LoginRequestException("AA", "DD");
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukses");
    }
}
