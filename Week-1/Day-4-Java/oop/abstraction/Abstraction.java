package abstraction;

/*
    All classes in Java, if they do not explicitly extend any other class, inherit properties
    from the base Java Object class. This class contains multiple methods that are required
    by other Java classes to work properly. We don't need to know how these methods work, and
    sometimes we won't even know they are being used, and that is the beauty of Abstraction.
    Complex implementation can be hidden away from the user which helps to prevent code clutter
    and allows developers to focus on their specific code and its implementation
 */
public class Abstraction {
    public static void main(String[] args) {

        // this object has no methods defined by us, but if you use intelisense you will
        // see it has a litany of methods already provided due to the base object class. These
        // methods and their implementaion has been abstracted away from us, we can just use them
        // knowingly or unknowingly
        Abstraction obj = new Abstraction();

        // under the hood the println method is calling the argument's "toString" method
        // and we don't need to know that it is doing so or how it does so in order to use
        // the println method
        System.out.println(obj);


    }
}
