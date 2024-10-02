package exceptions;

/*
    Exceptions are Java's way of telling you something has gone wrong during the execution
    of your code. A quick distinction:
    - Error: this is typically something that goes wrong during the compiling process of your source code
    - Exception: this is typically something that goes wrong during code execution (source code has already been compiled)
 */
public class ExceptionBasics {

    /*
        There are two primary kinds of exceptions: Checked Exceptions and Unchecked Exceptions. Checked exceptions, when they are
        a possibility, must be accommodated for in your code (handled), whereas Unchecked Exceptions do not need to be handled
     */

    public static void main(String[] args) {
        ExceptionBasics obj = new ExceptionBasics();
        // because we chose not to handle the checked exception in the method we must do something about it here

        /*
            The try section is for your code that may or may not throw your exception (this can be a checked or unchecked exception)
            If your code does not throw an exception, then similar to how an if/else block works, the catch section will not
            execute. If the listed exception/s (in parentheses) is thrown then the assocaited block of code for that exception
            is triggered. These blocks are typically used to perform any error messaging or logging needed, and to craft a
            response to the end user indicating what has gone wrong
         */
        try{
            obj.throwingCheckedExceptionAndDuckingResponsibility("This is my checked exception message");
        } catch(Exception checkedException){
            /*
                the checkedException variable above can be used to access the Exception that was thrown in the try block.
                You can use this variable to get data about the exception, or perform basic Exception actions like
                printing the stack trace
             */
            System.out.println(checkedException.getMessage()); // this prints the exception message
        }
        try{
            obj.throwingUncheckedException("This is an unchecked exception message");
        } catch(RuntimeException runtimeException){
            System.out.println(runtimeException.getMessage());
        }

        try{
            throw new CustomCheckedException("This is my custom checked exception");
        } catch(CustomUncheckedException | CustomCheckedException customException){
            System.out.println(customException.getMessage());
            customException.printStackTrace();
        } catch (ArithmeticException basicException){
            System.out.println("How did this happen?");
        } finally {
            System.out.println("This block triggers whether an exception is caught or not");
        }

    }

    void illegalMath(){
        // this will throw an ArithmeticException
        System.out.println(10 / 0);
    }

    void throwingArithmeticException(String message){
        // we can manually throw exceptions as well
        throw new ArithmeticException(message);
    }

    void throwingUncheckedException(String message){
        /*
            You can throw the RuntimeException class on its own, but it is not common to do so. Typically, you would either throw
            one of its child classes as your exception, or you would make your own custom exception
         */
        throw new RuntimeException(message);
    }

    /*
        When working with Checked Exceptions (and technically with unchecked ones as well) there are two ways to handle them:
        you can either programmatically ignore them, or you can "handle" them in your code.

        The simple way is to ignore the problem by adding the "throws" keyword to your method signature

        The more robust way is to use a try/catch block of code to tell Java what to do if the exception is thrown
     */
    void throwingCheckedExceptionAndDuckingResponsibility(String message) throws Exception{
        // because of the throws clause we don't need to do anything about this exception here in this method
        throw new Exception(message);
    }

}
