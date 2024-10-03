package encapsulation;

public class World {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(-24);
        person.setName("Sally");
        person.setSocialSecurityNumber(123);
        person.setSocialSecurityNumber(123456789);
        System.out.println(person);

    }
}
