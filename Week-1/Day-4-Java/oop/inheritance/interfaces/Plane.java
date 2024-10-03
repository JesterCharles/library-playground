package inheritance.interfaces;

/*
    Similar to Car, Planes are vehicles and can drive (taxing to and from the runway)
    and they can also fly, so the Plane class will also implement the Flyable interface. This
    means the class does need to implement more methods, but this allows us to have
    the same user interface for performing common actions (driving) that are context specific
    for the implementing class
 */
public class Plane extends Vehicle implements Driveable, Flyable{
    public Plane(int gas) {
        super(gas);
    }

    @Override
    public void drive() {
        System.out.println("VROOM VROOM!");
    }

    @Override
    public void setCruiseControl(int speed) {
        System.out.println("Taxi speed of " + speed + " MPH set.");
    }

    @Override
    public void fly() {
        System.out.println("Ladies and gentlemen, please fasten your seatbelts");
    }
}
