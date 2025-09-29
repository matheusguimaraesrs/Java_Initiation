package Repeticao;

import java.util.Scanner;

public class RestoDiferenteZero {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o divisor: ");
        var num = scanner.nextInt();
        var verificador = true;
        while (verificador) {
            System.out.println("Digite o divisível: ");
            var num2 = scanner.nextInt();
            if (num2 < num) {
                System.out.println("Digite um valor maior que " + num);
                continue;
            }
            var result = num2 % num;
            verificador = result == 0;
            System.out.printf("O resto da divisão entre %s e %s é %s \n", num, num2, result);
        }
    }
}
