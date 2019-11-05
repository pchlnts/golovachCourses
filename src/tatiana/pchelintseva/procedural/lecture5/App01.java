package tatiana.pchelintseva.procedural.lecture5;

public class App01 {
    public static void main(String[] args) {
        int x = 0;
        int y = x;
        x = 1;
        System.out.println("x=" + x);          //Here would be 1
        System.out.println("y=" + y);           //And Here would be 0 ??? yes?
    }
}
