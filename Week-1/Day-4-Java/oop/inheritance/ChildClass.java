package inheritance;

public class ChildClass extends ParentClass{

    String childString;

    public ChildClass(String parentString, String childString) {
        // if using super make sure it is the first call
        super(parentString);
        this.childString = childString;
    }

    public static void main(String[] args) {
        // We could declare the type as either the parent or child, but if the parent type is declared only resources available to the parent
        // can be accessed via the child, not those defined in the child (except the constructor)
        ChildClass obj = new ChildClass("this is the parent string", "this is the child string");
        System.out.println(obj.parentString);
        System.out.println(obj.childString);

        // Note how this ParentClass array can legally store Inheritance class objected: this is because the Inheritance class, because
        // it extends ParentClass, is a valid type for the array
        ParentClass[] array = new ParentClass[1];
        array[0] = obj;
    }
}
