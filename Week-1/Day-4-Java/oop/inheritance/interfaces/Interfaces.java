package inheritance.interfaces;

/*
    Unlike abstract classes, which are really just classes you can not directly instantiate,
    Interfaces are more like "contracts": classes that "implement" interfaces are "agreeing"
    to implement the behaviors defined in the interface.

    Unlike class inheritance, in which Java only supports single inheritance (can only extend
    one class at a time), multiple Interfaces can be implemented by a single class, which makes
    them more suitable when it is specifically methods that need to be defined and shared
 */
public interface Interfaces {
    /*
        In Interfaces, any fields are, by default:
        - public: can be accessed anywhere
        - static: belongs to the interface instead of object
        - final: field is immutable

        note that for constant values (final values in this case) the naming convention
        norm is all uppercase
     */
    String INTERFACEFIELD = "Interface Field";

    /*
        Interface methods are considered public abstract by default,
        but you can also have static methods and default implementations
     */

    // defaults to public abstract
    void interfaceMethod();

    // interface static methods are public by default
    static void interfaceStaticMethod(){
        System.out.println("this method is called by referencing the Interface directly");
    }

    // interface methods with default implementations are public by default
    default void defaultImplementation(){
        System.out.println("the inheriting class will use this implementation by default unless changed");
    }



}
