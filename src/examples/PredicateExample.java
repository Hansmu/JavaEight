package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String args[]) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe", 48));
        people.add(new Person("John", 12));
        people.add(new Person("Sally", 23));

        //Filter the list and only display certain people.
//        Predicate<Person> predicate = new Predicate<Person>() {
//            @Override
//            public boolean test(Person person) {
//                return (person.getAge() >= 25);
//            }
//        };
//
//        for (Person person: people) {
//            if(predicate.test(person)) {
//                System.out.println(person.toString());
//            }
//        }

        Predicate<Person> predicateOlder = person -> person.getAge() >= 25;
        people.forEach(person -> {
            if(predicateOlder.test(person)) {
                System.out.println(person);
            }
        });
    }


}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static int compareAges(Person personOne, Person personTwo) {
        Integer ageOne = personOne.getAge();
        return ageOne.compareTo(personTwo.getAge());
    }
}