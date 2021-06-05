public class ValidationUtil {
    public static void validate(LoginRequestException loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is Null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is Blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is Null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is Blank");
        }
    }

    public static void validateRuntime(LoginRequestException loginRequest) throws NullPointerException, BlankException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is Null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is Blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is Null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password is Blank");
        }
    }
}
