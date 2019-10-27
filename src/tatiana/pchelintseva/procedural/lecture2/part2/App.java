package tatiana.pchelintseva.procedural.lecture2.part2;

public class App {
    public static void main(String[] args) {
        byte[] array = new byte [1000000];
        testArrayCopy(array);
        testFor(array);
    }
    private  static  void testArrayCopy(byte[] array){
        long start = System.nanoTime();
        System.arraycopy(array,0,array,1, array.length - 1 );
        long stop = System.nanoTime();
        System.out.printf("arrayCopy:%,10d\n",stop - start);
        
    }
    private  static  void  testFor(byte[] array){
        long start = System.nanoTime();
        for (int k = 0; k <array.length-2; k++) {
            array[k+1]=array[k];
        }
        long stop = System.nanoTime();
        System.out.printf("for:       %,10d\n", stop-start);
    }
}


