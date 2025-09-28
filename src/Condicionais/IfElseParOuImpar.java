//Programa que diga se o número é par ou ímpar.
package Condicionais;

import java.util.Scanner;

public class IfElseParOuImpar {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " é par");
        }else{
            System.out.println(num + " é impar");
        }
    }
}
