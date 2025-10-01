package LogicaJava;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura");
        double alt = scanner.nextDouble();
        double imc = peso / (alt * alt);
        System.out.println("---------------------");
        System.out.printf("Resultado IMC: %.2f%n",imc);
        if (imc <= 18.5D) {
            System.out.println("Abaixo do peso");
        } else if (imc > 18.6D && imc < 24.9D) {
            System.out.println("Peso ideal");
        } else if (imc > 25.0D && imc < 29.9D) {
            System.out.println("Levemente acima do peso");
        } else if (imc > 30.0D && imc < 34.9D) {
            System.out.println("Obesidade Grau I");
        } else if (imc > 35.0D && imc < 39.9D) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        }
    }
}