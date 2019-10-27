package tatiana.pchelintseva.procedural.lecture2.part1;

public class App10 {
    public static void main(String[] args) {
        int[] arr= {0, 10, 20, 30, 40};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
