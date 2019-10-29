package tatiana.pchelintseva.procedural.lecture5;
class IntHolder {
    public int value;
    public IntHolder(int value){
        this.value = value;
    }
}
public class App3 {
    public static void main(String[] args) {
        IntHolder x = new IntHolder(0);
        IntHolder y = x;
        x.value = 1;
        System.out.println("x.value: " + x.value);
        System.out.println("y.value: " + y.value);
    }
}
