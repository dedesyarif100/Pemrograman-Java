import data.IsMaintenance;

public class RecoedApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Eko", "Rahasia", 1, 3, 2.5);
        
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Eko"));
        System.out.println(new LoginRequest("Dede", "Syarif", 10, 20, 3.5));
        System.out.println(loginRequest.IsMaintenance());
        System.out.println(loginRequest.number());
        System.out.println(loginRequest.getStringBrand());
        System.out.println(loginRequest.tes());
        // System.out.println(loginRequest.say());
    }
}
