package tatiana.pchelintseva.procedural.lecture5;

import java.util.Arrays;

public class App2 {
    public static void main(String[] args) {
        int[] x = {0, 1, 2};
        int[] y = x;
        x[0] = 10;
        System.out.println("x=" + Arrays.toString(x));
        System.out.println("y=" + Arrays.toString(y));
    }
}
