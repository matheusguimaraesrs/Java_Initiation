/*O fatorial de um número natural não negativo n, representado por n!,
é o produto de todos os números inteiros positivos de 1 até n.
Por exemplo, 4! = 4 × 3 × 2 × 1 = 24. Para calcular o fatorial de um número,
basta multiplicar esse número por todos os seus antecessores inteiros positivos até chegar ao número 1. */
package LogicaJava;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        long fac, result;
        System.out.println("Digite um número inteiro e positivo:");
        fac = scanner.nextInt();
        result = fac;
        if (fac > 0) {
            for (long i = fac - 1; i > 0; i--) {
                result = result * i;
            }
            System.out.println(fac+"! = "+result);
        } else
            System.out.println("ERROR: Número não compatível");
    }
}
