package LogicaJava;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        int alt, base, area;
        var scanner = new Scanner(System.in);

        System.out.println("Digite a altura (m) do triângulo:");
        alt = scanner.nextInt();
        System.out.println("Digite a base (m) do triângulo:");
        base = scanner.nextInt();
        area = (alt * base) / 2;
        System.out.println("A área do triângulo é "+area+"m²");
    }
}
