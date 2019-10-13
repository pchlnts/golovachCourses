package tatiana.pchelinceva.procedural.lecture2.part1;

public class Selector {
    public static void sort(int [] arr) {
        for (int barrier = 0; barrier < arr.length -1 ; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++){
                if(arr[barrier] > arr[index]){
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] data = {
                {},
                {1},
                {2, 1},
                {4, 6, 2},
                {5, 7, 4, 8},
        };

    }
}
