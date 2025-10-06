/*A fórmula para calcular a área de uma circunferência é: area = π . raio2.
Considerando para este problema que π = 3.14159:
Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.*/

package LogicaJava;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        double pi = 3.14159;
        System.out.println("Digite o valor do raio:");
        double raio = scanner.nextDouble();
        double area = pi * (raio * raio);
        System.out.printf("A=%.4f\n",area);
    }
}
