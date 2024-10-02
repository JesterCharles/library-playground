package exceptions;

// this is how you can make a custom unchecked exception
public class CustomUncheckedException extends RuntimeException{
    public CustomUncheckedException(String message){
        super(message);
    }
}
