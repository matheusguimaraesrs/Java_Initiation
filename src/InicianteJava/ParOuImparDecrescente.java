package InicianteJava;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ParOuImparDecrescente {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Escolha entre par ou impar: ");
        String parOuImp = scanner.next();
        if (parOuImp.equalsIgnoreCase("par")) {
            if (num1 > num2) {
                for (int i = num1; i >= num2; i--) {
                    if (i % 2 == 1) continue;
                    System.out.println(i);
                }
            } else {
                for (int i = num2; i >= num1; i--) {
                    if (i % 2 == 1) continue;
                    System.out.println(i);
                }
            }
        }else if (parOuImp.equalsIgnoreCase("impar") || parOuImp.equalsIgnoreCase("ímpar")){
            if (num1 > num2) {
                for (int i = num1; i >= num2; i--) {
                    if (i % 2 == 0) continue;
                    System.out.println(i);
                }
            } else {
                for (int i = num2; i >= num1; i--) {
                    if (i % 2 == 0) continue;
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Operação Inválida");
        }
    }
}