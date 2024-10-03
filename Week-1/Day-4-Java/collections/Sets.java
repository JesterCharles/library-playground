import java.util.HashSet;
import java.util.Set;

/*
    Sets are useful anytime you need to filter data, find unique values, or you just don't
    care about maintaining order of insertion.
 */
public class Sets {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Billy");
        names.add("Sally");
        names.add("Sally"); // no duplicates in sets, so there will only be one Sally
        names.add("Brutus");
        names.add("Slagathor");

        System.out.println(names);
    }
}
