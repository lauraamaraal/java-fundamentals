import java.util.Scanner;
public class EX06_ValidacaoNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;

        do {
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida");
            } else {
                System.out.println("Nota registrada: " + nota);
            }

        } while (nota < 0 || nota > 10);
    }
}
