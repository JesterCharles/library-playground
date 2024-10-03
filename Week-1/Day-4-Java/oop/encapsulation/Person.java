package encapsulation;

/*
    Encapsulation is all about controlling access to the resources in your code. We have
    seen this at the macro level with classes and objects, but this practice is also done
    at the micro level in individual classes. This is often facilitated by making class fields
    private and using public methods to interact with those private resources
 */
public class Person {
    /*
        Since these fields are private, if we want to access them outside of the class
        directly we will need public methods to do so
     */
    private int socialSecurityNumber;
    private String name;
    private int age;

    /*
        This is a common design pattern in Java: fields are private and public getter and
        setter methods are used to control access to the fields. We can use these methods
        not just to access the fields but to control how interacting with the fields works
     */

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // since we don't want people to be negative years old we can make sure that does not happen
        if(age < 0){
            this.age = 0;
        } else {
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // there is a lot of freedom in names, so we leave this with no special rules
        this.name = name;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        // SSIDs typically follow a convention, so we can make sure the convention is followed
        String ssidString = Integer.toString(socialSecurityNumber);
        if(ssidString.length() == 9){
            this.socialSecurityNumber = socialSecurityNumber;
            System.out.println("SSID set successfully");
        } else {
            System.out.println("Invalid SSID: please try again");
        }

    }

    @Override
    public String toString() {
        // SSIDs are usually private, so we can leave it out of the toString method
        return "Person{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
