package polymorphism;

/*
    Often when talking about Polymorphism in Java people are referring to the ability for a
    method to take on many forms. There are two primary ways this happens
    - Overriding: This is run-time polymorphism where the implementation is determined by the
                  type of the object calling the method
    - Overloading: This is compile-time polymorphism where methods can share a name but have
                   differing implementations
 */
public class Polymorphism {

    /*
        Below there are two different implementations of the class constructor: one is a
        no args constructor that only creates an object, the other will still create our
        object but will also print a message of our choice to the terminal. This is an example
        of overloading: one method can change its parameters to change the implementation
     */
    // if no other constructors are defined then Java auto provides a default constructor like this
    public Polymorphism(){
        // all this constructor does is make our object
    }

    // if we define our own constructor we lose access to the Java provided default constructor
    public Polymorphism(String creationMessage){
        // this constructor will print a message to the terminal and create our object
        System.out.println(creationMessage);
    }

    /*
        Overloading works with regular methods as well: you can even change the return type
        as long as the version of the method can be distinguished via the parameters in the
        method signature
     */

    public void overLoadedMethod(){
        System.out.println("no args");
    }
    public String overloadedMethod(String input){
        return "Your input was " + input;
    }


    /*
        This is overriding: toString is already defined and implemented in the Object class,
        but we are changing the implementation in our Polymorphism class to better suit our
        needs
     */
    @Override
    public String toString() {
        return "This is different behavior than the default toString method";
    }

    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        Polymorphism objTwo = new Polymorphism("overloading in action");
        System.out.println(obj);
    }
}
