package tatiana.pchelintseva.procedural.lecture5;

import java.util.Arrays;

public class App2 {
    public static void main(String[] args) {
        int[] x = {0, 1, 2};
        int[] y = x;
        x[0] = 10;
        System.out.println("x=" + Arrays.toString(x));      //Here would be 10, 1, 2
        System.out.println("y=" + Arrays.toString(y));      //Here would be 10, 1, 2
    }
}
