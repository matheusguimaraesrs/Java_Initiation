//Calculadora simples com switch: +, -, *, /.
package Condicionais;

import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("digite o segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Escolha o operador aritmétrico: +,-,*,/");
        String oper = scanner.next();
        switch (oper) {
            case "+":
                var resultmais = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultmais);
                break;
            case "-":
                var resultmenos = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultmenos);
                break;
            case "*":
                var resultvezes = num1 * num2;
                System.out.println(num1 + " x " + num2 + " = " + resultvezes);
                break;
            case "/":
                var resultdiv = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + resultdiv);
                break;
        }
    }
}
