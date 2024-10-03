package inheritance.abstractt;

public class PetPark {
    public static void main(String[] args) {
        Pet dog = new Cat("Corgi",4, "Fluffy");
        Pet cat = new Dog("Calico", 8, "Caesar");
//        Pet pet = new Pet("Pidgeon",2,"Brutus"); can't directly make Abstract Class object


        dog.speak();
        cat.speak();
    }
}
