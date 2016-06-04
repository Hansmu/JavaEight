package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReference {

    //A method reference is a syntactic shortcut for creating a lambda from an existing method.
    public static void main(String args[]) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe", 48));
        people.add(new Person("John", 12));
        people.add(new Person("Sally", 23));

        //Static method reference.
        //Sort method is expecting an implementation of the comparator interface.
        //That interface has a single abstract method which expects two values. Calling a method that expects two values
        //And returning a data type that can be used by the sort method.
        Collections.sort(people, Person :: compareAges);
        people.forEach(person -> System.out.println(person));

        //Instance method reference.
        MethodReference example = new MethodReference();
        example.sortData(people);
    }

    public void sortData(List<Person> people) {
        Collections.sort(people, this :: compareAges);
    }

    private int compareAges(Person personOne, Person personTwo) {
        Integer ageOne = personOne.getAge();
        return ageOne.compareTo(personTwo.getAge());
    }
}
