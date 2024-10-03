import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Maps are used to create key-value pair collections in your code. Accessing the resources
    in a Map tends to be easier than using a Collection based data structure because the key/s
    are almost always going to be known to you, and therefore, you have direct access to the
    resources stored in your Map
 */
public class Maps {

    public static void main(String[] args) {
        Map<String, Integer> phonebook = new HashMap<>();

        // Maps do not allow duplicate keys
        phonebook.put("Billy", 1234567890);
        phonebook.put("Billy", 1122334455);
        phonebook.put("Sally", 1987654321);
        phonebook.put("Slagathor", 1987654321);


        // if the key is not present then null is returned
        // NOTE: tree maps do not allow a null key since it can't be used to organize the keys by comparison
        System.out.println(phonebook.get("Teddy"));
        // otherwise the associated value is returned
        System.out.println(phonebook.get("Billy"));
        // if you are not sure if the key exists you can use the getOrDefault method to provide a fallback value
        System.out.println(phonebook.getOrDefault("Teddy", 1111111111));

        // If you want to iterate through the keys use the keySet method
        Set<String> keys = phonebook.keySet();
        for(String key : keys){
            System.out.println(key);
        }

        // similar to keys, use the values() method to iterate through values
        for(int phoneNumber : phonebook.values()){
            System.out.println(phoneNumber);
        }







    }

}
