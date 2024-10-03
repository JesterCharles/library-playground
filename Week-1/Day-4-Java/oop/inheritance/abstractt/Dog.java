package inheritance.abstractt;

public class Dog extends Pet{
    public Dog(String species, int age, String name) {
        super(species, age, name);
    }

    @Override
    public void speak() {
        System.out.println("woof");
    }
}
