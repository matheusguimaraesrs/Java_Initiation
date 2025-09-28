package Repeticao;

import java.util.Scanner;

public class ListaImparFor {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("---------------------------------");
        System.out.println("Lista somente com os impares");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
    }
}
