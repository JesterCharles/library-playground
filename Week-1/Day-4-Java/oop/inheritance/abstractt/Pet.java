package inheritance.abstractt;

/*
    When using an abstract class, keep in mind the goal of using this type of class will
    not be for providing implementation, but instead providing structure.
 */

public abstract class Pet {
    public String species;
    public int age;
    public String name;

    // this is not for creating a Pet object directly: it is for simplifying code in your
    // inheriting classes
    public Pet(String species, int age, String name){
        this.species = species;
        this.age = age;
        this.name = name;
    }

    public void ageUp(){
        age++;
        System.out.println(name + " is now " + age);
    }

    /*
        Because our pets can all "speak" but do so differently, here we define the shared
        behavior (the method access modifier, return type, and signature) but we leave
        implementation to the inheriting classes to make the method work for its specific
        context

        Similar to ducking exceptions, making a method abstract tells Java you will implement
        it later, and Java will hold you too it
     */
    public abstract void speak();

}
