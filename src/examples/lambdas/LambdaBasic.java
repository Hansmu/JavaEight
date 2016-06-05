package examples.lambdas;

public class LambdaBasic {
    /** Lambda is an anonymous function aka a function without a name.
     *  In Java all functions are members of classes and referred to as methods. Need to define the class of which it is a member.
     *
     *  A lambda expression lets you define a class and a single method with very concise syntax.
     *  Create shorter code.
     *
     *  Functional interface is something that has only a single abstract method. A lambda can only be used on these.
     * **/

    public class MyRunnable implements Runnable {
        @Override
        public void run() {

        }
    }


    //           First part of      Arrow token     Method implementation
    //           the lambda expr    aka             Multiple lines in body require
    //           is the method      Lambda operator Curly braces.
    //           signature.
    Runnable r = ()                 ->              System.out.println("Hello!");
    /**Don't have to specify the types because it's a function interface. That is to say it has a single abstract method,
     * this the types are already known.
     * **/
}
