package application;

import interfaces.InterfaceWithArguments;
import interfaces.SimpleInterface;

public class Main {

    public static void main(String[] args) {
        firstExample();
        secondExampleWithArguments();
    }

    private static void firstExample() {
        //Create an object of SimpleInterface
        SimpleInterface firstExample = () -> System.out.println("Hello");

        //Call the method we just implemented.
        firstExample.doSomething();
    }

    private static void secondExampleWithArguments() {
        InterfaceWithArguments arguments = (nrOne, nrTwo) -> {
            int result = nrOne + nrTwo;
            return result;
        };

        System.out.println(arguments.returnSum(10, 15));
    }
}
