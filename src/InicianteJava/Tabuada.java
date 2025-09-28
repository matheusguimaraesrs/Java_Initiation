package InicianteJava;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um de 1 a 10 número: ");
        int num = scanner.nextInt();
        if (num <= 10 && num > 0) {
            System.out.println("________________________________");
            System.out.println("Tabuáda de " + num);
            for (int i = 1; i <= 10; i++) {
                var result = num * i;
                System.out.printf("%s X %s = %s \n", num, i, result);
            }
        }else{
            System.out.println("___________________________________");
            System.out.println("Número Inválido");
            System.out.println("(Números válidos: de 1 a 10)");
        }
    }
}
