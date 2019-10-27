package tatiana.pchelintseva.procedural.lecture3;

public class App {
    public static void main(String[] args) {
        for (int k = 0; k < 10; k++) {
            System.out.println("fib(" + k + ") = " + fib(k));

        }
    }

    public static int fib(int arg) {
        if (arg == 0 || arg == 1) {
            return 1;
        } else {
            return fib(arg - 2) + fib(arg - 1);

        }
    }

    //public static int fib(int arg) {
    // (return arg < 2 )? 1:fib(arg - 2) + fib(arg - 1);
    //}
}
