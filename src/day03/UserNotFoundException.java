package day03;

public class UserNotFoundException extends RuntimeException{
    private static String DEFAULT_MESSAGE = "User not found : ";

    public UserNotFoundException(String message) {
        super(DEFAULT_MESSAGE + message);
    }
}
