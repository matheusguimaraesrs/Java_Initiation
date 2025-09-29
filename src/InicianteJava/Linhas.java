package InicianteJava;

public class Linhas {
    public static void main(String[] args) {
        char s = '*';
        int n = 4;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.printf("%c", s);
            }
            System.out.println();
        }
    }
}
