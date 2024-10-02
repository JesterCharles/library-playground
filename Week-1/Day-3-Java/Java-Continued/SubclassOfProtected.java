import pack.Protected;

public class SubclassOfProtected extends Protected {

    public SubclassOfProtected(String protectedString, int protectedInt) {
        /*
            This class requires its own constructor, but it only needs to do the same work
            that the parent class constructor does. Instead of rewriting the code to perform
            the same actions, we can use the super keyword and pass the parameter data to
            the parent constructor
         */
        super(protectedString, protectedInt);
    }

    public static void main(String[] args) {
        SubclassOfProtected subclassOfProtectedObject = new SubclassOfProtected("This is a protected String", 200);
        System.out.println(subclassOfProtectedObject.protectedString);
        System.out.println(subclassOfProtectedObject.protectedInt);
    }
}
