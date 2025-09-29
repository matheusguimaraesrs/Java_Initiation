package InicianteJava;

import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o seu salário:");
        double salary = scanner.nextDouble();
        if (salary >= 2259.21 && salary <= 2826.65){
            salary = salary * (7.5/100); //7.5%
            System.out.println("Imposto: 7.5%");
            System.out.printf("A ser pago: %.2f", salary);
        } else if (salary > 2826.65 && salary <= 3751.05) {
            salary = salary * (15.0/100); //15%
            System.out.println("Imposto: 15%");
            System.out.printf("A ser pago: %.2f", salary);
        } else if (salary > 3751.05 && salary <= 4664.68) {
            salary = salary * (22.5/100); //22.5%
            System.out.println("Imposto: 22.5%");
            System.out.printf("A ser pago: %.2f", salary);
        } else if (salary > 4664.68) {
            salary = salary * (27.5/100); //27.5%
            System.out.println("Imposto: 27.5%");
            System.out.printf("A ser pago: %.2f", salary);
        } else
            System.out.println("Insento de Imposto!");
    }
}
