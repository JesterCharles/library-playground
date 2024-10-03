package inheritance.abstractt;

public class PetPark {
    public static void main(String[] args) {
        /*
            since our Cats and Dogs use the shared properties of the Pet class we can set
            their type as the parent Pet class. This makes it very easy to switch implementation
            in case any refactoring needs to happen, or if the implementation class needs to
            change
         */
        Pet dog = new Cat("Corgi",4, "Fluffy");
        Pet cat = new Dog("Calico", 8, "Caesar");
//        Pet pet = new Pet("Pidgeon",2,"Brutus"); can't directly make Abstract Class object

        dog.speak(); // will woof
        cat.speak(); // will meow
    }
}
