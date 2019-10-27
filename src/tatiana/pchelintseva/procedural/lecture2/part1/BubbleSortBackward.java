package tatiana.pchelintseva.procedural.lecture2.part1;

import java.util.Arrays;

public class BubbleSortBackward {

    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = arr.length - 2; index >= barrier; index--) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
        }
    }
}


class BubbleSorteBackwardTest {
    public static void main(String[] args) {
        int[][] data = {
                {},
                {1},
                {0, 3, 2, 1},
                {4, 3, 1, 0},
                {6, 8, 3, 123, 5, 1, 2, 0, 9, 7},

        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + "->");
            BubbleSortBackward.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
