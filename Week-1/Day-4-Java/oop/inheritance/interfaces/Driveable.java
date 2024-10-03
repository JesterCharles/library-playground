package inheritance.interfaces;

/*
    A common naming convention is to use "-able" at the end of the Interface name to indicate
    the implementing class is "able" to perform the action/s associated with the interface
 */
public interface Driveable {
    void drive();
    void setCruiseControl(int speed);
}
