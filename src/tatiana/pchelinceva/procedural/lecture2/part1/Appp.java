package tatiana.pchelinceva.procedural.lecture2.part1;

public class Appp {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.print(i+j==4?"+":"-");
            }
            System.out.println();
        }
    }

}
