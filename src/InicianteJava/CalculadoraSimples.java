//Crie um programa que receba dois números e exiba a soma.
package InicianteJava;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numb1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numb2 = scanner.nextInt();
        int result = numb1 + numb2;
        System.out.println(numb1 + "+" + numb2 + "=" + result);
    }
}
