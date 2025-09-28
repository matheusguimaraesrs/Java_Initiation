package InicianteJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SomaDivisiveis {
    public static boolean somaDiv(List<Integer> num){
        int i = 0;
        int j = 9;
        for (i = 0; i < num.toArray().length; i++) {
            if (!(num.getFirst() < num.getLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 10, 6, 7, 8, 9);
        System.out.println(somaDiv(num));
    }
}