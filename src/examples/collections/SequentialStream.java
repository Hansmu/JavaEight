package examples.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SequentialStream {

    /**
     * Create a stream object from a collection. Can do things with it including traversing, filtering.
     * Java has sequential and parallel streams.
     * Sequential lets you deal with each item individually.
     *
     * Parallel streams can be processed by multi-core processors.
     * **/
    public static void main(String args[]){

        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));

        Predicate<Person> pred = (p) -> p.getAge() > 65;

        displayPeople(people, pred);

    }

    private static void displayPeople(List<Person> people, Predicate<Person> pred) {
        System.out.println("Selected:");
//        people.forEach(p -> {
//            if (pred.test(p))
//            {
//                System.out.println(p.getName());
//            }
//        });
        //Creates a stream of the collection with .stream()
        //Items in the stream are the same type as the collection itself.
        people.stream()
                .filter(pred) //Filter automatically calls the pred.test() method
                .forEach(person -> System.out.println(person.getName()));

        /** To create a parallel stream. **/
        /** Can also just add to the previous example .parallel() **/
        people.parallelStream()
                .filter(pred)
                .forEach(p -> System.out.println(p.getName()));
    }
}
