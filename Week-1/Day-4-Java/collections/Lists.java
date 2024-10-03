import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
    Lists are very powerful data structures that are flexible and allow for duplicate data. They
    are similar to arrays in that information stored in lists is sequential and maintains your
    order of insertion. Also, you can access the data (elements) in your lists via their index
    positions
 */
public class Lists {
    public static void main(String[] args) {

        /*
            because Lists can store just about any type, the List interface indicates this by
            using Generics. Generics can be used anytime you need to indicate that some type
            is going to be used with your code, but that type can't be determined until your
            Class/Method is being used. This is how Lists and the other collection options
            can accommodate storing many different types dynamically without needing a
            very large data set of source code: the type being stored is dynamically determined
            while writing your source code
         */

        List<String> names = new LinkedList<>();
        // note that Integer the class type is indicated instead of the primitive int
        List<Integer> numbers = new ArrayList<>();
        /*
            Because Lists and other resources that are part of the Collection API require
            class types when indicating the data they store, Java performs "Autoboxing"
            for you when you provide an integer to the data structure. In the case of
            adding your primitive value Java will convert the primitive from its
            primitive form into its class form for you. This is called Boxing. When you get
            the information from the structure it will convert it again, but this time from
            its class form into its primitive form. This is called Unboxing
         */
        numbers.add(5);

        names.add("Billy");
        names.add("Sally");
        names.add("Brutus");
        names.add("Slagathor");


        // the output will be the same whether you use an ArrayList or LinkedList
        // the difference between the two is only seen "under the hood". See study guide for details
        System.out.println(names);

    }
}
