package tatiana.pchelintseva.procedural.lecture5;

public class App4 {
    public static void main(String[] args) {
        IntHolder x = new IntHolder(0);
        x = f(x);
        System.out.println("x.value: " + x.value);
    }
}
