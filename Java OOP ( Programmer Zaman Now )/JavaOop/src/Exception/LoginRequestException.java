public record LoginRequestException(String username, String password) {
    public LoginRequestException {
        System.out.println("USERNAME : " + username);
        System.out.println("PASSWORD : " + password);
    }
}
