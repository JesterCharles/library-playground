package inheritance.interfaces;

// since all vehicles will have to manage gas we can define that property one time here
public abstract class Vehicle {

    int gas;

    public Vehicle(int gas){
        this.gas = gas;
    }

}
