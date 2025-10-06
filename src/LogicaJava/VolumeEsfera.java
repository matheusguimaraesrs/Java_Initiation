package LogicaJava;
import java.util.Scanner;

public class VolumeEsfera {
    public static double aoCubo(double raio){
            double cubo = raio;
            for (int i = 0; i < 3; i++) {
                cubo = cubo * raio;
                i++;
            }
            return cubo;
        }
        public static void main(String[] args) {
            var scanner = new Scanner(System.in);
            double pi = 3.14159;
            System.out.println("Insira o valor do raio: ");
            double raio = scanner.nextDouble();
            double vol = (4/3.0) * pi * (aoCubo(raio));
            System.out.printf("VOLUME = %.3f\n", vol);
        }
    }
