import java.util.Scanner;
public class EX05_ContagemDeTentativas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoCorreto = 2468;
        int tentativas = 3;
        int codigo = 0;

        while (tentativas > 0 && codigo != codigoCorreto) {
            System.out.println("Digite o código:");
            codigo = scanner.nextInt();

            if (codigo != codigoCorreto) {
                tentativas--;
                System.out.println("Código incorreto");
                System.out.println("Tentativas restantes: " + tentativas);
            } else {
                    System.out.println("Acesso permitido.");
                }
            }
        }
    }
