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
        obj.throwingArithmeticException("/ by zero");
    }

    void illegalMath(){
        System.out.println(10 / 0);
    }

    void throwingArithmeticException(String message){
        throw new ArithmeticException(message);
    }

}
