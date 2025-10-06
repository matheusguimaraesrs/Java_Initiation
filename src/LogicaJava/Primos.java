package LogicaJava;

public class Primos {
    public static void main(String[] args) {
        int num = 100;
        System.out.print("2 3 ");
        for (int i = 5; i <= num ; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.printf("%d ", i);
        }
    }
}