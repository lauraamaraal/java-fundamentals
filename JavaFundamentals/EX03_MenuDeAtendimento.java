import java.util.Scanner;
public class EX03_MenuDeAtendimento {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("=== atendimento ===");
        System.out.println("1 - Vendas");
        System.out.println("2 - Suporte");
        System.out.println("3 - Financeiro");
        System.out.println("4 - Encerrar");
        System.out.println();
        System.out.println("Escolha uma opção: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu Vendas.");
                break;

            case 2:
                System.out.println("Você escolheu Suporte.");
                break;

            case 3:
                System.out.println("Você escolheu Financeiro.");
                break;

            case 4:
                System.out.println("Atendimento encerrado. Até mais!.");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
        scanner.close();
    }
}
