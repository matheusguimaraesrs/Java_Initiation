// Faça um programa que armazena 5 números em um array e exibe o maior.

package Arrays;

import java.util.Scanner;

public class MaiorNumArray {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[] numArray = new int[5];
        for (int i = 0; i < numArray.length; i++) {
            System.out.println("Digite um valor:");
            numArray[i] = scanner.nextInt();
        }
        System.out.println("----------------------------");
        System.out.print("Valores armazenados: ");
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------------");
        System.out.print("O maior número armazenado é: ");
        int maior = numArray[0];
        for (int i = 1; i < numArray.length; i++) {
            if (numArray[i] > maior) {
                maior = numArray[i];
            }
        }
        System.out.println(maior);
    }
}