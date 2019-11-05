package tatiana.pchelintseva.exceptions.lecture1;

public class App02 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            f();
            System.out.println();
        }
    }

    private static void f() {
        for (int k = 0; k < 2; k++) {
            System.err.print(0);
//            if (true) continue;          // прекращает выполнение данной итерации в цикле
//            if (true) break;             //больше не выполняем цикл
//            if (true) return;            // инструкция выхода из метода в соответстивии с типом возвращаемых данных
//            if (true) throw new Error(); // не ломает метод main
            ///ю
            System.err.print(2);
        }
    }
}
