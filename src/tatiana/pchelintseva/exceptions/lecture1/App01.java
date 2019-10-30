package tatiana.pchelintseva.exceptions.lecture1;

public class App01 {
    public static void main(String[] args) {
        try {
            int area = area(-10, 20);  // -10 , 10
            System.out.println(area);
        } catch (IllegalArgumentException e) {
            System.out.println("bad...");
        }
        System.out.println("next");
    }

    public static int area(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a < 0 || b < 0 == true");
        }
        return a * b;
    }
}
