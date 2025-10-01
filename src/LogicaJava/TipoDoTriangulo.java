package LogicaJava;

import java.util.Scanner;

public class TipoDoTriangulo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Primeiro valor do triângulo:");
        a = scanner.nextInt();
        System.out.println("Segundo valor do triângulo:");
        b = scanner.nextInt();
        System.out.println("Terceiro valor do triângulo:");
        c = scanner.nextInt();
        if (a == b && b == c)
            System.out.println("Triângulo Equilátero");
        else if (a != b && a != c && b != c)
            System.out.println("Triângulo Escaleno");
        else
            System.out.println("Triângulo Isósceles");
    }
}
