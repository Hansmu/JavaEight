package examples;

import java.util.*;

public class TraverseCollection {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("AAA");
        strings.add("bbb");
        strings.add("CCC");
        strings.add("ddd");
        strings.add("EEE");

        Collections.sort(strings);
        System.out.println("Simple sort");

        //Traverse with for:each
//        for(String str : strings) {
//            System.out.println(str);
//        }
        //Don't have to use parenthesis with a single value.
        strings.forEach(str -> System.out.println(str));

        Comparator<String> comp = (str1, str2) -> {
            return str1.compareToIgnoreCase(str2);
        };
        Collections.sort(strings, comp);
        System.out.println("Sort with comparator");

        //Traverse with iterator
//        Iterator<String> i = strings.iterator();
//        while(i.hasNext()) {
//            System.out.println(i.next());
//        }
        strings.forEach(str -> System.out.println(str));
    }
}
