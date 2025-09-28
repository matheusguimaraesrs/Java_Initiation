//Multiplicação de dois arrays do mesmo tamanho
package Arrays;

import java.util.Scanner;

public class MultiplicacaoArray {
    public static void main(String[] args) {
        int[][] numArray = new int[2][2];
        var scanner = new Scanner(System.in);
        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                System.out.println("Digite o valor: ");
                numArray[i][j] = scanner.nextInt();
            }
        }
        int result1 = numArray[0][0] * numArray[0][1];
        int result2 = numArray[1][0] * numArray[1][1];
        System.out.println(numArray[0][0] + " * " + numArray[0][1] + " = " + result1);
        System.out.println(numArray[1][0] + " * " + numArray[1][1] + " = " + result2);
    }
}