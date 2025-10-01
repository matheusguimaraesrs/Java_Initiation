package LogicaJava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[] fibonacci = {0, 1};
        int result, fim;
        System.out.println("-----SEQUÊNCIA DE FIBONNACI-----");
        System.out.println("Escolha uma posição da sequência:");
        fim = scanner.nextInt();
        for (int i = 1; i < fim; i++) {
            result = fibonacci[0] + fibonacci[1];
            if (i < fim - 1)
                System.out.printf("%d, ", result);
            else
                System.out.printf("%d. ", result);

            fibonacci[0] = fibonacci[1];
            fibonacci[1] = result;
        }
    }
}
