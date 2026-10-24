import java.util.Scanner;
import java.util.Random;

public class EX08_AdivinheNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secreto = random.nextInt(20) + 1;
        int palpite = 0;
        int tentativas = 0;

        while (palpite != secreto) {
            System.out.println("Escreva seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < secreto) {
                System.out.println("O numero secreto é maior");
            } else if (palpite > secreto) {
                System.out.println("O numero secreto é menor");
            }
        }

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");

        scanner.close();
    }
}