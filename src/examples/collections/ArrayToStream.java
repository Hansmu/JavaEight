package examples.collections;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

    /**
     * Stream API is built to help you manage collections of data - objects member of the collection library.
     * Can also create streams from arrays.
     * **/
    public static void main(String args[]){

        Person[] people = {
                new Person("Joe", 48),
                new Person("Mary", 30),
                new Person("Mike", 73)
        };

        //First approach using Stream.of()
        Stream<Person> stream = Stream.of(people); //Means to take an array and wrap inside a stream.
        //Second approach using Arrays.stream()
        Stream<Person> stream2 = Arrays.stream(people);
        stream.forEach(p -> System.out.println(p.getName()));
    }
}
