package examples.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class AggregatingStreams {

    public static void main(String args[]){

        System.out.println("Creating list");
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            strings.add("Item " + i);
        }

        countItems(strings);
        strings.stream() //Parallel stream works like any other threading. Splitting the data handling into blocks.
                .parallel()
                .forEach(str -> System.out.println(str));

    }

    private static void countItems(List<String> strings) {
        long count = strings.stream().count();
        System.out.println("Count: " + count);
    }

    private static void sumAndAverageOfAges() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));

        int sum = people.stream() //mapToInt - purpose to take a complex object and extract a simple primitive value of it and
                    .mapToInt(p -> p.getAge()) //Create a stream of those values.
                    .sum();

        System.out.println("Total of ages: " + sum);

        OptionalDouble average = people.stream() //Might get a zero back. Doing division, you get an optional variable.
                                        .mapToInt(p -> p.getAge())
                                        .average();

        //Before you process the optional, you have to check it actually has a value. Do so with a .isPresent()
        if(average.isPresent()) { //It's a complex object so the type is wrapped around the object. Get the double from it.
            System.out.println("Average: " + average.getAsDouble());
        } else { //In this example it will not go here. But it'd go here if you get a divide by zero situation.
            System.out.println("Average not calculated.");
        }
    }
}
