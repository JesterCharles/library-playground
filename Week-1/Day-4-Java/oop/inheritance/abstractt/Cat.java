package inheritance.abstractt;

public class Cat extends Pet{
    public Cat(String species, int age, String name) {
        super(species, age, name);
    }

    @Override
    public void speak() {
        System.out.println("meow");
    }
}
