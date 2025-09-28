package Condicionais;

import java.util.Scanner;

public class NomeIdadeIfElse {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro nome: ");
        String nome1 = scanner.next();
        System.out.println("Digite o segundo nome: ");
        String nome2 = scanner.next();
        System.out.println("Qual é a idade de " + nome1 + "?");
        int ageNome1 = scanner.nextInt();
        System.out.println("Qual é a idade de " + nome2 + "?");
        int ageNome2 = scanner.nextInt();
        if (ageNome1 > ageNome2) {
            System.out.printf("A diferença de idade entre %s e %s é %s", nome1, nome2, ageNome1 - ageNome2);
        } else {
            System.out.printf("A diferença de idade entre %s e %s é %s", nome1, nome2, ageNome2 - ageNome1);
        }
    }
}
