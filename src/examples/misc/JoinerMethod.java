package examples.misc;

import java.util.StringJoiner;

public class JoinerMethod {

    public static void main(String[] args) {
        //First argument is a separator
        String dudes = String.join(", ", "Bob", "John", "Garry");
        System.out.println(dudes);

        //Takes a separator and array
        String[] states = {"Frozen", "Gas", "Liquid"};
        String statesList = String.join(", ", states);
        System.out.println(statesList);

        //First one is a separator, second is the thing that goes at the start and the final at the end
        StringJoiner stringJoiner = new StringJoiner(", ", "{ ", " }");
        stringJoiner.setEmptyValue("No entries");

        stringJoiner.add("John")
                .add("Bob")
                .add("Bloke");

        System.out.println(stringJoiner);

        StringJoiner stringJoiner2 = new StringJoiner(", ");
        stringJoiner2.add("Alex");

        stringJoiner.merge(stringJoiner2);
        System.out.println(stringJoiner);
    }
}
