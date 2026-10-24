import java.util.Scanner;
public class EX07_TemperaturaSemanal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] temperaturas = new double[5];
        double soma = 0;
        int diasAcima25 = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = scanner.nextDouble();
            soma = soma + temperaturas[i];

            if (temperaturas[i] > 25) {
                diasAcima25++;
            }
        }

        double media = soma / 5;
        System.out.print("Temperaturas: ");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(temperaturas[i]);

            if (i < temperaturas.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Média da semana: " + media);
        System.out.println("Dias acima de 25 graus: " + diasAcima25);

        scanner.close();

        }
    }
