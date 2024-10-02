package exceptions;

// this is how you can make a custom checked exception
public class CustomCheckedException extends Exception{
    public CustomCheckedException(String message) {
        super(message);
    }
}
