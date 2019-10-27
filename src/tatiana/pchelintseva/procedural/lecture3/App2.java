package tatiana.pchelintseva.procedural.lecture3;

public class App2 {
    public static void main(String[] args) {
        fib(5);
    }
    public static  int fib(int arg){
        System.out.print(" " + arg);
        return arg<2? 1: fib(arg - 2) + fib(arg- 1);
    }
}
