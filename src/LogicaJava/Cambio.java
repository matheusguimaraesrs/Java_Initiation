package LogicaJava;

import java.util.Scanner;

public class Cambio {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        double dolar = 5.31;
        double value;

        System.out.println("-----CONVERSOR REAL x DOLAR-----");
        System.out.println("Deseja converter Real ou Dolar?");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("real")){
            System.out.println("Insira o valor em Reais:");
            value = scanner.nextDouble();
            value /= dolar;
            System.out.printf("US$%.2f", value);
        } else if (choice.equalsIgnoreCase("dolar")) {
            System.out.println("Insira o valor em Dolar:");
            value = scanner.nextDouble();
            value *= dolar;
            System.out.printf("R$%.2f", value);
        }else
            System.out.println("Moeda não identificada...");
    }
}
