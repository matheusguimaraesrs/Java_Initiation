package Repeticao;

import java.util.Scanner;

public class ContadorForWhile {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String continuar = "s";
        while (continuar.equalsIgnoreCase("s")){
            System.out.println("Até quanto quer que eu conte?");
            int cont = scanner.nextInt();
            for (int i = 0; i <=cont; i++) {
                System.out.println(i);
            }
            System.out.println("Deseja continuar? (s/n)");
            continuar = scanner.next();
        }
        System.out.println("Programa Finalizado");
    }
}
