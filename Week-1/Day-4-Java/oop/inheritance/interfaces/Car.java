package inheritance.interfaces;

/*
    Since a car needs gas and can drive we extend the Vehicle class and implement
    the Driveable interface, and implement the methods of Driveable so they are appropriate
    for a car
 */
public class Car extends Vehicle implements Driveable{
    public Car(int gas) {
        super(gas);
    }

    @Override
    public void drive() {
        System.out.println("vroom vroom!");
    }

    @Override
    public void setCruiseControl(int speed) {
        System.out.println("Cruise control set to " + speed + " MPH.");
    }
}
