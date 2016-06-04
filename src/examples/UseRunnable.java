package examples;

/**
 * Created by Hans on 4.06.2016.
 */
public class UseRunnable {

    public static void main(String[] args) {
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Running thread one.");
//            }
//        };
//
//        Runnable r2 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Running thread two.");
//            }
//        };

        Runnable r1 = () -> System.out.println("Running thread one.");
        Runnable r2 = () -> System.out.println("Running thread two.");

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
