//Faça um programa que calcule a média de 3 notas.
package InicianteJava;

import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String aluno = scanner.next();
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        double result = (nota1 + nota2 + nota3) / 3;
        System.out.println("------------------------------------");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("A média de " + aluno + " foi " + result);
    }
}
