package tatiana.pchelintseva.procedural.lecture1.part3;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class ArrayInverterRec {

    public static void main(String[] args) {

        testInvert(new int[]{});
        testInvert(new int[]{0});
        testInvert(new int[]{0, 1});
        testInvert(new int[]{0, 1, 2, 3, 4});

    }

    private static void testInvert(int[] arr) {
        System.out.print(Arrays.toString(arr) + "->");
        ArrayInverterRec.invetr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void invetr(int[] data) {
        for (int k = 0; k < data.length / 2; k++) {
            int tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;
        }
    }


    public static void invertRec(int[] data, int k) {
        if (k < data.length / 2 - 1) {
            int tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;
            invertRec(data, k + 1);
        }
    }

}
