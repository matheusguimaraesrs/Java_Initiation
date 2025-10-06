package LogicaJava;

public class Potencia {
    public static void main(String[] args) {
        int base = 5;
        int elevado = 3;
        int result = base;
        for (int i = 1; i < elevado; i++) {
            result *= base;
        }
        System.out.printf("%d^%d = %d",base, elevado, result);
    }
}
